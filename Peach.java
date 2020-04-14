package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.FruitNinjaFrame;
import cs015.prj.FruitNinjaSupport.Constants;

public class Peach extends Fruit implements Choppable{

	public Peach() {


	}

	public String getImage() {
		return Constants.PEACH_PATH;
	}

	public int chop() {

		this.chopGraphically();
		this.splash();
		return 2;

}
}
