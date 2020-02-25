
public class LSData {
	
	private String stage;
	private String day;
	private String time;
	private String area;
	public LSData(String stage, String day, String time, String area){
		this.stage=stage;
		this.day=day;
		this.time=time;
		this.area=area;
	}
	
	public String getStage() {
		return stage;
	}
	public String getDay() {
		return day;
	}
	public String getTime() {
		return time;
	}
	public String getArea() {
		return area;
	}
}
