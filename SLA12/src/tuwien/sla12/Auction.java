package tuwien.sla12;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class Auction {
	
	private int ID;
	private AuctionType type;
	//private SLA SLAprovider;
	//private double price;
	private Date duration;
	private ArrayList<Consumer> cl = new ArrayList<Consumer>();
	private ArrayList<Provider> pl = new ArrayList<Provider>();
	private HashMap<Consumer, Provider> matched = new HashMap<Consumer, Provider>();
	private Provider currentP = null;
	private Consumer currentC = null;
	
	
	public Auction(int ID, AuctionType type){
		this.setID(ID);
		this.setType(type);
	}
	
	public void consume(Consumer c){
		if (!cl.contains(c))
			cl.add(c);
	}
	
	public void provide(Provider p){
		if(!pl.contains(p))
			pl.add(p);
	}
	
/*	public void consumerBid(Consumer c){
		switch (type) {
		case REVERSE_ENGLISH_AUCTION:
			consumeReverseEnglish(c);
			break;
		case DUTCH_AUCTION:
			consumeDutch(c);
			break;
		case DOUBLE_AUCTION:
			consumeDouble(c);
			break;
		}
	}
	
	public void providerBid(Provider p){
		switch (type) {
		case REVERSE_ENGLISH_AUCTION:
			provideReverseEnglish(p);
			break;
		case DUTCH_AUCTION:
			provideDutch(p);
			break;
		case DOUBLE_AUCTION:
			provideDouble(p);
			break;
		}
	}*/
	
	public void startREAuction(){
		for (Consumer con : cl) {
			currentC = con;
			provideReverseEnglish();
			if (currentC != null && currentP != null) {
				matched.put(currentC, currentP);
			}
		}
	}
	
	public void startDutchAuction(){
		
	}
	
	public void startDoubleAuction(){
		
	}
	
	/*public void consumeReverseEnglish(){
		for (Consumer con : cl) {
			if (con.bidding) {
				currentC = con;
				Random random = new Random();
				con.bidding = random.nextBoolean();
			}
		}
	}*/

	public void provideReverseEnglish(){
		Boolean bid=false;
		do {	
			for (Provider prov : pl) {
				if (prov.bidding){
					currentP = prov;
					Random random = new Random();
					prov.bidding = random.nextBoolean();
				}
			}
			for (Provider prov : pl) {
				if (prov.bidding) 
					bid=true;
			}
		} while (bid);
	}
	
	public void consumeDutch(){
		
	}

	public void provideDutch(){
		
	}
	
	public void consumeDouble(){
		
	}

	public void provideDouble(){
		
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

	public Provider getCurrentP() {
		return currentP;
	}

	public void setCurrentP(Provider currentP) {
		this.currentP = currentP;
	}

	public Consumer getCurrentC() {
		return currentC;
	}

	public void setCurrentC(Consumer currentC) {
		this.currentC = currentC;
	}
}
