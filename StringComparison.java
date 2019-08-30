import java.util.Scanner;

public class JumpAround {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        boolean samename = false;
        String pcname = "Doug";

		System.out.println("What do you prefer to be called? ");
		
		String tmpstr = sc.nextLine();
		
		testresponse(tmpstr, pcname , samename);
		
		finalresponse(tmpstr);
		
		
		
		sc.close();
	}



public static void testresponse (String tmpstr, String pcname, boolean samename) {
	
	if(pcname.equals(tmpstr))
		samename = true;
	if(samename == true)
		response1(tmpstr);
	else
		response2(tmpstr);
	}

public static void response1 (String tmpstr) {
	
	System.out.println("! My name is " + tmpstr + " too!");
	
	}

public static void response2 (String tmpstr) {
	
	System.out.println("Hi " + tmpstr);
	
	}

public static void finalresponse (String tmpstr) {
	
	System.out.println("It's nice to meet you, buddy!");
	}


}
