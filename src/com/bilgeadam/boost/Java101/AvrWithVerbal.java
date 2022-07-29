package com.bilgeadam.boost.Java101;

public class AvrWithVerbal {
	
	String name;
	int note;
	int verbalNote;
	int studentId;
	
	
	public void avg(int note,int verbalNote) {
		
		if((note>0 && verbalNote>0) && (note<100 && verbalNote<100)) {
		
		double avg = (verbalNote*0.20) + (note*0.80);
		System.out.println(avg);
	} else {
		
		
		System.out.println("Please check the notes");
	}
	
	}
	
	public static void main(String[] args) {
		
		AvrWithVerbal avr = new AvrWithVerbal();
		avr.avg(70, 40);
		avr.avg(0,20);
		avr.avg(123, 40);
		
		
		
	}

}
