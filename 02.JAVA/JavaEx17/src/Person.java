//���� �����ڿ� ���� ���� ���� �� getter / setter
public class Person 
{
	private String name;   //�̸�
	private int    age;    //����
	private String addr;   //������
	private String tel;    //��ȭ��ȣ
	
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
