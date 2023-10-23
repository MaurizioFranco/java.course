package franco.maurizio.unit20.news.of.java11;

/**
 * 
 * Provides for a record, an example of:
 *     - overriding canonical record constructor
 *     - declaring an interface nested a Record, exactly like a class
 *     - declaring a class nested a Record, exactly like a class
 *     
 * @author maurizio.franco@ymail.com
 */
public record Point2 (int x, int y) {
	public Point2 {
		if (x<10) throw new IllegalArgumentException("x cannot be lower than 10!!!");
	}
	
	public interface InterfaceNestedARecord {
		
	}
	
	public class ClassNestedARecord {
		
	}
}
