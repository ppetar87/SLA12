package tuwien.sla12;

import java.util.ArrayList;
import java.util.Random;

public class Provider extends User{

	public SLA sla;
	
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
		
	}
	
}
