package io.javabrains.moviecatalogservice.modal;

import java.util.List;

public class UserRating {
	
	private String userId;
	private List<Rating> ratings;
	
	
	
	public UserRating() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public UserRating(String userId, List<Rating> ratings) {
		super();
		this.userId = userId;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "UserRating [userId=" + userId + ", ratings=" + ratings + "]";
	}
	
	

}
