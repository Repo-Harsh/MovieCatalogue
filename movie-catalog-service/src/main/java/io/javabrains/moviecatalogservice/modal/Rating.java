package io.javabrains.moviecatalogservice.modal;

public class Rating {
	
	private String movieRating;
	private String movieID;
	
	
	public Rating() {
		super();
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public Rating(String movieRating, String movieID) {
		super();
		this.movieRating = movieRating;
		this.movieID = movieID;
	}
	@Override
	public String toString() {
		return "Rating [movieRating=" + movieRating + ", movieID=" + movieID + "]";
	}
	
	
	

}
