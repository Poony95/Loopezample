package loopezample;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}

// while문 : 하나의 조건에 대해 반복수행이 이루어질 때 사용. 조건이 맞지 않으면 수행문 수행x, 주로 조선식이 true, false로 나타남.
// do-while문 : 하나의 조건에 대해 반복수행이 이루어질 때 사용 단, 수행문이 반드시 한번 이상 수행 됨.
// for문 : 수의 특정 범위, 횟수와 관련한 반복수행에서 주로 사용
/* 무한반복 while(true) {
 			수행문;
		  }*/
// 중첩된 반복문 : 반복문 내부에 또 반복문이 사용 됨. 구구단의 예.