//18. 배열연습
public class ArrayTest 
{
	public static void main(String[] args) 
	{
		//5명 학생의 점수 합계
		int score1 = 10;
		int score2 = 20;
		int score3 = 30;
		int score4 = 40;
		int score5 = 50;
		int sum = score1 + score2 + score3 + score4 + score5;
		
		//5명 학생의 점수를 묶어서 표현 (배열 - Array)
		int []score = { 10, 20, 30, 40, 50, 66 };
		System.out.println(score[0]); //0번째 원소 값 출력
		System.out.println(score[4]); //4번째 원소 값 출력
		
		int n = 3;
		System.out.println(score[n]); //n번째 원소 값 출력
		
		//원소의 갯수를 확인하는 방법
		System.out.println("원소갯수:" + score.length);
		
		//모든 원소의 값을 출력한다.
		for(int i = 0 ; i < score.length; i++)
		{
			System.out.println(score[i]);
		}
		
		//배열 score의 전체 합계와 평균을 구하세요.
		int sumScore = 0;
		int avgScore = 0;
		for(int i = 0; i < score.length; i++)
		{
			sumScore += score[i];
		}
		
		avgScore = sumScore / score.length;
		System.out.println("합계:" + sumScore);
		System.out.println("평균:" + avgScore);
	}
}
