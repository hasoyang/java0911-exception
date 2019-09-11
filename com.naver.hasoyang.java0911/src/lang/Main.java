package lang;

public class Main {

	public static void main(String[] args) {
		
		//UserVO클래스의 객체를 생성하고 속성을 설정한 후 내용을 출력
		UserVO user = new UserVO();
		
		// 속성을 설정
		user.setAge(28);
		user.setName("지현섭");
		user.setNum(20111320);
		
		// 내용을 출력
		System.out.printf("번호 : %d 이름 : %s 나이 : %d\n",  user.getNum(), user.getName(), user.getAge());
		
		//매개변수가 있는 생성자를 이용해서 객체를 생성하고 속성을 설정
		UserVO user2 = new UserVO(20110000, "양원모", 28);
		//객체의 모든 속성 확인하기
		//데이터를 표현하는 클래스를 만들 때는 toString()을 오버라이딩 하고 확인할 때는 아래처럼 이름만으로 확인
		//toString()메소드를 디버깅을 위한 메소드라고도 합니다.
		System.out.printf("%s\n", user2);
		//UserVO 인스턴스 생성
		
		UserVO user3 = new UserVO(20130000, "홍길동", 25);
		//user3 가 가리키고 잇는 곳의 참조를 user4에 복사
		
		UserVO user4 = user3; // 실제 이런 문장이 있다면 잘못한것.
		//user4가 자신의 num을 27로 변경
		
		user4.setNum(27);
		//user3를 출력 - user3의 num도 27로 변경되어 있습니다.
		
		System.out.printf("%s\n", user3);
		
		UserVO user5 = user3.clone();
		
		System.out.printf("user3 : %s\n", user3);
		System.out.printf("user5 : %s\n", user5);
		
		user5.setNum(2011);
		System.out.printf("user3 : %s\n", user3);
		System.out.printf("user5 : %s\n", user5);
		
		UserVO user6 = user3.clone();
		System.out.printf("%b\n", user6 == user3);// 내용을 비교하지 않기 때문에 false
		System.out.printf("%b\n", user6.equals(user3));//내용을 비교해서 true
		
		
	}

}
