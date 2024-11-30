package week02;

import java.util.Scanner;

public class Mentorjava01 {
	public static void main(String[] args) {
		
	      // 자동형변환
      char c = 'a'; // (문자형) char 변수 선언
      int j = c; // 문자형 => 정수형 자동형변환
      System.out.println(j);
      int i = 100; // (정수형) int 변수 선언
      double d = i;

      // 강제형변환 double(8바이트) -> float(4바이트)
      double d1 = 3.1415;
      float f1 = (float) d1; // double형 변수 값 앞에 '(float)'를 사용하여 강제형변환
      System.out.println("double 값: " + d1 + "\n강제형변환 double -> float 값 : " + f1);
      // 강제형변환은 큰 그릇의 물을 작은 그릇에 옮겨 담는 것과 같다
      
      // 다음 코드에서 컴파일 에러가 발생하는 곳을 찾아보고, 그 이유를 적어보세요
      //public class PRACTICE_02_03 {
//         public static void main(String[] args) {
            String fruit = "Apple";
//         }
            System.out.println("I like" + fruit);
      
      // 답 : 출력 메소드를 변수 선언과 같이 main메소드 중괄호안에 함께 표시해야 하는데 출력 메소드를 main메소드의 중괄호 밖의
      // 영역에 표시하여 에러가 발생했다. 출력메소드 -> 메인메소드 중괄호 안의 영역으로 이동
      
      // 다음 코드를 실행했을 때 콘솔창에 출력되는 결과는 무엇입니까?
//         int numI = 'A'; //
//         System.out.println(numI); 
//         // 'A' 라는 값을 정수형으로 선언했기 때문에 출력하게되면 'A'의 아스키코드 번호인 65가 출력된다
//   
//         char numC = 66;
//         System.out.println(numC);
//         // 66이라는 정수를 문자형으로 선언했기 때문에 출력하게되면 66의 아스키코드 문자인 B가 출력된다
//         
//      // 다음 코드에서 컴파일 오류가 발생하지 않으려면 코드를 어떻게 수정해야 할까요?
////         float pie = 3.1415; // 오류 발생
//         float pie = 3.1415f;
         // float형 변수를 선언할 때는 실수 끝에 식별자인 f를 붙여줘야한다.
      
      // 다음과 같은 결과가 나오도록 빈칸에 알맞은 코드를 작성하새 보세요.
//         int n1 = 7;
//         System.out.println(n1);
//         
//         double n2 = (double) n1;  
//               //     [빈칸]
//         System.out.println(n2);
         
         //int 형 변수의 값을 double형으로 형변환 시켜주기위해 n1값 앞에 (double)울 넣어야 한다
         
         // 다음 문장이 맞으면 O표, 틀리면 X표 하세요.
         
         //1. 피연산자의 개수에 따라 연산자를 단항/이항/삼항으로 구분합니다. (o)
         //2. 연산자는 우선 순위가 존재합니다. (o)
         // 연산자 우선 순위 - 최우선 단항 산술 쉬프트 관계 논리 삼항 대입
         //3. 연산의 결과로 하나 이상의 값이 출력될 수 있습니다. (X)
         //4. 논리 연산의 결과는 boolean으로 출력됩니다. (o)
         
         // 다음 코드를 실행했을 때 출력되는 결과
         
         int x = 613;
         System.out.println(++x); // 증감연산자가 x 앞에 붙은 전위형이기 때문에 x값에 바로 1을 더하여 614 출력
         System.out.println(++x); // 증감연산자가 x 앞에 붙은 전위형이기 때문에 위에나온 값이 저장된 x값에 1이 증가된 615가 출력
         System.out.println(x++); 
//   // 증감연산자가 x 뒤에 붙은 후위형이기 때문에 먼저 현재의 x값을 출력하고 다음 연산에서 1을 더하여 출력한다 그래서 지금은 615가 출력된다
//         System.out.println(--x); 
   // 전 출력단계의 결과로 x값이 616이 되었다가 현재 출력 값 x앞에 --가 붙어서 616에서 다시 1을 뺀 값 615가 출력된다.
         
         // 다음과 같은 결과가 나오도록 코드를 수정해 보세요.
         // 값: 0.5
      //문제   
         int a = 300;
         int b = 150;
         
         System.out.println(b/a);
      // 코드 수정
         int num = 300;
         int num1 = 150;
         
         System.out.println((double)num1/num);
      // 실행 결과 값인 0.5 실수형으로 표시하기 위해서 정수로 입력된 값을 실수형으로 바꿔줘야한다
      // 그래서 출력값인 b/a 앞에 (double)을 넣어줘서 형변환을 시켜준다
         
         
      // 다음 코드를 실행했을 때 콘솔창에 출력되는 결과는 무엇인가
         
//         String a = (7 > 9)? "apple" : "banana"; // 조건식이 true면 "apple"의 값을 저장하고 false면 "banana"를 값에 저장한다
//         a += " juice"; // " juice"라는 값을 a변수에 더하고 대입한 결과를 a의 값에 저장한다 
         
//         System.out.println(a);
//         // 조건식 7 > 9 는 7은 9보다 작으므로 false 라는 결과를 가져오고 그에 맞는 "banana"가 a의 값으로 저장된다
//         // 그 후 a의 값에 " juice"를 더한 값을 대입하여 a의 출력값은 banana juice로 출력된다
//         
//         // 다음 코드를 실행했을 떄 콘솔창에 출력되는 결과는 무엇입니까?
//         int num = 11;
//         int result = 1000;
//         
//         if(num > 10) {   // if(조건식) 의 값이 true라면 중괄호 안에 문장을 실행한다
//            result = 1100;
//         }
//         System.out.println(result);
         // int num 변수의 값은 11로 10보다 크다 그래서 조건식은 true이므로 if문 안에 result 변수에 1100이 대입된다
         // 그 결과 출력되는 result의 값은 1100이 된다
         
         
         // 다음 코드를 실행했을 떄 콘솔창에 출력되는 결과는 무엇입니까
         int score = 77;
         char result = 'A';
         
         if(score >= 60) { //if(조건식) 이 참일때 중괄호 안의 영역에 문장을 실행한다.
         // if(score < 70)
            result = 'D'; // score의 값이 60보다 크거나 같을 떄 result변수에 'D'값을 대입한다
            
         }else if(score >= 70) { //위에 if(조건식)이 false이면  else if(조건식)의 중괄호 안에 있는 문장을 실행한다
            result = 'C'; // if(조건식)이 false일 때 score의 값이 70보다 크거나 같을 때 result 변수에 'C'의값을 대입한다
            
         }
         System.out.println(score + "점의 학점은 " + result + "입니다. ");
         // 그러므로 출력되는 값은 ( 77 점의 학점은 D 입니다)
         // 현재 "77점의 학점은 D입니다." 라고 나오는 값을 "77점의 학점은 C입니다."로 출력하기 위해선
         // 위에 if 안에 있는 조건식을 (score < 70) 으로 바꾸고 false 값이 되게 하면 else if로 넘어가게 되어 result의 값이 'C'로 대입된다
         // 그렇게 되면 콘솔창에는 77점의 학점은 C입니다. 로 출력 할 수 있다.
         
         // 다음과 같은 결과가 나오도록 아래 빈칸에 코드를 switch문으로 구현해 보세요.
         
//         int a = 25;
//         
//         switch(a/10) {
//         case 2 :
//        	 System.out.println("a는 20 이상의 숫자입니다.");
//         }
         // switch문은 하나의 변수에 여러개의 값이 담길 수 있고, switch 소괄호 안에 변수나 값이 case와 같을 때 출력한다.
         // switch(a/10) 의 값은 25/10 = 2.5인데 정수형이므로 뒤에 소수점은 사라지고 2만 남는다
         // 그래서 이를 출력하기 위해선 case 뒤에오는 값과 (a/10)의 값이 같아야 switch 중괄호 안에 있는 영역의 출력메소드가 실행되므로
         // case 뒤에는 숫자 2를 넣어주면 출력된다
         
         // 1부터 100까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for문을 사용해 작성해 보세요.
         //로직구성
         //사용될 문법 - for문(초기식;조건식;증감식) - 범위가 정해져있다, 출력 메소드, 짝수의 합 변수 선언
         // 1. for문 작성
         // for(int i = 1; i <= (i%2 == 0); i++){
         // 	조건식이 true일때 실행할 실행문 (짝수 = (i % 2 == 0));
         // }
//		int sum = 0;
//         for(int i = 1; i <= 100; i++) {
//
//        	if(i % 2 == 0) {
//        		sum += i;
//        	}
//         }
//         System.out.println(sum);
         
         
         // 두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해보세요.
         
         //로직구성
         //사용될 문법 - 주사위 2개의 값을 가진 변수 선언 int 2개, while 문, 입력 클래스 import, 입력 메소드, 출력 메소드
         //1. 입력 클래스 import
         //2. while문 사용
         // while(조건식 - 주사위1 != 주사위2){
         //  조건식이 true일때 반복 실행할 문장;
         // int number1, number2 변수 선언
         // 입력 메소드 : int변수=sc.nextInt();
         // 
         // }if(주사위1 == 주사위2) {
         // sysof("반복 횟수 : %d\n주사위 눈의 번호 : %d", (반복횟수), number1);
         //	}
         Scanner sc = new Scanner(System.in);
         int number1 =0, number2 = 0;
         System.out.println("첫번째 주사위와 두번째 주사위 값(띄어쓰기를 구분하여 입력) : ");
         number1 = sc.nextInt();
         number2 = sc.nextInt();
         while(number1 != number2) {
        	System.out.println("같지 않습니다. 다시 입력 : ");
        	 number1 = sc.nextInt();
        	 number2 = sc.nextInt();
         }if(number1 == number2) {
        	 System.out.printf("같습니다.\n반복 횟수 : %d\n주사위 눈의 번호 : %d", number1, number2);
         }
         
         // 범위가 정해져있지 않을 때 반복횟수를 구하는 방법을 모르겠습니다..
         
         // 다중 반복문을 사용해 다음과 같은 모양의 *을 출력하는 코드를 작성해 보세요.
         //   *
         //  * *
         // * * *
         //* * * *
         
         //로직구성
         //사용할 문법 중첩 for문, 띄어쓰기를 출력하는 메소드, *를 출력하는 메소드, 줄바꿈 출력
         // 바깥 for문 행, 안쪽 for문 열, 바깥 for문이 한번 실행될때 안쪽 for문은 조건식이 false일때까지 실행.
         //1. for(int i = 0; i <= 3; i++){ (행)
         //  조건식이 true일동안 실행할 문장;
         // }for(int j = 0; j <= 3 - i; i++){ (열)
         // 띄어쓰기 출력 메소드
         // }for(int k = 0; k < i + 1; i++){ (열)
         // * 출력 메소드
         // }
         // 줄바꿈 메소드
         
//         for(int i = 0; i < 4; i++) {
//        	 for(int j = 0; j < 3 - i; j++) {
//        		 System.out.print(" ");
//        	 }
//        	 for(int k = 0; k < i + 1; k++) {
//        		 System.out.print("* ");
//        	 }
//        	 System.out.println();
//         }
         
         // 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성해 보세요.
         //      *
         //    * * *
         //  * * * * *
         //* * * * * * *
         
         //로직구성
         //사용할 문법 - 중첩 for문, 띄어쓰기출력 메소드, *출력 메소드, 줄바꿈 메소드
         //1. for문 구성
         
//         for(int i = 0; i < 4; i++) {
//        	 for(int j = 0; j < 7-(i*2+1); j++) {
//        		 System.out.print(" ");
//        	 }
//        	 for(int k = 0; k < (i*2)+1; k++) {
//        		 System.out.print("* ");
//        	 }
//        	 System.out.println();
//         }
         
         
         
         
         
       
      
      

		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
