package ch04;

public class checktest03 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		for(i=1; i<=100; i++) {
			
			if(i % 3 == 0) {
				sum += i;
			}//if문 종료
			
		}// for문 종료

		System.out.println("3의 배수 총합 : " + sum);
		
	}

}
