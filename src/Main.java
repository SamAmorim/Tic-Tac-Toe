
public class Main {
	static Play play = new Play();

	public static void main(String[] args) {

		// loop de jogo
		System.out.print(play.toString());
		
		play.player2();
		System.out.print(play.toString());
		play.player1();
		System.out.print(play.toString());
		
	}
}
