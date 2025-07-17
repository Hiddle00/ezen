
public class Note 
{

	public static void main(String[] args) 
	{
		
		
		int age = 10;
		System.out.println((age < 20)? "미성년" : (age <= 29)? "20대" : (age <= 39)? "30대" : (age <= 49)? "중년" : (age <= 59)? "장년" : "노년");
		
		char c = '\u0041';
		System.out.println(c);
	}

}
