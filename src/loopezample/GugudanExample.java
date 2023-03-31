package loopezample;

public class GugudanExample {

	public static void main(String[] args) {

		//구구단
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++)
			if( (dan % 2) ==0) {
				for(times = 1; times <=9; times++) {
					System.out.println(dan + "X" + times + "=" + dan*times);
				}
			}          
		System.out.println();
	}
}

/* 위 문장을 while문으로 바꿀 때 
 
   		int dan = 2;
		int times = 1;
		
		while(dan <= 9)
			times = 1;
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
		System.out.println();
  */
