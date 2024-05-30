package sort;

import java.util.Arrays;
import java.util.Random;

public class RandomSort {

	public static void main(String[] args) {
		int [] numbers = new int [10];
		Random random = new Random();
		for(int i=0; i<10;i++) {
			numbers[i]  = random.nextInt(99);
		}
		
		System.out.println("la liste original " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("la liste original " + Arrays.toString(numbers));

	}

}
