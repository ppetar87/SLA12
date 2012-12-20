package tuwien.sla12.client;

public class SLA {
	private int ID;
	private SLAParameter sp;
	private Boolean active;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public SLAParameter getSp() {
		return sp;
	}
	public void setSp(SLAParameter sp) {
		this.sp = sp;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
