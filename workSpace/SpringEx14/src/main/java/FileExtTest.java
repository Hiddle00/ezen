
public class FileExtTest {

	public static void main(String[] args) {
		String fileName = "a.b.jpg";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		String testValue = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(testValue);
	}

}
