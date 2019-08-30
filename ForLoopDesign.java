
public class ForLoopDesign {

	public static void main(String[] args) {
		
		for(int row = 1; row<10; row++) {
			for(int col = 0; col<10; col++) {
				if(col == row) 
					System.out.print('x');
				else if (col == 9 - (row - 1)) {
					System.out.print('x');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

	}
}
