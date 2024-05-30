package babylone;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Babylonian {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre positive");
		Double  r, n = input.nextDouble(),guess = n/2; ;
		
		
		do {
			r = n / guess ;
			guess = (guess + r)/2;
			
		}while(Math.abs(guess - r) > 0.01);
		
		input.close();
		DecimalFormat df = new DecimalFormat("#.##");  
		String formattedGuess = df.format(guess);
		System.out.println("l'approximation de la racine de "+ n + " est "+ formattedGuess);
		
	}
	

}
