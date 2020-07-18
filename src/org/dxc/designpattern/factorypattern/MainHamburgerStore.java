package org.dxc.designpattern.factorypattern;

public class MainHamburgerStore {

	public static void main(String[] args) {
		SimpleHambergerFactory factory=new SimpleHambergerFactory();
		HamBurger veggie=factory.getInstance("order1");
		veggie.prepare();
		veggie.cook();
		veggie.box();
		System.out.println("my veggie burger");
		System.out.println("-------------------");
		HamBurger veggie1=factory.getInstance("order2");
		veggie1.prepare();
		veggie1.cook();
		veggie1.box();
		System.out.println("my cheeseburger");
		System.out.println("-------------------");
		HamBurger veggie2=factory.getInstance("order3");
		veggie2.prepare();
		veggie2.cook();
		veggie2.box();
		System.out.println("my meetloverburger");
		System.out.println("-------------------");
		
		
		// TODO Auto-generated method stub

	}

}
