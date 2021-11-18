import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class standardIO {

	public static void main(String[] args) {
		try (
				InputStream keyboard = System.in;
				PrintStream console = System.out;
				) {
			int c = 0;
			while((c=keyboard.read())!=-1) {
				console.write(c);
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

}