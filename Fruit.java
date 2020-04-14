package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.*;

public class Fruit extends CS15Fruit implements Choppable {
	int randNum;
	Choppable fruit;

	public Fruit() {

		super.wash();
		super.ripen();

	}


	public int chop() {
		super.chopGraphically();
		super.splash();
		return 0;



		}

	}
