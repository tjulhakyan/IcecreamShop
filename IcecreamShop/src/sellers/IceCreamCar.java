package sellers;

import java.util.concurrent.TimeUnit;

import eatables.*;
import exceptions.NoMoreIceCreamException;
import exceptions.Stock;
import sorten.Flavor;
import sorten.MagnumType;

public class IceCreamCar implements IceCreamSeller{
	
	private Pricelist pricelist;
	private Stock stock;
	private double profit;
	
	public IceCreamCar(Stock stock, Pricelist pricelist) {
		this.stock=stock;
		this.pricelist=pricelist;
		this.profit=0;
	}
	
	public Cone orderCone(Flavor[] flavor) {
		Cone cone= new Cone(flavor);
		if(flavor.length>stock.getCones()) {
			try {
				prepareCone(flavor);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.profit+=flavor.length*pricelist.getBallPrice();
		stock.setCones(stock.getCones()-flavor.length);
		return cone;
	}
	
	private void prepareCone(Flavor[] flavor) throws InterruptedException {
		System.out.println("Soryy, but we don't have "+flavor.length+" 'Cones'. I have only "+stock.getCones());
		if(stock.getCones()>0) {
			System.out.print("I can give you: ( ");
			for (int i = 0; i < stock.getCones(); i++) {
				System.out.print(flavor[i]+" ");
			}
			System.out.println(") and the rest I will give you when I come back.");
		}
		System.out.println("Now you need to wait a bit to bring a new portion of ice cream.");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("Thanks for wait !!! \nNow I can give you the rest.\n");
		stock.setCones(flavor.length+30);
	}
	
	public IceRocket orderIceRocket() {
		IceRocket iceRocket;
		if(0>=stock.getIceRockets()) {
			iceRocket=prepareIceRocket();
		} else {
			iceRocket=new IceRocket();
			stock.setIceRockets(stock.getIceRockets()-1);
		}
		this.profit+=pricelist.getRocketPrice();
		
		return iceRocket;
	}
	
	private IceRocket prepareIceRocket(){

		System.out.println("Sorry, but we don't have 'IceRocket'");
		return null;
	}
	
	
	
	public Magnum orderMagnum(MagnumType magnumType) {
		Magnum magnum;
		System.out.println("++++ "+stock.getMagni()+" ******");
		if(0>=stock.getMagni()) {
			magnum=prepareMagnum(magnumType);
		} else {
			magnum=new Magnum(magnumType);
			stock.setMagni(stock.getMagni()-1);
		}
		this.profit+=pricelist.getMagnumPrice(magnumType);
		return magnum;
	}
	
	private Magnum prepareMagnum(MagnumType magnumType){
		System.out.println("Sorry, but we don't have 'Magnum'");
		return null;
	}
	
	
	public NoMoreIceCreamException orderNoMoreIceCreamException() {
		NoMoreIceCreamException noMoreIceCreamException=new NoMoreIceCreamException();
		
		if(0>=stock.getBalls()) {
			System.out.println("Now you need to wait a bit to bring a new portion of ice cream.");
			for (int i = 5; i >= 0; i--) {
				System.out.println(i);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			stock.setBalls(30);
		}
		stock.setMagni(stock.getBalls()-1);
		this.profit+=pricelist.getBallPrice();
		return noMoreIceCreamException;
	}
	
	public double getProfit() {
		return this.profit;
	}
	
	
}
