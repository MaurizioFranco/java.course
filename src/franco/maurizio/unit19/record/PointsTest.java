package franco.maurizio.unit19.record;

/**
 * 
 * Provides an introduction on Record instancing and use.
 * In detail:
 *           - how to instance a record
 *           - how to call the "get" accessor method (you can see no get prefix in the name, but only the name of the property with the parenthesis)
 *           - how the default equals implementation works
 *           - differences among the default equals implementation for Record, String and Object 
 * @author maurizio.franco@ymail.com
 */
public class PointsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point first  = new Point (10, 20) ;
		Point second = new Point (30, 40) ;
		Point third = new Point (10, 20) ;
		System.out.printf("These are first point coordinates: x: %s, y: %s%n", first.x(), first.y());
		System.out.printf("These are second point coordinates: x: %s, y: %s%n", second.x(), second.y());
		System.out.printf("These are third point coordinates: x: %s, y: %s%n", third.x(), third.y());
		System.out.printf("These are first and second points toString method invocation: first: %s, second: %s%n", first, second);
		System.out.printf("this is the equals method invocation on first and second points - first.equals(second) : %s%n", first.equals(second));
		System.out.printf("this is the equals method invocation on first and third points - first.equals(third) : %s%n", first.equals(third));
		String aaa = new String ("aaa") ;
		String bbb = new String ("aaa") ;
		System.out.printf("this is the equals method invocation on aaa and bbb strings - aaa.equals(bbb) : %s%n", aaa.equals(bbb));
		Object aaaa = new Object () ;
		Object bbbb = new Object () ;
		System.out.printf("this is the equals method invocation on aaaa and bbbb objects - aaaa.equals(bbb) : %s%n", aaaa.equals(bbbb));
		//first.x
	}

}
