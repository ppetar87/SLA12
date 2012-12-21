package tuwien.sla12.client;

public class SLAParameter {
	private int ID;
	private String name;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public SLAParameter(int id, String name){
		this.ID =id;
		this.name = name;
	}
	
}
