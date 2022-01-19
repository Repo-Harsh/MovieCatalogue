package io.javabrains.movieinfoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {
	
	@Autowired
	private RestTemplate rt;
	
	@Value("${api.key}")
	String apikey;
	
	@GetMapping("/{movieId}")
	public MovieItems fetchMOvieById(@PathVariable String movieId){
		MovieSummaryTMDB movieSummaryTMDB =  rt.getForObject("https://api.themoviedb.org/3/movie/"+movieId
				+"?api_key="+apikey, MovieSummaryTMDB.class);
		
		return new MovieItems(movieSummaryTMDB.getTitle(), movieId, movieSummaryTMDB.getOverview());
	}

}
