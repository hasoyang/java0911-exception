package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		int port = 8899;
		
		int a = 10;
		int b = 0;
		
		System.out.printf("a: %d, b: %d \n", a , b);
		try 
		{
			//여기서 문제가 발생하더라도 아래 문장들을 계속 처리
			System.out.printf("a/b %d\n" , a/b);
			if(port == 8899)
			{
				//강제로 예외를 발생시킴
				throw new ArithmeticException();
			}
		}
		catch(Exception e)
		{
			System.out.println("계산하는 도중 문제가 발생했습니다.");
			System.exit(0);
		}
		System.out.println("예외처리의 목적에 대해서 알아본다");
		
	}
}
