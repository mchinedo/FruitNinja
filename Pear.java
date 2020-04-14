package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.Constants;
import cs015.prj.FruitNinjaSupport.FruitNinjaFrame;


public class Pear extends Fruit implements Choppable{

	public Pear() {


	}

	public String getImage() {
		return Constants.PEAR_PATH;
	}


	public int chop() {

		this.chopGraphically();
		this.splash();
		return 3;
}
}
