package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 12;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 22);

	  	int startHour=10;
		int startMinute=3;
		int startDay=3;
		int startMonth=3;
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

		startHour = 3;
		Appt apptTwo = new Appt(startHour,
		          startMinute ,
		          startDay,
		          startMonth ,
		          startYear,
		          title,
		         description);

		day.addAppt(apptTwo);

	  	calDays = timeTable.getApptRange(day.getAppts(), firstDay, lastDay);
	 	assertNotNull(timeTable);

	 	LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(day.getAppts(), appt);
	 	assertTrue(day.isValid());


	 }

	 	 @Test
	 	  public void test02()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 12);

	  	int startHour=-1;
		int startMinute=-1;
		int startDay = 0;
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

	  	calDays = timeTable.getApptRange(day.getAppts(), firstDay, lastDay);
	 	assertTrue(day.isValid());


	 }

	 @Test
	  public void test03()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 12;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 22);

	  	int startHour=22;
		int startMinute=12;
		int startDay=2;
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

		calDays = timeTable.getApptRange(day.getAppts(), firstDay, lastDay);
		assertTrue(day.isValid());
	}

	@Test
	  public void test04()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 12;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 22);

	  	int startHour=10;
		int startMinute=3;
		int startDay=3;
		int startMonth=3;
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
		calDays = timeTable.getApptRange(day.getAppts(), firstDay, lastDay);
		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(day.getAppts(), appt);
	 	assertTrue(day.isValid());
	 }

	 @Test
	  public void test05()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 12;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();


	  	int startHour=10;
		int startMinute=3;
		int startDay=3;
		int startMonth=3;
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

		startHour = 3;
		Appt apptTwo = new Appt(startHour,
		          startMinute ,
		          startDay,
		          startMonth ,
		          startYear,
		          title,
		         description);

	 	LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(day.getAppts(), apptTwo);
	 	assertTrue(day.isValid());
	 }

	 @Test
	 	  public void test06()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 22;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 25);

	  	int startHour=-1;
		int startMinute=-1;
		int startDay = 0;
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

	  	calDays = timeTable.getApptRange(day.getAppts(), firstDay, lastDay);
	 	assertTrue(day.isValid());
	 }

	 @Test
	  public void test07()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 12;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 22);

	  	int startHour=10;
		int startMinute=3;
		int startDay=13;
		int startMonth=9;
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
		calDays = timeTable.getApptRange(day.getAppts(), firstDay, lastDay);
	 	assertTrue(day.isValid());
	 }

}
