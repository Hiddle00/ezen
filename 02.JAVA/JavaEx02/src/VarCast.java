//03. Ÿ�� ��ȯ ����
public class VarCast 
{
	public static void main(String[] args) 
	{
		//�ڵ� Ÿ�� ��ȯ
		int mathScore = 35; //��������
		int korScore  = 40; //��������
		int engScore  = 16; //��������
		int sumScore  = mathScore + korScore + engScore;
		//����� 30.3333������, avgScore �� int(������)�̹Ƿ�
		//�Ҽ����� ������ ������ ���� 		
		int avgScore = sumScore / 3;
		//sumScore, avgScore �������̹Ƿ� ������ ��µ�
		System.out.println(sumScore);
		System.out.println(avgScore);

		double sum = mathScore + korScore + engScore;
		double avg = sum / 3; //�Ǽ� / ���� ==> �Ǽ��� ����� ����
		//sum, avg�� �Ǽ����̹Ƿ� �Ǽ��� ��µ�
		System.out.println(sum);
		System.out.println(avg);
		
		
		//���� Ÿ�� ��ȯ
		double d1 = 1.5;
		double d2 = 1.8;
		int    n1 = 0;
		
		//n1 = 3( 1.5 + 1.8 ==> 3.3)
		n1 = (int)(d1 + d2);
		System.out.println(n1);
		
		//n1 = 1(<-- 1.5) + 1 (<-- 1.8)
		n1 = (int)d1 + (int)d2;
		System.out.println(n1);	
		
	}
}
