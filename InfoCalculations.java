import java.util.LinkedList;


public class InfoCalculations 
{
	/*
	 * Created by Jordan Mather 9:36 4/17/15
	 * The contents of this class might end up needing to be split into different classes
	 * this class will server as a way to outline the methods to be implemented
	 */
	LinkedList<String> saveData;

	public InfoCalculations(LinkedList<String> saveData)
	{
		//assume the data can be passed as a LinkedList of strings 
		//where each index is a different instance of DriveInstance
		this.saveData = saveData;
	}

	private double totalDriveDistance()
	{
		//i'm using this varaible enough that I should write a separate method for it
		double totalDistance = 0;
		for(int i = 0; i < saveData.size(); i++)//for each index of saveData
		{
			//grab the total distance
			totalDistance += saveData.get(i).get("distance"); //.get("distance") to be replaced by whatever method we use to grab a variable from an jsonObject
		}
		return totalDistance;
	}

	public double averageDriveDistance()
	{

		//when we have the total for the distance travelled
		double averageDistance = this.totalDriveDistance()/saveData.size();
		return averageDistance;
	}

	public double averageDayDriveDistance(String day)
	{
		/*
		 * takes a day of the week and finds the average distance driven on that day of the week
		 */
		int dayCount = 0;  //total days run through
		String currentDate = "";
		double totalDistance = 0;
		for(int i = 0; i < saveData.size(); i++)
		{
			//figures out the number of days, then averages the total by that number
			if(day.equals(saveData.get(i).get("day")))
			{
				if(currentDate.equals(""))
				{
					//if there is no current date, we must have just started; set the variable
					currentDate = saveData.get(i).get("date"); //.get("date") to be replaced
					totalDistance += saveData.get(i).get("distance");
				}
				else if(currentDate.equals(saveData.get(i).get("date")))
				{
					//it's the same date, so add this distance to the total distance
					totalDistance += saveData.get(i).get("distance");
				}
				else
				{
					//it's a different date, so set the currentDate to this one,
					//increment the days counter;
					currentDate = saveData.get(i).get("date");
					dayCount++;
					//add this drive to the total distance
					totalDistance += saveData.get(i).get("distance");
				}
			}

		}
		//after all the indexes of saveData have been run through
		//clean up by increment the days counter
		dayCount++;
		//get the average by dividing the total distance by the days
		double averageDistancePerDay = this.totalDriveDistance()/dayCount;
	}

	/**
	 * this method takes a String date (formatted mm/dd/yyyy) and returns the 
	 * average drive distance for that week.  The week is considered to be the Sunday-Saturday
	 * selection of seven days that the date is contained in.
	 *  
	 * @param date
	 * @return the average distance traveled as a double
	 */
	public boolean averageWeekDriveDistance(String date)
	{
		int count = 0;
		double totalDistance = 0;

		String beginningOfWeek = "";
		String endOfWeek = "";

		//find the specified week
		for(int i = 0; i < saveData.size(); i++)
		{
			String dateToCheck = saveData.get(i).get("date");
			if(dateToCheck.equals(date))
			{
				//we have found the date, now to find the beginning and end of the week 
			}
		}
	}


	public double averageMonthDriveDistance(int twoDigitMonth, int fourDigitYear)
	{
		//Setup variables
		int count = 0;
		double totalDistance = 0;
		//find the total amount driven during the given month, then divide by the number of drives
		for(int i = 0; i < saveData.size(); i++)
		{


			//determine if the date is in the correct month
			String date = saveData.get(i).get("date");
			String[]checkDate = date.split("/"); //the month will be at index 0, the year at index 2
			if(Integer.parseInt(checkDate[0]) == twoDigitMonth && 
					Integer.parseInt(checkDate[2]) == fourDigitYear)
			{
				//this is the correct month and year, continue
				//each time, increment the count and add to the totalDistance
				count++;
				totalDistance += saveData.get(i).get("distance");
			}
			else
			{
				//check for break conditions
				if(Integer.parseInt(checkDate[2]) > fourDigitYear || 
						(Integer.parseInt(checkDate[2]) == fourDigitYear 
						&& Integer.parseInt(checkDate[0]) > twoDigitMonth))
				{
					//we passed the month, no point in continuing checking
					break;
				}

			}
		}
		//we have the total distance
		double averageDistance = totalDistance/count;
		return averageDistance;

	}

	public double averageYearDriveDistance(int fourDigitYear)
	{
		//Setup variables
		int count = 0;
		double totalDistance = 0;
		//find the total amount driven during the given month, then divide by the number of drives
		for(int i = 0; i < saveData.size(); i++)
		{


			//determine if the date is in the correct month
			String date = saveData.get(i).get("date");
			String[]checkDate = date.split("/"); //the month will be at index 0, the year at index 2
			if(Integer.parseInt(checkDate[2]) == fourDigitYear)
			{
				//this is the correct year, continue
				//each time, increment the count and add to the totalDistance
				count++;
				totalDistance += saveData.get(i).get("distance");
			}
			else
			{
				//check for break conditions
				if(Integer.parseInt(checkDate[2]) > fourDigitYear)
				{
					//we passed the year, no point in continuing checking
					break;
				}

			}
		}
		//we have the total distance
		double averageDistance = totalDistance/count;
		return averageDistance;

	}
	
	public String averageTimeDriven()
	{
		//when we have the total for the distance travelled
				String averageTime = this.totalTime()/saveData.size();
				return averageTime;
	}
	
	/**
	 * returns the total time driven in the save file in minutes
	 * @return
	 */
	private int totalTime()
	{
		//i'm using this varaible enough that I should write a separate method for it
		int totalTime = 0;
		for(int i = 0; i < saveData.size(); i++)//for each index of saveData
		{
			//get the start time
			String startTime = saveData.get(i).get("startTime");
			//get the end time
			String endTime = saveData.get(i).get("endTime");
			//****CONTINUE
			//total time in minutes
		}
	}

	

}
