package com.bilgeadam.boost.Java101.boxingmatch;

import java.util.Random;

public class Fighter {
	
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	
	
	
	public Fighter(String name, int damage, int health, int weight,int dodge) {
		super();
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if(dodge>=0 && dodge<=100) {
			this.dodge =dodge;
			
		} else {
			
			this.dodge = 0;
		}
		
		
		
		
	}
	
	public int hit(Fighter f) {
		
		
		System.out.println(this.name + " did " +this.damage+" damage to " +f.name);
		
		if(f.isDodge()) {
			
			System.out.println(f.name+ " blocked the incoming damage.");
			System.out.println("------------------------------------");
			return f.health;
		}
		
		if(f.health - this.damage <0) {
			
			return 0;
		}
		return f.health-this.damage;
	}
	
    
	//burda önce Math.random() la 0ile 1 arasında olan herhangi sayı ataması yaptık(virgüllü geleceği için yüzle çarptık)
	//sonrasında ikinci yazdığı satırla eğer dövüşçünün bloklaması random atanan bir sayıdan büyükse metodu çalıştırıyor ve 
	//bloklama sağlıyor  (%50 şans)
	boolean isDodge() {
		
		double random = Math.random()*100;
		return random<=this.dodge;
	}
	
	public Fighter isHit(Fighter f1,Fighter f2) {
		
		Random rnd = new Random(100);
		int n = rnd.nextInt();
		if(n<20) {
			
			return f1;
		}
		return f2;
	}
	
	
	

}
