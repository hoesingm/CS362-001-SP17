package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription","setStartHour","setStartMinute","setStartDay","setStartMonth"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 int startHour = 12;
		 int startMinute = 30;
		 int startDay=15;
		 int startMonth=6;
		 int startYear=2017;
		 int count = 0;

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



		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;

				Random random = new Random(randomseed);				

				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){					   
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}

					   if (methodName.equals("setDescription")){
					   		if(count == 0) {
					   			appt.setDescription(null);
					   			count++;
					   		}		

						   String newDescription=(String) ValuesGenerator.getString(random);
						   appt.setDescription(newDescription);						   
						}

						if(methodName.equals("setStartHour")){
							startHour = ValuesGenerator.getRandomIntBetween(random, -12,36);  	
					    	appt.setStartHour(startHour);
						}

						if(methodName.equals("setStartMinute")){
							appt.setStartHour(12);
							startMinute = ValuesGenerator.getRandomIntBetween(random, -30,90);	
					    	appt.setStartMinute(startMinute);
						}

						if(methodName.equals("setStartDay")){
							appt.setStartHour(12);
							appt.setStartMinute(30);
							startDay = ValuesGenerator.getRandomIntBetween(random, -16,48);  	
					    	appt.setStartDay(startDay);
						}

						if(methodName.equals("setStartMonth")){
							appt.setStartHour(12);
							appt.setStartMinute(30);
							appt.setStartDay(16);
							startMonth = ValuesGenerator.getRandomIntBetween(random, -12,24); 	
					    	appt.setStartMonth(startMonth);
					    }
						
				}

				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 

	 		}
	 
		 System.out.println("Done testing...");
	 }


	
}
