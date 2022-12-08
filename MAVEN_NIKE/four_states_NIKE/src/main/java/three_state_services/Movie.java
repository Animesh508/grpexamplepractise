package three_state_services;

public class Movie {
	private Integer movieCode;
	private String movieName;
	private String directBy;
	private String wriitenBy;
	private String producedBy;
	private String leadCasting;
	private String musicBy;
	private String production;
	
	public Movie() {}

	public Movie(Integer movieCode, String movieName, String directBy, String wriitenBy, String producedBy,
			String leadCasting, String musicBy, String production) {
		super();
		this.movieCode = movieCode;
		this.movieName = movieName;
		this.directBy = directBy;
		this.wriitenBy = wriitenBy;
		this.producedBy = producedBy;
		this.leadCasting = leadCasting;
		this.musicBy = musicBy;
		this.production = production;
	}

	public Integer getMovieCode() {
		return movieCode;
	}

	public void setMovieCode(Integer movieCode) {
		this.movieCode = movieCode;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectBy() {
		return directBy;
	}

	public void setDirectBy(String directBy) {
		this.directBy = directBy;
	}

	public String getWriitenBy() {
		return wriitenBy;
	}

	public void setWriitenBy(String wriitenBy) {
		this.wriitenBy = wriitenBy;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getLeadCasting() {
		return leadCasting;
	}

	public void setLeadCasting(String leadCasting) {
		this.leadCasting = leadCasting;
	}

	public String getMusicBy() {
		return musicBy;
	}

	public void setMusicBy(String musicBy) {
		this.musicBy = musicBy;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	@Override
	public String toString() {
		return "Movie [movieCode=" + movieCode + ", movieName=" + movieName + ", directBy=" + directBy + ", wriitenBy="
				+ wriitenBy + ", producedBy=" + producedBy + ", leadCasting=" + leadCasting + ", musicBy=" + musicBy
				+ ", production=" + production + "]";
	}
	
	

}
