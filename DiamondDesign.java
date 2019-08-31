public class DiamondDesign{

	public static void main(String[] args) {
		
		String letter = " ";
		for(int i = 14; i>0; i--) {
			for(int x = 0; x<i; x++) 
				System.out.print("  ");
			
			for(int k = 15; k > i; k--) {
				System.out.print(" ");
				for(int l = 15; l > k; l-=14)
					System.out.print(" * ");
			}
			System.out.println();			
		}
		
		System.out.print(letter);
		
		for(int q = 0; q<14 ; q++) {
			for(int w = 14; w>q ; w--)
				System.out.print("  * ");
			
			for(int e = 0; e < 1; e++) {
				System.out.println();
				for(int r = 0; r<1; r++)
					letter = letter + "  ";
					System.out.print(letter);
			}
			for(int a = 14; a>15; a--) {
				for(int t = 14; t>a; t--) 
					System.out.print(" * ");
			
				for(int s = 0; s < a; s++) {
					System.out.print(" ");
					for(int d = 0; d < s; d+=14)
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	}
}
