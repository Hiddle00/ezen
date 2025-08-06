//접근 제한자에 대한 개념 설명 및 getter / setter
public class Person 
{
	private String name;   //이름
	private int    age;    //나이
	private String addr;   //거주지
	private String tel;    //전화번호
	
	public String getName() { return name;	}
	public int    getAge()  { return age;	}
	public String getAddr() { return addr;	}
	public String getTel()  { return tel;	}
	public int    getYear() { return 2025 - this.age; }
		
	public void setName(String name) { this.name = name; }
	public void setAge(int age)      { this.age = age;	 }
	public void setAddr(String addr) { this.addr = addr; }
	public void setTel(String tel)   { this.tel = tel;	 }

}
