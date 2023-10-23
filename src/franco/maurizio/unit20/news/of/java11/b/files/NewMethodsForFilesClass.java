/**
 * 
 */
package franco.maurizio.unit20.news.of.java11.b.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Introduced into Java 11, we see how new methods writeString and readString,
 * for Files class, work.
 * 
 * @author maurizio.franco@ymail.com
 */
public class NewMethodsForFilesClass {

	final static String TMP_DIR = "./tmp/";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path tmpFilePath = Files.writeString(
				Files.createTempFile(FileSystems.getDefault().getPath(TMP_DIR), "demo", ".txt"), "Sample text");
		String fileContent = Files.readString(tmpFilePath);
		System.out.println(fileContent);
	}

}
