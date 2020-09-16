package model;

public class City
{
	private long cityid;
	private String cityname;
	
	public City(long cityId, String cityName) {
		super();
		this.cityid = cityId;
		this.cityname = cityName;
	}
	
	public long getCityId() {
		return cityid;
	}

	public void setCityId(long cityId) {
		this.cityid = cityId;
	}

	public String getCityName() {
		return cityname;
	}

	public void setCityName(String cityName) {
		this.cityname = cityName;
	}
	
	
}
