package conditionalBlocks;

public class ConditionalBlock1 {
	public static void main(String[] args) {
		boolean firstCondition = false;
		boolean secondCondition = true;
		
		if (firstCondition) {
			System.out.println("inside the if - statement");
			if(secondCondition) {
				System.out.println("inside nested if statement");
			}
		} else if(secondCondition) {
			System.out.println(4);
		} else {		
			System.out.println("inside the else - statement");
		}
		System.out.println("outside the if-else statement");
	}
}
