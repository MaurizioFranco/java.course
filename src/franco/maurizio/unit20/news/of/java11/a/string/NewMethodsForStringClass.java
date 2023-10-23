package franco.maurizio.unit20.news.of.java11.a.string;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Introduced into Java 11, we see how new String class methods work.
 * 
 * @author maurizio.franco@ymail.com
 */
public class NewMethodsForStringClass {

	final static String TMP_DIR = "./tmp/";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String tmpString = "      Maurizio Franco is writing test class for string new methods from java 11.    ";
		System.out.println(tmpString);
		System.out.println(tmpString.isBlank());
		System.out.println(tmpString.stripLeading());
		System.out.println(tmpString.stripTrailing());
		System.out.println(tmpString.strip());
		System.out.println(tmpString.repeat(2));
		String tmpString2 = "      Maurizio Franco is writing test class \nfor string new methods from java 11.    ";
		System.out.println(tmpString2.lines());
		List<String> lines = tmpString2.lines().collect(Collectors.toList());
		System.out.println(lines.get(0));
		System.out.println(lines.get(1));
	}

}
