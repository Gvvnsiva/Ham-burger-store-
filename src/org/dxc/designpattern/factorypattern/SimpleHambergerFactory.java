package org.dxc.designpattern.factorypattern;

public class SimpleHambergerFactory {
	public HamBurger getInstance(String burgername) {
		if(burgername.equals("order1")) {
			return new VeggieBurger();
		
		}
		else if(burgername.equals("order2")){
	 return new CheeseBurger();
	}
		else
			return new MeatLoverBurger();
			
			
			
		}
		

	
	}