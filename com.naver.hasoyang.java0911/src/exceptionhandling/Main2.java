package exceptionhandling;

public class Main2 {

	public static void main(String[] args) {
		String []languages = {"JAVA", "JAVAScript", "Kotlin" , "Swift"};
		int x = 10;
		try {
			//ArithmeticException이 발
			System.out.printf("x/0:%d\n", x/0);
			
			//예외가 발생할 가능성이 있는 구문
			for(int i = 0; i <= languages.length; i ++)
			{
				System.out.println("프로그래밍언어 : " + languages[i]);
			}
		}
		catch(Exception e)
		{
			System.out.printf("예외 : %s \n", e.getMessage());
		}
		/*
		catch(ArrayIndexOutOfBoundsException e){
			//예외 클래스에 해당하는 예외가 발생했을때 처리할 구문
			System.out.println("배열의 인덱스 오류");
		}
		catch(ArithmeticException e)
		{
			System.out.println("산술 연산 오류");
		}
		*/
		finally {
			//예외 발생 여부에상관없이 수행할 구문
			System.out.println("무조건 수행할 구문");
		}
	}

}
