package org.dxc.designpattern.factorypattern;

public class CheeseBurger extends HamBurger {

	@Override
	void prepare() {
		System.out.println("cheese burger is preparing");
		// TODO Auto-generated method stub
		
	}

	@Override
	void cook() {
		System.out.println("cheese burger cooking in progress");
		// TODO Auto-generated method stub
		
	}

	@Override
	void box() {
		System.out.println("cheese burger is packed");
		
		// TODO Auto-generated method stub
		
	}
	

}
