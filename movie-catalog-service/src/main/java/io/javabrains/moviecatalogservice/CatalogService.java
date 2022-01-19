package io.javabrains.moviecatalogservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.javabrains.moviecatalogservice.modal.CatalogItem;
import io.javabrains.moviecatalogservice.modal.MovieItems;
import io.javabrains.moviecatalogservice.modal.Rating;
import io.javabrains.moviecatalogservice.modal.UserRating;

@Service
public class CatalogService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	WebClient.Builder webBuilder;
	
	public List<CatalogItem> connectToMovieInfo(String userId){
		String MOVIEURL="http://MOVIE-INFO-SERVICE/movie/";
		String RATINGURL="http://RATING-INFO-SERVICE/rating/user/";
		
		//use userId to get all ratings for different movieID.
		return restTemplate.getForObject(RATINGURL+userId, UserRating.class).getRatings().stream()
		.map(it -> {
			//use each Rating objects movieId to fetch respective movieDeatils
			MovieItems responseEntity = restTemplate.getForObject(MOVIEURL+it.getMovieID(), MovieItems.class);
			//collate movieRating from Rating and Moviename and Desc from MovieItems and put into Catalog
			return new CatalogItem(responseEntity.getMovieName(), responseEntity.getMovieDesc(), it.getMovieRating());
		}).collect(Collectors.toList());
		
		
	}
	
	public List<CatalogItem> connectToMovieInfoUsingWebClient(String userId){
		String MOVIEURL="http://localhost:8081/movie/";
		
		//use userId to get all ratings for different movieID.
		List<Rating> ratedlist = Arrays.asList(
				new Rating("4", "12"),
				new Rating("5","34"));
		
		
		//use each Rating objects movieId to fetch respective movieDeatils
		//collate movieRating from Rating and Moviename and Desc from MovieItems and put into Catalog
		return ratedlist.stream()
		.map(it -> {
			MovieItems responseEntity = webBuilder.build()
												  .get()
												  .uri(MOVIEURL+it.getMovieID())
												  .retrieve()
												  .bodyToMono(MovieItems.class)
												  .block();
			return new CatalogItem(responseEntity.getMovieName(), responseEntity.getMovieDesc(), it.getMovieRating());
		}).collect(Collectors.toList());
		
		
	}

}
