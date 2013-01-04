package tuwien.sla12;

import java.util.Date;

public class Simulation{
	
	public Auction auction;
	public int nrSLAs;
	public int nrConsumer;
	public int nrProvider;
	
	public Simulation(int slaParams, AuctionType at, int aID, int consumer, int provider, Date duration){
		this.auction.setType(at);
		this.auction.setID(aID);
		this.nrSLAs = slaParams;
		this.nrConsumer = consumer;
		this.nrProvider = provider;
		this.auction.setDuration(duration);
		
	}
	
	
	
	public void start(){
		
		for(int i=0; i<=nrProvider;i++){
			Provider p = new Provider();
			auction.provide(p);
		}
		for(int i=0; i<=nrConsumer; i++) {
			Consumer c = new Consumer();
			auction.consume(c);
		}
		
		while (new Date().before(auction.getDuration())) {
			
		}
		
	}
	
}
