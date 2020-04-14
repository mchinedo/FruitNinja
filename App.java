package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.CS15Game;
import cs015.prj.FruitNinjaSupport.FruitNinjaFrame;
import cs015.prj.FruitNinjaSupport.*;

/**
 * Welcome to your FruitNinja App class. In the constructor you should
 * instantiate your top-level object.
 *
 * Please also put your class comments here.
 *
 */

public class App extends Application{

	private FruitNinjaFrame frame;
	private Game fruitNinjaGame;

	@Override
	public void start(Stage stage)  {
		FruitNinjaFrame frame = new FruitNinjaFrame(stage);
		fruitNinjaGame = new Game();
		frame.addGame(fruitNinjaGame);






	}













		// Your code goes below!!!


	/*
	 * This is called a mainline. This is the code that is executed when you run
	 * the program from the command line. The outer graphical frame of
	 * FruitNinja is a special type of graphical object that does not get garbage
	 * collected until you close the application. This helps explain why the
	 * application does not go out of scope!
	 *
	 * Calling launch below will cause the Fruit Ninja Frame to appear.
	 *
	 * Please, DO NOT CHANGE THIS CODE!
	 *
	 */
	public static void main(String[] argv) {
		launch(argv);
		Game game = new Game();

			}










}
