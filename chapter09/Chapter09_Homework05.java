package chapter09;

public class Chapter09_Homework05 {

	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();

		System.out.print("Mth/Day/Year: ");
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		calender.setTimeInMillis(1234567898765L);

		System.out.print("Elapsed time since January 1, 1970 set to " +
			"1234567898765L Mth/Day/Year: ");
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}

