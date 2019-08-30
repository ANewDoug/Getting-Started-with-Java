import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Calculator {
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Calculator");
		String temp1, temp2, operator;
		double Num1, Num2, answer;
		boolean finished = false;
		
		do {
			temp1 = JOptionPane.showInputDialog(frame, "What's your first Arg" );
			temp2 = JOptionPane.showInputDialog(frame, "What's your second Arg" );
			operator = JOptionPane.showInputDialog(frame, "Which operator do you choose?" );
			Num1 = Double.parseDouble(temp1);
			Num2 = Double.parseDouble(temp2);
			
			if (operator.equals("+")) {
				answer = add(Num1, Num2);
				System.out.println(Num1 +" + " + Num2 +" = " + answer);
				}
		
			else if(operator.equals("-")) {
				answer = subtract(Num1, Num2);
				System.out.println(Num1 +" - " + Num2 +" = " + answer);
				}
			
			else if (operator.equals("*")) {
				answer = multiply(Num1, Num2);
				System.out.println(Num1 +" * " + Num2 +" = " + answer);
				}
			
			else if (operator.equals("/")) {
				answer = divide(Num1, Num2);
				System.out.println(Num1 +" / " + Num2 +" = " + answer);
				}
						
			int n = JOptionPane.showConfirmDialog(frame, "Would you like to continue?", "Calculator", JOptionPane.YES_NO_OPTION);
			
			if (n == 1)
				finished = true;

			
		}while(!finished);
	
	}
	
	public static double add(double Num1, double Num2 ) {
		double answer;
		answer = Num1 + Num2;
		System.out.println("Add");
		return answer;	
	}
	
	public static double subtract(double Num1, double Num2 ) {
		double answer;
		answer = Num1 - Num2;
		System.out.println("Subtract");

		return answer;
	}
	
	public static double multiply(double Num1, double Num2 ) {
		double answer;
		answer = Num1 * Num2;
		System.out.println("Multiply");

		return answer;
	}
	
	public static double divide(double Num1, double Num2 ) {
		double answer;
		answer = Num1 / Num2;
		System.out.println("Divide");

		return answer;
	}

}
