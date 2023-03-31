package loopezample;

public class WhileExample1 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}


/* 
 for문 수행과정
num 이 1에서부터 5일 때까지 하나씩 증가하면서 출력하는 for문 
*/
