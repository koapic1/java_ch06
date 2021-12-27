package lacture;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int hour02 = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);
		int am = now.get(Calendar.AM);
		int pm = now.get(Calendar.PM);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		int day = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("day == "+day);
		
		System.out.println(year+" == "+(month+1)+" == "+date);
		System.out.println(hour02+" == "+minute+" == "+second);
		
		String days [] = {"일","월"};
		System.out.println(days[day-1]);
		
		switch(day) {
		case Calendar.SUNDAY : System.out.println("일요일"); break;
		case Calendar.MONDAY : System.out.println("월요일"); break;
		case Calendar.TUESDAY : System.out.println("화요일"); break;
		case Calendar.WEDNESDAY : System.out.println("수요일"); break;
		case Calendar.THURSDAY : System.out.println("목요일"); break;
		case Calendar.FRIDAY : System.out.println("금요일"); break;
		case Calendar.SATURDAY : System.out.println("토요일"); break;
		}
		
		// if(ampm == am) System.out.println("오전");
		// else System.out.println("오후");
	}
}
