package io.javabrains.moviecatalogservice.modal;

public class CatalogItem {
	
		private String movieName;
		private String movieDesc;
		private String movieRating;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public CatalogItem(String movieName, String movieDesc, String movieRating) {
		super();
		this.movieName = movieName;
		this.movieDesc = movieDesc;
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "CatalogItem [movieName=" + movieName + ", movieDesc=" + movieDesc + ", movieRating=" + movieRating
				+ "]";
	}
	
	
	

}
