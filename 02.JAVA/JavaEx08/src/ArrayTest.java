//18. �迭����
public class ArrayTest 
{
	public static void main(String[] args) 
	{
		//5�� �л��� ���� �հ�
		int score1 = 10;
		int score2 = 20;
		int score3 = 30;
		int score4 = 40;
		int score5 = 50;
		int sum = score1 + score2 + score3 + score4 + score5;
		
		//5�� �л��� ������ ��� ǥ�� (�迭 - Array)
		int []score = { 10, 20, 30, 40, 50, 66 };
		System.out.println(score[0]); //0��° ���� �� ���
		System.out.println(score[4]); //4��° ���� �� ���
		
		int n = 3;
		System.out.println(score[n]); //n��° ���� �� ���
		
		//������ ������ Ȯ���ϴ� ���
		System.out.println("���Ұ���:" + score.length);
		
		//��� ������ ���� ����Ѵ�.
		for(int i = 0 ; i < score.length; i++)
		{
			System.out.println(score[i]);
		}
		
		//�迭 score�� ��ü �հ�� ����� ���ϼ���.
		int sumScore = 0;
		int avgScore = 0;
		for(int i = 0; i < score.length; i++)
		{
			sumScore += score[i];
		}
		
		avgScore = sumScore / score.length;
		System.out.println("�հ�:" + sumScore);
		System.out.println("���:" + avgScore);
	}
}
