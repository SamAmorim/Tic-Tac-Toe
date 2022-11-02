import java.util.Scanner;

public class Play {
	private static Scanner input = new Scanner(System.in);
	private static char[][] table = new char[3][3];
	private static String gameStatus;

	// algoritimo de ação - jogar
	public void player1() {
		int c;
		// inserir coluna com regra de negocio
		do {
			System.out.print("\nX, escolha a coluna: ");
			c = input.nextInt() -1 ;
		} while (c < 0 || c > 3);

		// inserir linha com regra de negocio
		int l;
		do {
			System.out.print("\nX, escolha a linha: ");
			l = input.nextInt() -1 ;
		} while (l < 0 || l > 3);

		// teste
		if (table[l][c] != 'O') {
			table[l][c] = 'X';
		} else {
			System.out.println("jogada invalida, jogue novamente");
			// recursividade
			player1();
		}
	}

	public void player2() {
		int c;
		do {
			System.out.print("\nO, escolha a coluna: ");
			c = input.nextInt() - 1;
		} while (c < 0 || c > 3);

		int l;
		do {
			System.out.print("O, escolha a linha: ");
			l = input.nextInt() - 1;
		} while (l < 0 || l > 3);

		if (table[l][c] != 'X') {
			table[l][c] = 'O';
		} else {
			System.out.println("jogada invalida, jogue novamente");
			// recursividade
			player2();
		}
	}
	// analise e validação
<<<<<<< HEAD
	public void analyze() {
		// analisando linha
		

	}

	@Override
	public String toString() {
		return "\n[1]" + "[2]" + "[3]" + "\n[" + table[0][0] + "]" + "[" + table[0][1] + "]" + "[" + table[0][2] + "]"
				+ "[1]" + "\n[" + table[1][0] + "]" + "[" + table[1][1] + "]" + "[" + table[1][2] + "]" + "[2]" + "\n["
				+ table[2][0] + "]" + "[" + table[2][1] + "]" + "[" + table[2][2] + "]" + "[3]";
	}
=======
	public static void analyze() {
	}

	@Override
		public String toString() {
			return "\n[1]" + "[2]" + "[3]" +
				"\n[" + table[0][0] + "]" + "[" + table[0][1] + "]" + "[" + table[0][2] + "]" + "[1]" +
				"\n[" + table[1][0] + "]"+ "[" + table[1][1] + "]" + "[" + table[1][2] + "]" +  "[2]" +
				"\n[" + table[2][0] + "]" + "[" + table[2][1] + "]" + "[" + table[2][2] + "]" + "[3]";
		}
>>>>>>> e0fbfc1844f86d18daafcf08ea9259366787cec1

}
