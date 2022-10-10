package ch04;

public class checktest02_1 {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}//case "B" 종료
		default -> 60;
		};	//swich문 종료

		System.out.println(score1);
		
	}

}
