import java.util.Scanner;
import javax.swing.JOptionPane;

public class JOptionLogin {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String userName = "abc";
		String password = "xyz";
		String tempUser;
		String tempPassword;
		boolean login = false;
	
		do {
			JOptionPane.showMessageDialog( null , "Enter Username:", "User Login: ", 1);
			tempUser = sc.nextLine();
			
			JOptionPane.showMessageDialog( null , "Enter Password:", "User Login: ", 1);
			tempPassword = sc.nextLine();
			if(!(userName.equals(tempUser) && tempPassword.equals(password))) {
				JOptionPane.showMessageDialog( null , "Invalid", "Error ", 1);
			}
			else {
				login = true;
			}
		
		} while(login == false);
		
		JOptionPane.showMessageDialog( null , "Welcome To The System", "Authentication Valid ", 1);
		sc.close();
	}
}
