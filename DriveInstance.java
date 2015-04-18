
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
	 * String: duration
	 * double: distance
	 *  
	 */
	
	private String date = "";
	private String startTime = "";
	private String endTime = "";
	private String duration = "";
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
}
