package com.bilgeadam.boost.Java101.boxingmatch;

public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	public void start() {
		
		if(isCheck()) {
			
			
			while(this.f1.health>0 && this.f2.health>0) {
				
				
				System.out.println("------NEW ROUND------");
				this.f2.health = this.f1.hit(this.f2);  //f1 f2 ye vuruyor
				if(isWin()) {
					break;
				}
				this.f1.health = this.f2.hit(this.f1);  //f2 f1 e vuruyor
				if(isWin()) {
					break;
				}
				System.out.println(this.f1.name + " Health: "+this.f1.health);
				System.out.println(this.f2.name + " Health: "+this.f2.health);
			}
			
			
		} else {
			
			System.out.println("The fighters' weight don't match.");
		}
	}
	
	 boolean isCheck() {
		
		//her iki ihtimal de true olduğu için yani 1 ve 1 olarak döndüğü için true olacak
		return (this.f1.weight >= minWeight  && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
	}
	
	boolean isWin() {
		
		if(this.f1.health==0) {
			
			System.out.println("*****************************");
			System.out.println(this.f2.name +" won!");
			return true;
		}
		if(this.f2.health==0) {
			
			System.out.println("*****************************");
			System.out.println(this.f1.name +" won!");
			return true;
		}
		
		return false;
	}
	
	

}
