package loopezample;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num <= 5; num++) { 
			
			if ( (num % 2) == 0) { 
				total += num;  
			}
			
		}
		
		System.out.println("1부터 5까지의 짝수의 합은: " + total + "입니다.");
		
		/* countiue문 
		  	반복문과 함께 쓰이며, 반복문 내부 coutinue문을 만나면 이후 반복되는 부분을 수행하지 않고 
		  	조건식이나 증감식을 수행함.
		 */
	}

}
