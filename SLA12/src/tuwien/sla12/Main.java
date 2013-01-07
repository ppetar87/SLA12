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
	    cal.add(Calendar.MINUTE, 2); // adds 2 minutes
	    Date d = cal.getTime(); // returns new date object, one hour in the future
		
		Simulation rESimulation = new Simulation(5,AuctionType.REVERSE_ENGLISH_AUCTION,1,100,100,d);
		rESimulation.start();
		
	}

}
