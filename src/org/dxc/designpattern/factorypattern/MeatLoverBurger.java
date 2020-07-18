package org.dxc.designpattern.factorypattern;

public class MeatLoverBurger extends HamBurger {

	@Override
	void prepare() {
		System.out.println("are u meatlover then waut it is preparing");
		// TODO Auto-generated method stub
		
	}

	@Override
	void cook() {
		System.out.println("meet burger cooking in progress");
		// TODO Auto-generated method stub
		
	}

	@Override
	void box() {
		System.out.println("meet burger is packed");
		// TODO Auto-generated method stub
		
	}
	

}
