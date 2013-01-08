package tuwien.sla12;

import java.util.Date;

public class Simulation{
	
	public Auction auction;
	public int nrSLAs;
	public int nrConsumer;
	public int nrProvider;
	
	public Simulation(int slaParams, AuctionType at, int aID, int consumer, int provider, Date duration){
		auction = new Auction(aID,at);
		this.nrSLAs = slaParams;
		this.nrConsumer = consumer;
		this.nrProvider = provider;
		this.auction.setDuration(duration);
		
	}
	
	
	
	public void start(){
		
		for(int i=1; i<=nrProvider;i++){
			Provider p = new Provider();
			auction.provide(p);
		}
		for(int i=1; i<=nrConsumer; i++) {
			Consumer c = new Consumer();
			auction.consume(c);
		}
		
		while (new Date().before(auction.getDuration())) {
			auction.startAuction();
		}
		
	}
	
}
