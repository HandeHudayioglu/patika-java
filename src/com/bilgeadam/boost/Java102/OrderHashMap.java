package com.bilgeadam.boost.Java102;

import java.util.HashMap;

public class OrderHashMap {
	
	HashMap <String,Integer> players = new HashMap<>();
	
	public void addPlayer(String name,int p) {
		
		players.put(name, p);
	}
	
	public void getWinner() {   // girilen p değerine göre sıralama yapma
		
		System.out.println(players.entrySet().stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());
	}
	
	public void getWinnerPoint() {
		
		System.out.println(players.entrySet().stream().max((entry1,entry2) -> entry1.getValue() > entry2.getValue()? 1:-1).get().getValue());
	}
	
	public static void main(String[] args) {
		
		OrderHashMap obj = new OrderHashMap();
		
		obj.addPlayer("Hande", 55);
		obj.addPlayer("Maya", 90);
		obj.addPlayer("John", 80);
		
//		for (String name : obj.players.keySet()) {
//			
//			System.out.println(name);
//			
//		}
//		
//		for (Integer point : obj.players.values()) {
//			
//			System.out.println(point);
//			
//		}
		
		//obj.getWinner();
		obj.getWinnerPoint();
	}

}
