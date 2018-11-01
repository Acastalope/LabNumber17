import java.util.ArrayList;
import java.util.Scanner;

public class LabNumber17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		
		ArrayList<Integer> listItemNum = new ArrayList<Integer>();
		listItemNum.add(2);
		listItemNum.add(3);
		listItemNum.add(5);
		listItemNum.add(7);
		
		ArrayList<Integer> listPrimes = new ArrayList<>();
		
		for(count = 0; count <=1000; count ++) {
		System.out.println();
			
	String contin = "y";
	
	while (contin.equalsIgnoreCase("y")) {
		System.out.println("Let's locate some primes! ");
		System.out.println();
		System.out.println("This application will find you any prime, in order, from first prime number on.");
		System.out.println();
		System.out.println("Which prime are you looking for?");
		
		int input = sc.nextInt();
		
		System.out.println("The number " + "prime is" + ".");
				
		System.out.println();
		System.out.println("Do you want to continue? (yes/no)");

		contin = sc.next();

	}}}}