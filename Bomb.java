package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.*;


public class Bomb extends CS15Bomb implements Choppable  {

  public Bomb() {
}

public int chop() {
	  
	  this.explode();
	return 4;
}



}
