package ch04;

public class checktest02 {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;	
		}	//switch문 종료
	
		System.out.println(score1);
		
	}
	

}
