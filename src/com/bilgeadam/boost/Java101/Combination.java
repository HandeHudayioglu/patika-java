package com.bilgeadam.boost.Java101;

import java.util.Scanner;

public class Combination {
	
public static void main(String[] args) {
		
		
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter 'n' value: ");
        int n=scan.nextInt();
        
        System.out.print("Enter 'r' value: ");
        int r=scan.nextInt();
        int sum=1;
        int sum2=1;
        int sum3=1;
        
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        
        for(int j=1;j<=r;j++){
            sum2*=j;
        }
        
        for(int k=1;k<=(n-r);k++){
            sum3*=k;
        }
        
        System.out.println("Combination: "+(sum/(sum2*sum3)));
    }
    

}
