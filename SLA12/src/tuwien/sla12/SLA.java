package tuwien.sla12;

import java.util.ArrayList;

public class SLA {
	private int ID;
	private ArrayList<SLAParameter> paramlist;
	private Boolean active;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public SLA(int id, ArrayList<SLAParameter> sp, Boolean a){
		this.ID=id;
		this.paramlist=sp;
		this.active=a;
	}
	public ArrayList<SLAParameter> getParamlist() {
		return paramlist;
	}
	public void setParamlist(ArrayList<SLAParameter> paramlist) {
		this.paramlist = paramlist;
	}
	
}
