package io.javabrains.movieinfoservice;

public class MovieItems {
	
	private String movieName;
	private String movieID;
	private String movieDesc;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	
	public MovieItems(String movieName, String movieID, String movieDesc) {
		super();
		this.movieName = movieName;
		this.movieID = movieID;
		this.movieDesc = movieDesc;
	}
	@Override
	public String toString() {
		return "MovieItems [movieName=" + movieName + ", movieID=" + movieID + ", movieDesc=" + movieDesc + "]";
	}
	
	
	
	
	
}
