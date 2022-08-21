package com.bilgeadam.boost.Java102.fixturebuilder;

import java.util.LinkedList;
import java.util.List;

public class TeamsController {
	
	List<String> teams = new LinkedList<>();
	
	public void ligFixture() {
		
		if(teams.size()%2!=0) {
			
			teams.add("Bay");
		}
		
		if(teams.size()!=0 ) {
			
			System.out.println("The teams: ");
           for (String string : teams) {
				System.out.println(string + ",");
			}
		} else {
        	   System.out.println("No team.");
           }
			System.out.println();
			round();
		}

	private void round() {
		
		 List<String> weeks = new LinkedList<>();
		 int round= 2 * (teams.size() - 1);
		 
		
	}
	}


