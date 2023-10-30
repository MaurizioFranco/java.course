/**
 * 
 */
package franco.maurizio.unit20.news.of.java11.e.var_in_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Introduced into Java 11, we see how var keyword in lambda function
 * declaration works
 * 
 * @author maurizio.franco@ymail.com
 */
public class VarInLambdaFunctions {

	public static void main(String[] args) {
		List<String> exampleList = Arrays.asList("Maurizio", "doing", "Java", "example");
		String exampleString = exampleList.stream().map((var singleString) -> singleString.toUpperCase())
				.collect(Collectors.joining(", "));

		System.out.println(exampleString);
	}

}
