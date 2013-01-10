package tuwien.sla12;

import java.util.ArrayList;
import java.util.Random;

public class Consumer extends User{
	private SLA sla = new SLA();
	public Boolean bidding;
	public Provider matchedProvider;
	
	public Consumer(int slanum){
		ArrayList<SLAParameter> paramlist = new ArrayList<SLAParameter>();
		ArrayList<Integer> unique = new ArrayList<Integer>(9);
		Random r = new Random();
		int result;
		if (slanum == 3) {
			result = 3;
		}
		else {
			result = r.nextInt(slanum - 3) + 3;
		}
		for (int i=paramlist.size(); i<result; i=paramlist.size()){
			r = new Random();
			Integer p = 0;
			
			//generate unique IDS
			while(true) {
				p = r.nextInt(9);
				if(!unique.contains(p)) {
					unique.add(p);
					break;
				}
			}
			SLAParameter sp = new SLAParameter(p,"param"+p);
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
	
	public boolean hasProvider() {
		if(matchedProvider != null)
			return true;
		else return false;
	}
	
	public SLA getSla() {
		return this.sla;
	}
	
	public void setProvider(Provider provider) {
		this.matchedProvider = provider;
	}
}
