package io.javabrains.ratinginfoservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@GetMapping("/{movieId}")
	public Rating fetchRatingByMovieId(@PathVariable String movieId) {
		return new Rating("5", movieId);
	}

	@GetMapping(value="/user/{userId}")
	public UserRating fetchRatingbyUser(@PathVariable String userId){
	List<Rating> ratings= Arrays.asList(
				new Rating("4", "100"),
				new Rating("5", "200"),
				new Rating("4", "150"));
	
	return new UserRating(userId, ratings);
	}
}
