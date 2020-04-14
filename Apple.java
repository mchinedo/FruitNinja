package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.FruitNinjaFrame;
import cs015.prj.FruitNinjaSupport.Constants;

public class Apple extends Fruit implements Choppable{

	public Apple() {

	}

	public String getImage() {
		return Constants.APPLE_PATH;
	}

	public int chop() {

		this.chopGraphically();
		this.splash();
		return 0;

	}


}
