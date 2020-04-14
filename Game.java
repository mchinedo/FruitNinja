package FruitNinja;

import cs015.prj.FruitNinjaSupport.*;
import cs015.prj.FruitNinjaSupport.CS15Game;
import cs015.prj.FruitNinjaSupport.Blade;


	public class Game extends CS15Game {


	private	Choppable fruit;
	private Choppable _bomb;
	private Blade blade;


	public Game (){
		this.startGame();
		
		Blade blade = new Blade();
		this.addBlade(blade);
		blade.setName("BadBlade");
	}

	@Override
	public Choppable launchItem() {
		
		 Apple Apple = new Apple();
		 Lemon Lemon= new Lemon();
		 Pear Pear = new Pear();
		 Peach Peach = new Peach();
		 Bomb bomb = new Bomb();

		int choppable = (int)(Math.random()*5);


		switch (choppable) {
		case 0:
			return new Apple();

		case 1:
			return new Lemon();

		case 2:
			return new Peach();

		case 3:
			return new Pear();

		case 4:
			return new Bomb();

		default:
			return new Bomb();
		}
	}

	
//
//	@Override
//	public  getChoppable() {
//		
//		return choppable;
//	}

	@Override
	public int onBladeContact() {
		Choppable lastObject = this.getChoppable();
		return lastObject.chop();
	}
}
