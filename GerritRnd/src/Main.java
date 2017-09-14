import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		printLine(line);
	}

	private static void printLine(String line) {

		System.out.println("************* LIne :"+ line);
	}
	
	}
