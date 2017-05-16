package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	// invalid CalDay constructor test
	 @Test
	  public void test01()  throws Throwable  {
	  	CalDay day = new CalDay();
	  	assertFalse(day.isValid());
	 }

	 // CalDay constructor test
	 @Test
	  public void test02()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);
	  	assertTrue(day.isValid());
	  	assertEquals(2017, day.getYear());
	  	assertEquals(9, day.getMonth());
	  	assertEquals(22, day.getDay());
	 }

	 // addAppt(Appt appt) invalid day test
	 @Test
	  public void test03()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

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

		day.addAppt(appt);
		assertTrue(day.isValid());

	}

	// addAppt(Appt appt) valid day test
	 @Test
	  public void test04()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	int startHour=11;
		int startMinute=45;
		int startDay=22;
		int startMonth=10;
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

		day.addAppt(appt);
		assertTrue(day.isValid());

	}

	// addAppt(Appt appt) valid day test, more than 1 day condition
	 @Test
	  public void test05()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	int startHour=10;
		int startMinute=45;
		int startDay=22;
		int startMonth=10;
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

		day.addAppt(appt);
		assertEquals(10,appt.getStartHour());

		int startHourT = 3;
		Appt apptTwo = new Appt(startHourT,
		          startMinute ,
		          startDay,
		          startMonth ,
		          startYear,
		          title,
		         description);

	
		day.addAppt(apptTwo);
		assertEquals(3,apptTwo.getStartHour());

	}

	// getSizeAppts() test
	@Test
	  public void test06()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	int size = 0;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	int startHour=10;
		int startMinute=45;
		int startDay=22;
		int startMonth=10;
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

		day.addAppt(appt);
		day.addAppt(appt);
		day.addAppt(appt);
	  	assertEquals(3, day.getSizeAppts());
	}

	// toString() test itr.hasNext() is false
	@Test
	  public void test07()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	String header = day.toString();
	  	
	  	assertTrue(day.isValid());
	}

	// toString() test itr.hasNext() is true
	@Test
	  public void test10()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	int startHour=10;
		int startMinute=45;
		int startDay=22;
		int startMonth=10;
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

		day.addAppt(appt);
		assertEquals(10,appt.getStartHour());

		int startHourT = 3;
		Appt apptTwo = new Appt(startHourT,
		          startMinute ,
		          startDay,
		          startMonth ,
		          startYear,
		          title,
		         description);

	
		day.addAppt(apptTwo);
		assertEquals(3,apptTwo.getStartHour());

		String header = day.toString();

	  	assertTrue(day.isValid());
	}

	// toString called on an invalid day.
	@Test
	  public void test08()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay();

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

		day.addAppt(appt);
		String header = day.toString();
		assertFalse(day.isValid());
	}

	@Test
	  public void test09()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

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

		day.addAppt(appt);
		day.iterator();
		assertNotNull(day);
	}

	@Test
	  public void test11()  throws Throwable  {
	  	CalDay day = new CalDay();
		assertNull(day.iterator());
	}

	 // addAppt(Appt appt) mutation tests BROKEN
	 @Test
	  public void test12()  throws Throwable  {
	  	int i = 0;
	  	int size = 0;
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	int startHour=9;
		int startMinute=22;
		int startDay=22;
		int startMonth=10;
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

		day.addAppt(appt);
		day.addAppt(appt);
		day.addAppt(appt);
	}

	// test mutated iterator()
	@Test
	  public void test13()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);
		assertNotNull(day.iterator());
	}

	// test mutated setAppts()  BROKEN
	@Test
	  public void test14()  throws Throwable  {
	  	int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);
		assertNotNull(day.iterator());
	}

	
		
}
