import java.util.Scanner;

public class Play {
	private static Scanner input = new Scanner(System.in);
	private static char[][] table = new char[3][3];

	// algoritimo de ação - jogar
	public static void player1() {
		int c;
		do {
			System.out.print("X, escolha a coluna: ");
			c = input.nextInt();
			c -= 1;
		} while (c < 0 || c > 3);

		int l;
		do {
			System.out.print("X, escolha a linha: ");
			l = input.nextInt();
			l -= 1;
		} while (l < 0 || l > 3);

		if (table[l][c] != 'O') {
			table[l][c] = 'X';
		} else {
			System.out.println("jogada invalida, jogue novamente");
			player1();
		}
	}

	public static void player2() {
		int c;
		do {
			System.out.print("O, escolha a coluna: ");
			c = input.nextInt();
			c -= 1;
		} while (c < 0 || c > 3);

		int l;
		do {
			System.out.print("O, escolha a linha: ");
			l = input.nextInt();
			l -= 1;
		} while (l < 0 || l > 3);

		if (table[l][c] != 'X') {
			table[l][c] = 'O';
		} else {
			System.out.println("jogada invalida, jogue novamente");
			player2();
		}
	}
	// analise e validação
	public static void analyze() {
	}

	@Override
		public String toString() {
			return "\n[1]" + "[2]" + "[3]" +
				"\n[" + table[0][0] + "]" + "[" + table[0][1] + "]" + "[" + table[0][2] + "]" + "[1]" +
				"\n[" + table[1][0] + "]"+ "[" + table[1][1] + "]" + "[" + table[1][2] + "]" +  "[2]" +
				"\n[" + table[2][0] + "]" + "[" + table[2][1] + "]" + "[" + table[2][2] + "]" + "[3]";
		}

}
