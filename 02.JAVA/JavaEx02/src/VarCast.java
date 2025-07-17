//03. 타입 변환 예제
public class VarCast 
{
	public static void main(String[] args) 
	{
		//자동 타입 변환
		int mathScore = 35; //수학점수
		int korScore  = 40; //국어점수
		int engScore  = 16; //영어점수
		int sumScore  = mathScore + korScore + engScore;
		//평균이 30.3333이지만, avgScore 가 int(정수형)이므로
		//소숫점은 떨어져 나가는 현상 		
		int avgScore = sumScore / 3;
		//sumScore, avgScore 정수값이므로 정수가 출력됨
		System.out.println(sumScore);
		System.out.println(avgScore);

		double sum = mathScore + korScore + engScore;
		double avg = sum / 3; //실수 / 정수 ==> 실수로 계산결과 나옴
		//sum, avg는 실수값이므로 실수가 출력됨
		System.out.println(sum);
		System.out.println(avg);
		
		
		//강제 타입 변환
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
