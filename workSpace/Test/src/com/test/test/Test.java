package com.test.test;
import java.util.Random;
public class Test 
{
	public static void main(String[] args) 
	{
		//1.
		int[] numbers = null;
		numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		for(int i : numbers) System.out.println(i);
		
		//2.
		int[] score = {85, 90, 75, 95, 80};
		int sum = 0;
		for(int i : score) sum += i;
		System.out.println("점수합계: " + sum);
		System.out.println("점수평균: " + sum / score.length);
		
		//3.
		int[] data = {23, 5, 67, 12, 89, 34};
		int max = 0;
		int min = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] > data[max]) max = i;
			if(data[i] < data[min]) min = i;
		}
		System.out.println("최대값: " + data[max]);
		System.out.println("최소값: " + data[min]);
		
		//4.
		char[] alphabets = {'A', 'B', 'C', 'D', 'E'};
		for(int i = alphabets.length - 1; i >= 0; i--)
		{
			System.out.print("'" + alphabets[i] + "' ");
		}
		
		String ssn = "880805-1234567";
		String firstNum = ssn.substring(0,7);
		System.out.println(firstNum);
		
		//5.
		Random random = new Random();
	    int[] lotto  = new int[6];
	    for(int i = 0; i < lotto.length; i++)
	    {
	    	random.setSeed(System.currentTimeMillis());
	    	int number = random.nextInt(45); // 0 ~ 44 까지의 무작위 int 값 리턴 
	    	for(int j = 0; j < i; j++)
	    	{
	    		if(number == lotto[j])
	    		{
	    			i--;
	    			break;
	    		}
	    		lotto[i] = number;
	    	}
	    }
	    for(int i : lotto)
	    {
	    	System.out.print("["+i+"]");
	    }
	    
	}
}
