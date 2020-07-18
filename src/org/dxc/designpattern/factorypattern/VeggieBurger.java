package org.dxc.designpattern.factorypattern;

public class VeggieBurger extends HamBurger {

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("veggieburger is preparong");
		
	}

	@Override
	void cook() {
		System.out.println("veggie cooking in progress");
		// TODO Auto-generated method stub
		
	}

	@Override
	void box() {
		System.out.println("veggie is packed");
		// TODO Auto-generated method stub
		
	}
	

}
