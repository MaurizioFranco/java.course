/**
 * 
 */
package franco.maurizio.unit20.news.of.java11.d.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * Introduced into Java 11, we see how new not(Predicate target) works.
 * 
 * @author maurizio.franco@ymail.com
 */
public class NewMethodsForPredicateInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> stringsDemoList = Arrays.asList("Maurizio", " \n \n", " method(not) from java 11.");
		List withBlanks = stringsDemoList.stream().filter(String::isBlank).collect(Collectors.toList());
		System.out.print("with blanks: [");
		withBlanks.forEach(System.out::print);
		System.out.println("]");
		List withoutBlanks = stringsDemoList.stream().filter(Predicate.not(String::isBlank))
				.collect(Collectors.toList());
		System.out.print("without blanks: [");
		withoutBlanks.forEach(System.out::print);
		System.out.print("]");
	}

}
