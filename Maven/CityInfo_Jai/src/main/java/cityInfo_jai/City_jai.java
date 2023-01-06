package cityInfo_jai;

public class City_jai {
	private Integer CityCode;
	private String CityName;
	private String CityState;
	private Integer CityPin;
	
	City_jai(){}

	public City_jai(Integer cityCode, String cityName, String cityState, Integer cityPin) {
		super();
		CityCode = cityCode;
		CityName = cityName;
		CityState = cityState;
		CityPin = cityPin;
	}

	public Integer getCityCode() {
		return CityCode;
	}

	public void setCityCode(Integer cityCode) {
		CityCode = cityCode;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public String getCityState() {
		return CityState;
	}

	public void setCityState(String cityState) {
		CityState = cityState;
	}

	public Integer getCityPin() {
		return CityPin;
	}

	public void setCityPin(Integer cityPin) {
		CityPin = cityPin;
	}

	@Override
	public String toString() {
		return "City_jai [CityCode=" + CityCode + ", CityName=" + CityName + ", CityState=" + CityState + ", CityPin="
				+ CityPin + "]";
	}
	

}
