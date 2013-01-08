package tuwien.sla12;

import java.util.ArrayList;
import java.util.Random;

public class Provider extends User{

	private SLA sla = new SLA();
	public Boolean bidding;
	public Consumer matchedConsumer;
	
	public Provider(){
		ArrayList<SLAParameter> paramlist = new ArrayList<SLAParameter>();
		Random r = new Random();
		int result = r.nextInt(9 - 3) + 3;
		for (int i=paramlist.size(); i<result; i=paramlist.size()){
			r = new Random();
			int p = r.nextInt(9);
			SLAParameter sp = new SLAParameter(1,"param"+p);
			if (!paramlist.contains(sp)) {
				paramlist.add(sp);
			}
		}
		sla.setParamlist(paramlist);
		sla.setActive(true);
		Random random = new Random();
		bidding = random.nextBoolean();
	}
	
	public boolean bid() {
		Random random = new Random();
		bidding = random.nextBoolean();
		return bidding;
	}
	
	public boolean hasConsumer() {
		if(matchedConsumer != null)
			return true;
		else return false;
	}
	
	public SLA getSla() {
		return this.sla;
	}
	
	public void setConsumer(Consumer consumer) {
		this.matchedConsumer = consumer;
	}
	
}
