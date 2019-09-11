package exceptionhandling;

public class Main3 {
	//메인에 throws를 만들면 예외가발생한 경우 운영체제가 처리합니다.
	//main은 운영체제가 호출하기 때문입니다.
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("i = " + (i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("인터럽트 에러 발생");
				System.out.printf("예외 :s\n", e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
