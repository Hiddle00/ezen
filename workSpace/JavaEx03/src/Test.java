public class Test 
{
	public static void main(String[] args) 
	{
		//age가 19살 이상이면 성년, 아니면 미성년이라고 출력하시오.
		int age = 18;
		int gender = 1;
		
//		switch(gender)
//		{
//		case 0: age >= 19
//		}
		String msg;
		msg = (age >= 19) ? "성인" : "미성년";
		msg += " ";
		msg += (gender == 0) ? "남자" : "여자";
		System.out.println(msg);
		
		
		System.out.println((age >= 19) ? "성인" : "미성년" + " " + ((gender == 0) ? "남자" : "여자"));
				
	}

}
