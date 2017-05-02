package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */

    // CHECK IN-BOUND CASES
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // CHECK UNDER LOWER-BOUND CASES
	 // startHour under bound
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=-1;
		 int startMinute=-1;
		 int startDay=0;
		 int startMonth=0;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(-1, appt.getStartHour());
		 assertEquals(-1, appt.getStartMinute());
		 assertEquals(0, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // startMinute under bound
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=12;
		 int startMinute=-1;
		 int startDay=0;
		 int startMonth=0;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(-1, appt.getStartMinute());
		 assertEquals(0, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
	
	// startDay under bound
	@Test
	  public void test04()  throws Throwable  {
		 int startHour=12;
		 int startMinute=3;
		 int startDay=0;
		 int startMonth=0;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(3, appt.getStartMinute());
		 assertEquals(0, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	// startMonth under bound
	@Test
	  public void test05()  throws Throwable  {
		 int startHour=12;
		 int startMinute=3;
		 int startDay=4;
		 int startMonth=0;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(3, appt.getStartMinute());
		 assertEquals(4, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription()); 
		}

	 // CHECK OVER UPPER-BOUND CASES
	 // startHour over bound
	 @Test
	  public void test06()  throws Throwable  {
		 int startHour=24;
		 int startMinute=60;
		 int startDay=32;
		 int startMonth=13;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(24, appt.getStartHour());
		 assertEquals(60, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // startMinute over bound
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=22;
		 int startMinute=60;
		 int startDay=32;
		 int startMonth=13;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(22, appt.getStartHour());
		 assertEquals(60, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // startDay over bound
	 @Test
	  public void test08()  throws Throwable  {
		 int startHour=22;
		 int startMinute=30;
		 int startDay=32;
		 int startMonth=13;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(22, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // startMonth over bound
	 @Test
	  public void test09()  throws Throwable  {
		 int startHour=22;
		 int startMinute=30;
		 int startDay=30;
		 int startMonth=13;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(22, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(30, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // test setters
	 @Test
	  public void test10()  throws Throwable  {
	  	 int startHour=22;
		 int startMinute=30;
		 int startDay=30;
		 int startMonth=11;
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
		 // setters, failure in here somewhere
	  	appt.setStartHour(11);
	  	appt.setStartMinute(22);
	  	appt.setStartDay(33);
	  	appt.setStartMonth(10);
	  	appt.setStartYear(2016);
	  	appt.setTitle("Test String");
	  	appt.setDescription("Description Test String");

	  	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(11, appt.getStartHour());
		 assertEquals(22, appt.getStartMinute());
		 assertEquals(33, appt.getStartDay());
		 assertEquals(10, appt.getStartMonth());
		 assertEquals(2016, appt.getStartYear());
		 assertEquals("Test String", appt.getTitle());
		 assertEquals("Description Test String", appt.getDescription());
	  }

	   // test string null cases
	  @Test
	  public void test11()  throws Throwable  {
	  	 int startHour=22;
		 int startMinute=30;
		 int startDay=30;
		 int startMonth=11;
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
		 // setters
	  	appt.setTitle(null);
	  	appt.setDescription(null);

	  	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(22, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(30, appt.getStartDay());
		 assertEquals(11, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());
	  }

	  // test toString()
	  @Test
	  public void test12()  throws Throwable  {
	  	 int startHour=22;
		 int startMinute=30;
		 int startDay=30;
		 int startMonth=11;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 String day;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(22, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(30, appt.getStartDay());
		 assertEquals(11, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 assertEquals("\t11/30/2017 at 10:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		}

}
