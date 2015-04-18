
public class DriveInstance 
{
	
	/*
	 * Created by Jordan Mather 4/17/15
	 *This class sets up the structure for tracking all the information needed by the program.
	 *This includes:
	 * String: date
	 * String: startTime
	 * String: endTime
	 * double: latStartCoordinate
	 * double: lonStartCoordinate
	 * double: latEndCoordinate
	 * double: lonEndCoordinate
	 * double: distance
	 *  
	 */
	
	
	
	private String date = "";
	private String startTime = "";
	private String endTime = "";
	private double latStartCoordinate;
	private double lonStartCoordinate;
	private double latEndCoordinate;
	private double lonEndCoordinate;
	private double distance;
	
	
	public DriveInstance(String date, String startTime, double latStartCoordinate, double lonStartCoordinates)
	{
		//when an instance of this class is made, set the date, startTime, and the StartCoordinates
		this.date = date;
		this.startTime = startTime;
		this.latStartCoordinate = latStartCoordinate;
		this.lonStartCoordinate = lonStartCoordinates;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public double getLatStartCoordinate() {
		return latStartCoordinate;
	}


	public void setLatStartCoordinate(double latStartCoordinate) {
		this.latStartCoordinate = latStartCoordinate;
	}


	public double getLonStartCoordinate() {
		return lonStartCoordinate;
	}


	public void setLonStartCoordinate(double lonStartCoordinate) {
		this.lonStartCoordinate = lonStartCoordinate;
	}


	public double getLatEndCoordinate() {
		return latEndCoordinate;
	}


	public void setLatEndCoordinate(double latEndCoordinate) {
		this.latEndCoordinate = latEndCoordinate;
	}


	public double getLonEndCoordinate() {
		return lonEndCoordinate;
	}


	public void setLonEndCoordinate(double lonEndCoordinate) {
		this.lonEndCoordinate = lonEndCoordinate;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public String toJson()
	{
		//hopefully we can use a json implementation from someone else to write to and read
		//from json instead of doing it ourselves, which is why I only put the general 
		//format here.
		
		
		//returns a json representation of this object
		//the structure should be something like this:
		/*
		 * DriveInstance:
		 * {
		 * 	"date":"this.date";
		 * 	"time":
		 * 		{
		 * 			"startTime":"this.startTime";
		 * 			"endTime":"this.endTime";
		 * 		}
		 * 	"startCoordinates":
		 * 		{
		 * 			"latitude":this.latStartCoordinate;
		 * 			"longitude":this.lonStartCoordiate;
		 * 		}
		 * 	"endCoordinates":
		 * 		{
		 * 			"latitude":this.latEndCoordiante;
		 * 			"longitude:this.lonEndCoordinate;
		 * 		}
		 * 	"distance":this.distance;
		 * }
		 */
	}
}
