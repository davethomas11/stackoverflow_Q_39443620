public class Main {

	public static final String TIME1 = "PT5M30S";
	public static final String TIME2 = "PT1H13M59S";

	/**
		Simple solution to stack over flow question 39443620
	*/
	public static void main(String[] args) {

		PTTime time1 = PTTimeParser.parseTime(TIME1);
		System.out.println(String.format("Time 1 parsed ( %s ) = %s", TIME1, time1.toString()));

		PTTime time2 = PTTimeParser.parseTime(TIME2);
		System.out.println(String.format("Time 1 parsed ( %s ) = %s", TIME2, time2.toString()));
	}
}