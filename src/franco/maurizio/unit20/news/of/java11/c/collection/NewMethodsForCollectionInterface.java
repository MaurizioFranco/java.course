/**
 * 
 */
package franco.maurizio.unit20.news.of.java11.c.collection;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Introduced into Java 11, we see how new toArray(IntFunction arg) works.
 * 
 * @author maurizio.franco@ymail.com
 */
public class NewMethodsForCollectionInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> tmpStringList = Arrays.asList("aaa", "bbb", "ccc") ;
		String[] tmpStringArray = tmpStringList.toArray(String[]::new);
		System.out.println(tmpStringArray.length);
		System.out.println(Arrays.toString(tmpStringArray));
	}

}
