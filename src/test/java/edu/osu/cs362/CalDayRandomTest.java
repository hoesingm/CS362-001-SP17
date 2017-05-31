package edu.osu.cs362;

import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

	  	long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

	  	System.out.println("Start testing...");
		 
		 
		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed =10;

			Random random = new Random(randomseed);
	  
	  		int year = 2017;
	  		int month = 9;
	  		int dayOfMonth = 22;
	  		GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  		CalDay day = new CalDay(cal);

			int startHour = 12;
		 	int startMinute = 30;
			int startDay=15;
	 		int startMonth=6;
	 		int startYear=2017;

			String title="Birthday Party";
			String description="This is my birthday party.";
			//Construct a new Appointment object with the initial data	 
			Appt appt = new Appt(startHour,
		        startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

				
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = CalDayRandomTest.RandomSelectMethod(random);

					if(methodName.equals("addAppt")){
						startHour = ValuesGenerator.getRandomIntBetween(random, -12,36);
						appt.setStartHour(startHour);
						day.addAppt(appt);

						startHour = ValuesGenerator.getRandomIntBetween(random, -12,36);
						appt.setStartHour(startHour);
						day.addAppt(appt);
					}
			}

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
	        if((iteration%10000)==0 && iteration!=0 )
	            System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}

		System.out.println("Done testing...");	 
	 }	
}
