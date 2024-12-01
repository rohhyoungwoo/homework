package week02;

import java.util.Scanner;

public class Mentorjava02 {
	public static void main(String[] args) {
		
		System.out.print("Welcome.");
		// 괄호()안의 데이터를 콘솔창에 출력한다
		System.out.print("JAVA World");
		// "Welcome." 옆에 "JAVA World" 문자열을 출력한다
		
		System.out.println("Welcome.");
		// 괄호()안의 데이터를 콘솔창에 출력한다
		System.out.println("JAVA World");
		// "Welcome." 문자열 아래 "JAVA World" 문자열을 출력한다
		
		 System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);
		// 서식문자에 %d를 이용해 정수를 출력한다.
		 
		 System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세 번째.", 1, 2.0, "셋 ");
		// 두가지 이상의 서식문자를 이용하여 정수형, 실수형, 문자형을 출력한다
		 
		 System.out.printf("%5d" , 1);
		 System.out.println();
		 System.out.printf("%5d" , 12);
		 System.out.println();
		 System.out.printf("%5d" , 123);
		 System.out.println();
		 System.out.printf("%5d" , 1234);
		 System.out.println();
		 System.out.printf("%5d" , 12345);
		// %nd = n칸 만큼 확보한 후 오른쪽으로 정렬하는것.
		 // printf는 서식문자를 넣어 출력하고 println은 줄바꿈을 출력한다
		 
		 System.out.printf("%.1f", 1.1234567);
		 System.out.println();
		 System.out.printf("%.2f", 1.1234567);
		 System.out.println();
		 System.out.printf("%.3f", 1.1234567);
		 System.out.println();
		 System.out.printf("%.4f", 1.1234567);
		 System.out.println();
		 System.out.printf("%.5f", 1.1234567);
		 // %.nf = 소수점 n번째 자리 까지에서 반올림하여 출력한다
		 // prinf로 서식문자를 입력하여 출력하고 println으로 줄바꿈을 출력했다
		 
		 int studentAge; //학생의 나이를 저장할 수 있는 변수 선언
		 studentAge = 20; //변수에 값을 대입했다
		 
		 System.out.println(studentAge); // 변수를 출력한다
		
		String myCity = "Seoul"; // 도시를 저장할 수 있는 변수를 선언하고 변수에 "Seoul" 이라는 값을 대입했다
		
		System.out.println(" I am from " + myCity); // "I am from " 에 더하여 문자열 변수 myCity의 값을 출력한다
		
		int myAge = 20; //정수형 변수를 선언하고 값을 대입한다
		int yourAge = myAge; // int yourAge 변수에 myAge변수의 값을 대입한다
		
		
		System.out.println(myAge);
		System.out.println(yourAge); // 각각의 변수의 값을 출력한다
		
		
		int myAge = 20; //정수형 변수를 선언하고 값을 대입한다
		int yourAge = 30; // int yourAge 변수에 myAge변수의 값을 대입한다
		int tempAge; //정수형 변수 선언
		
		
		tempAge = myAge; // myAge에 저장된 데이터를 tempAge에 복사한다
		myAge = yourAge; // yourAge에 저장된 데이터를 myAge에 복사한다
		yourAge = tempAge; // tempAge에 저장된 데이터를 yourAge에 복사한다
		
		System.out.println(myAge);
		System.out.println(yourAge);

		byte num1 = 20; // byte형 변수 num1에 20의 값을 대입한다
		short num2 = 30; // short 변수 num2에 30의 값을 대입
		int num3 = 40; // int형의 변수 num3에 40의 값을 대입
		long num4 = 50; // long 변수 num4에 50을 대입한다
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		// num1~ num4 변수의 값 출력 + 줄바꿈
		
		byte num1 = 0110; // byte타입 num1 변수에 0110값을 대입한다
		short num2 = 0107; // short타입 num2 변수에 0107값을 대입한다
		int num3 = 0x46; // int타입 num3 변수에 0x46값을 대입한다
		long num4 = 69L; // long타입 num4 변수에 69L값을 대입한다
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		// num1 ~ num4 변수의 값을 출력한다 + 줄바꿈
		
		double marathon = 42.195; // double 타입 변수에 42.195값을 저장한다
		float halfMarathon = 21.0975f; // float 타입 변수에 21.0975f 갑을 저장한다
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다."); //마라톤은 42.195km를 달립니다. 메시지 출력
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다."); // 하프 마라톤은 21.0975km를 달립니다. 메시지 출력
		
		
		double pieDouble = 3.141592653589793; // double 타입 변수에 값을 저장한다.
		float pieFloat = 3.141592653589793f;	// float 타입 변수에 값을 대입한다.
		
		System.out.println("double : " + pieDouble); // double : + (변수의 값)을 더하여 출력한다
		System.out.println("float : " + pieFloat); // float : + (변수의 값)을 더하여 출력한다
		
		
		char ga = '가';
		char na = '나';
		char alphabetA = 'A';
		char alphabetB = 'B';
		// char타입 문자형 변수에 오른쪽의 값을 대입하여 저장한다.
		
		System.out.println(ga); // 변수 ga의 값을 출력한다..
		System.out.println(na); // 변수 na의 값을 출력
		System.out.println(alphabetA + ", " + alphabetB); // alphabetA의 값 + , + alphabetB의 값 을 더하여 출력한다
		
		int ga = '가'; // int 타입 정수형 변수에 '가'의 값을 저장한다.
		int na = '나';	// int 타입 정수형 변수에 '나'의 값을 저장한ㄷ.
		
		int alphabetA = 'A'; // 문자 A의 코드값이 int alphabetA변수에 저장되었다.
		int alphabetB = 'B';	// 문자 B의 코드값이 in alphabetB변수에 저장되었다.
		
		System.out.println(ga); //'가'의 유니코드값 출력
		System.out.println(na); //'나'의 유니코드값 출력
		System.out.println(alphabetA); // 값 'A'의 코드 값 출력
		System.out.println(alphabetB); // 값 'B'의 코드 값 출력
		
		int alphabetA = 'A'; // 'A'와 매핑된 유니코드(정수) 65가 저장되었다
		int alphabetB = 'B'; // 'B'와 매핑된 유니코드(정수) 66이 저장되었다
		System.out.println(alphabetA); // 값 'A'의 코드 값 출력
		System.out.println(alphabetB); // 값 'B'의 코드 값 출력
		
		char alphabetC = 67; // 유니코드(정수) 67과 매핑된 'C'가 저장되었다
		System.out.println(alphabetC); // 저장된 값 'C'가 출력됨
		
		boolean isStudent = true; // boolean 타입 변수 선언
		System.out.println(isStudent); // 출력 결과 'true'
		
		boolean isStudent = true; // boolean 타입 변수 선언
		
		if(isStudent) { // if(조건식)이 true 일때 중괄호 안의 영역 실행
			System.out.println("저는 학생입니다"); // 조건식의 값이 true 일 때 "저는 학생입니다" 출력
		} else { // 조건식 값이 false 이면 중괄호 안의 영역 실행
			System.out.println("저는 학생이 아닙니다"); // 조건식의 값이 false 일 때 "저는 학생이아닙니다" 출력
		}
		
		String hi = "안녕하세요,"; // String 타입의 문자열 변수의 값에 "안녕하세요," 저장한다
		String niceToMeetYou = "만나서 반갑습니다.";	// String 타입의 문자열 변수의 값에 "만나서 반갑습니다." 를 저장한다
		
		System.out.println(hi); // 변수 hi의 값을 출력한다
		System.out.println(niceToMeetYou); // 변수 niceToMeetYou 의 값을 출력한다.
		
		int num1 = 11; // 정수형 변수에 11의 값을 대입한다
		double num2 = 3.14; // 실수형 변수에 3.14의 값을 저장한다
		double num1Change = (double)num1; // 정수형 num1의 값을 실수형으로 형변환 시켜준다
		
		System.out.println("num1 : " + num1);
		System.out.println("num1Change : " + num1Change);
		System.out.println(num1Change + num2);
		System.out.println((int)1.23); // 1.23의 값을 정수형으로 형변환 시켜 소수점 자리는 버리고 1만 출력한다
		
		
		
		int i1 = 10; // int i1 변수에 값 10을 저장
		byte b1 = (byte)i1; // int 타입을 byte 타입으로 형변환 시킨다.
		System.out.println(b1); // byte b1의 값 출력
		
		int i2 = 128; // int i2 변수에 값 128을 저장
		byte b2 = (byte)i2; // int 타입의 값을 byte 타입으로 형변환시킨다
		System.out.println(b2); // 형변환된 값을 출력한다
		
		double d1 = 1.0e100; // 1.0 x (10의 100승) (float의 최대 범위를 넘음)
		float f1 = (float)d1; // double 타입을 float타입으로 형변환
		
		System.out.println(f1); // float의 저장 범위를 넘어서는 값은 무한대가 되거나 0이된다
		
		double d2 = 1.0e-100; // 1.0 x -(10의 100승)
		float f2 = (float)d2; // (float의 최대 범위를 넘음)
		System.out.println(f2); // float으 ㅣ저장 범위를 넘어서는 값은 무한대가 되거나 0이된다
		
		
		double pie = 3.14; // 실수형 변수에 값 3.14저장
		int pieInt = (int)pie; // 실수형을 정수형으로 형변환 하고 정수형 변수에 저장한다
		System.out.println(pieInt); // 정수형으로 형변환 되면서 소수점의 값은 버려지고 출력된다
		
		int num = 100; // 정수형 변수에 100의 값 저장
		double numD = (double) num; // 정수형을 실수형으로 형변환 시켜 변수에 값을 젖아
		float numF = (float) 100; // 정수형 값을 실수형으로 형변환
		System.out.println(numD); // 정수형을 실수형으로 형변환 시킨 값 출력
		System.out.println(numF); // 정수형을 실수형으로 형변환 시킨 값 출력
		
		int i = 99999999; // 정수형 변수 i에 값 저장
		float f = (float) i; // 정수형 변수를 실수형으로 형변환
		System.out.println(f); // 형변환 시킨 값 출력 (범위밖)
		
		int num1 = 14; 
		double num2 = 3.14; 
		int num4 = (int) num2;
		// int 변수와 double변수에 값을 저장하고 실수형을 정수형으로 형변환
		
		System.out.println(num4); // 형변환을 통해 소수점은 버려지고 정수값만 출력
		
		int i = 100; // int 변수에 100의 값 저장
		char c = 'a'; // 문자형 변수에 'a'값 저장
		int j = c; // 문자형을 정수형으로 자동형변환
		double d = i; // 정수형을 실수형으로 자동형변환
		
		System.out.println("int형 변수j의 값 : " + j);
		System.out.println("double형 변수 d의 값 : " + d);
		// 자동형변환을 통한 정수값 출력
		// 자동형변환을 통한 실수형 값으로 출력
		
		int i = 10;
		byte b = (byte) i;
		System.out.println("[int -> byte] i의 값 :" + i + "b의 값:" + b);
		// int형을 byte형으로 강제 형변환 시켜 그 값을 출력한다(값이 작을경우 출력)
		int j = 1000;
		byte c = (byte) j;
		System.out.println("[int -> byte] j의 값 :" + j + " c의 값 : " + c);
		// int형을 byte형으로 강제 형변환 시켜 그 값을 출력한다(값이 큰 경우 출력)
		
		double d1 = 1.1234;
		float f1 = (float) d1;
		System.out.println("[double -> float] d1의 값: " + d1 + ", f1의 값 :" +  f1);
		// double 형을 float형으로 강제 형변환시켜 출력한다 ( float형 범위 내 값일 경우)
		double d2 = 1.0e-50;
		float f2 = (float) d2;
		System.out.println("[double -> float] d2의 값: " + d2 + ", f2의 값 :" +  f2);
		// double 형을 float형으로 강제 형변환시켜 출력한다 (float형 최소값보다 작은 경우)
		double d3 = 1.0e100;
		float f3 = (float) d3;
		System.out.println("[double -> float] d3의 값: " + d3 + ", f3의 값 :" +  f3);
		// double 형을 float형으로 강제 형변환시켜 출력한다 (float형 최대값보다 큰 경우)
		double d4 = 9.123456789;
		float f4 = (float) d4;
		System.out.println("[정밀도 차이] d4의 값: " + d4 + ", f4의 값 :" +  f4);
		// double형과 float 형의 정밀도 차이를 보여주는 값을 출력한다 double형이 더 정밀도가 높으므로 
		// 실수형의 기본형은 double형이다
		
		float f1 = 12345.67f;
		int i1 = (int) f1;
		System.out.println("[float -> int] f1의 값 :" + f1 + ", i1의 값 :" + i1);
		// float형을 int형으로 강제 형변환 시킨 값을 출력한다 소수점자리는 버려지고 정수만 출력된다
		double d1 = 12345.678;
		int i2 = (int) d1;
		System.out.println("[double -> int] d1의 값 :" + d1 + ", i2의 값 :" + i2);
		// double형에서 int형으로 강제 형변환 시켜 출력한다 소수점 자리는 버려지고 정수의 값만 출력된다
		
		Scanner scanner = new Scanner(system.in);
		// 입력 클래스 import
		
		System.out.println("나이를 입력해 주세요"); // 출력 메시지를 출력한다
		int age = scanner.nextInt(); // 정수형을 입력받은 메소드
		System.out.printf("내 나이는 %d세 입니다", age); // 입력 받은 정수값을 출력한다
		
		Scanner scanner = new Scanner(System.in); // 입력 클래스 import
		String name, address; // 문자열 변수 name과 address선언
		int age; // 정수형 변수 선언
		double weight;	// 실수형 변수 선언
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요"); // 출력 메시지를 출력한다
		name = scanner.next(); // 이름 입력 메소드 실행
		address = scanner.next(); // 주소 입력 메소드 실행
		age = scanner.nextInt(); // 나이 입력 메소드 실행
		weight = scanner.nextDouble(); // 체중 입력 메소드 실행
		
		System.out.printf("당신의 이름은 %s입니다.%n", name);
		System.out.printf("당신의 주소은 %s입니다.%n", address);
		System.out.printf("당신의 나이은 %d입니다.%n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight);
		// 이름, 주소, 나이, 체중 변수들에 입력받을 값을 해당 실행문에 맞춰 출력한다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
