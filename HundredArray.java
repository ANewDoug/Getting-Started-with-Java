public class HundredArray {

	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i<100; i++)
			array[i] = (int)(Math.random() * 999 + 1);
		
		int temp = 0;
		for (int i =0; i<100; i++)
			temp = array[i] + temp;
		
		temp = temp/100;
		System.out.println("The mean of this array is " + temp);
	}
}
