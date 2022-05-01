package game;

public class Launcher {
	public static void main(String[] args) {			
		//Game game = new Game("Tetris");
        //game.run();
		Game game1 = new Game("Tetris-1");

		Game game2 = new Game("Tetris-2");

		game1.start();
		game2.start();
	}
}
