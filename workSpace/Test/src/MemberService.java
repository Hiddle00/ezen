
public class MemberService 
{
	private String id;
	private String password;
	
	public boolean login(String id,String password)
	{
		if(id.equals("hong") && password.equals("12345"))
		{
			return true;
		}return false;
	}
	
	public void logout(String id)
	{
		if(id.equals("hong"))
		{
			System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
		}
	}
}
