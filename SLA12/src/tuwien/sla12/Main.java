package tuwien.sla12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*** Testing of Simulation ***
		
		Calendar cal = Calendar.getInstance(); // creates calendar
	    cal.setTime(new Date()); // sets calendar time/date
	    cal.add(Calendar.SECOND, 10); // adds 2 minutes
	    Date d = cal.getTime(); // returns new date object, one hour in the future
		
		//Simulation rESimulation = new Simulation(9,AuctionType.REVERSE_ENGLISH_AUCTION,1,10000,10000,d);
		//rESimulation.start();
		
		
		Simulation doubleSilumation = new Simulation(6, AuctionType.DOUBLE_AUCTION, 2, 100, 100, d);
		doubleSilumation.start();
		
		//Simulation dutchSimulation = new Simulation(9,AuctionType.DUTCH_AUCTION,1,10000,10000,d);
		//dutchSimulation.start();
		
	}

}
