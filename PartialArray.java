public class PartialArray {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		for (int i = 5 ; i>1 ; i--) 
			array[i] = array[i-1];
		array[2] = 2;
		
		for (int i = 0; i<10 ; i++)
		System.out.println(array[i]);	
	}
}
