
public class note 
{

	public static void main(String[] args) 
	{
		boolean f;
        int n = 1;
        int m = 9;
        int x = 0;
        int y = 0;
        
        m = ((++n + ++n) % 2) * n++;
        f = m == 0;
        System.out.println(m);
        System.out.println(n);
        System.out.println(f);
        System.out.println(--n);
        System.out.println(--n);
        System.out.println(n--);
        System.out.println((int)--n + 30);
//        
        String s = "가나다";
        m = 0;
		n = 0;
		m = (++n) + (n--) + (n--);     				//m:1 ���� 
		System.out.println(n);
		System.out.println(m);
		
		
		m = 0;
		n = 0;
		m = (++n) + (n--) - (n);     				//m:1 ���� 
		System.out.println(n);
		System.out.println(m);
		
		m = 0;
		n = 0;
		m = (++n) + (n--) + (--n);     				//m:1 ���� 
		System.out.println(n);
		System.out.println(m);
	}

}
