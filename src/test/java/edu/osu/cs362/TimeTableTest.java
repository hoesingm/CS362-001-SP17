package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.*;

import org.junit.Test;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;

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

	 	/* @Test
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


	 }*/

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


	 @Test
	  public void test08()  throws Throwable  {
		int year = 2017;
	  	int month = 9;
	  	int dayOfMonth = 12;
	  	GregorianCalendar cal = new GregorianCalendar(year, month, dayOfMonth);
	  	CalDay day = new CalDay(cal);

	  	LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	  	TimeTable timeTable=new TimeTable();

	  	GregorianCalendar firstDay = new GregorianCalendar(year, month, dayOfMonth);
	  	GregorianCalendar lastDay = new GregorianCalendar(year, month, 22);

	  	int startHour=25;
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
  public void test10()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      Appt appt1 = new Appt(2, 1, 2029, 821, 146, (String) null, "=K ygr'!|~kdI");
      linkedList0.offerFirst(appt1);
      timeTable0.deleteAppt(linkedList0, appt0);
      assertEquals(1, linkedList0.size());
      assertEquals(1, calDay0.getSizeAppts());
  }
  
    @Test
  public void test11()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.appts;
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
      assertNull(linkedList1);
  }

   
  @Test
  public void test12()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      calDay0.addAppt(appt0);
      LinkedList<Appt> linkedList0 = calDay0.appts;
      timeTable0.deleteAppt(linkedList0, appt0);
      assertEquals(0, linkedList0.size());
      assertEquals(0, calDay0.getSizeAppts());
  }
  


}
