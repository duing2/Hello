package ch04;

public class checktest05 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		for(x=1; x <= 10; x++) {
			for(y=1; y<=10; y++) {
				if(((4*x)+(5*y)) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}//if문 종료
				
			}//두번째 for문 종료
			
			
			
 		}//첫번째 for문 종료

		
		
	}

}
