package tuwien.sla12;

import java.util.Date;

public class Auction {
	
	private int ID;
	private AuctionType type;
	//private SLA SLAprovider;
	//private double price;
	private Date duration;
	
	public Auction(int ID, AuctionType type){
		this.setID(ID);
		this.setType(type);
	}
	
	public void consume(Consumer c){
		
	}
	
	public void provide(Provider p){
		
	}

	public AuctionType getType() {
		return type;
	}

	public void setType(AuctionType type) {
		this.type = type;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}
}
