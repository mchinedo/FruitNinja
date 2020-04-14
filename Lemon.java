package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.FruitNinjaFrame;
import cs015.prj.FruitNinjaSupport.Constants;


public class Lemon extends Fruit implements Choppable{


	public Lemon() {

	}

	public String getImage() {
		return Constants.LEMON_PATH;
	}

	public int chop() {

		this.chopGraphically();
		this.splash();
		return 1;
	}

}
