/**
 * 
 */
package franco.maurizio.unit21.news.of.java14.a.new_switch_statement;

/**
 * 
 * News of Java 14: new switch statement
 * 
 * @author maurizio.franco@ymail.com
 */
public class NewSwitchStatement {

	public static void main(String[] args) {
		WeekDays dayForTest = WeekDays.WEDNESDAY;
		testOldSwitchStatement(dayForTest);
		testNewSwitchStatement(dayForTest);
		int testResponse = testNewSwitchStatementWithAssignment(dayForTest);
	}

	private static void testNewSwitchStatement(WeekDays day) {
		switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
		case TUESDAY -> System.out.println(7);
		case THURSDAY, SATURDAY -> System.out.println(8);
		case WEDNESDAY -> System.out.println(9);
		}
	}

	private static void testOldSwitchStatement(WeekDays day) {
		switch (day) {
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			System.out.println(6);
			break;
		case TUESDAY:
			System.out.println(7);
			break;
		case THURSDAY:
		case SATURDAY:
			System.out.println(8);
			break;
		case WEDNESDAY:
			System.out.println(9);
			break;
		}
	}

	private static int testNewSwitchStatementWithAssignment(WeekDays day) {
		int responseNum = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		};
		return responseNum;
	}

}

enum WeekDays {
	MONDAY, FRIDAY, SUNDAY, TUESDAY, THURSDAY, SATURDAY, WEDNESDAY;
}
