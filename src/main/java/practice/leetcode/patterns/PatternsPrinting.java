package practice.leetcode.patterns;


public class PatternsPrinting {

	public static void main(String[] args) {
		numbersPatternPrinting();
		System.out.println("*************");
		charactersPatternPrinting();
		System.out.println("%%%%%%%%%%%%%");
		squareBoxPatternPrinting();
	}

	public static void numbersPatternPrinting() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void charactersPatternPrinting() {
		for (int i = 1; i <= 6; i++) {
			char c = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}

	public static void squareBoxPatternPrinting() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				if ((i == 2 && j == 2) || (i == 2 && j == 3)||(i == 3 && j == 2) || (i == 3 && j == 3)) {
					System.out.print("  ");
					continue;
				}
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}

