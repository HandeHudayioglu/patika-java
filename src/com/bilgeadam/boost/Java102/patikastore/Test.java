package com.bilgeadam.boost.Java102.patikastore;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	BrandManager bm = new BrandManager();
	NotebookManager notebookManager = new NotebookManager();
	MobilePhoneManager mobilePhone = new MobilePhoneManager();
	 
	while(true) {
		System.out.println("Patika Store Product Management Panel:");
		System.out.println("1-Notebook Operations\n2-Mobile Phone Operations\n3-List Brand\n0-Log Out");
		System.out.println("Your choice: ");
		int choice;
		try {
			choice = scan.nextInt();
			System.out.println();
		} catch (Exception e) {
			System.out.println("Please enter a number! ");
			scan.nextInt();
			continue;
		}
		if(choice == 0){
            System.out.println("We hope you come again!");
            break;
        }else if(choice == 1){
            while (true) {
                System.out.println("Notebook Operations\n0 - Back\n1 - Add New Notebook\n2 - Delete a Notebook\n3 - List by Brand\n4 - List All Notebooks\n");
                System.out.print("Your choice: ");
                choice = scan.nextInt();
                scan.nextLine();

                if(choice == 0)
                    break;
                else if(choice==1) {
                	System.out.println("Enter the name of the product to be added: ");
                	String name=scan.nextLine();
                	System.out.println("Enter the brand of the product to be added: ");
                	String brandName=scan.nextLine();
                	System.out.println("Enter the price of the product to be added: ");
                	double price=scan.nextDouble();
                	scan.nextLine();
                	
                	Brand brand = bm.getBrand(brandName);
                	if(brand==null) {
                		brand = new Brand(brandName);
                		bm.add(brand);
                	}
                	
                	if (notebookManager.add(new Notebook(price,0,1,name,brand,-1,-1)))
                        System.out.println("Ürün başarıyla eklendi");
                	} else if(choice==2) {
                		System.out.println("Enter the id of the product to be deleted:");
                		int id=scan.nextInt();
                		scan.nextLine();
                		if(notebookManager.delete(id)) {
                			System.out.println("The product has been successfully deleted.");
                		} else {
                			System.out.println("The product could not be deleted, please try again!");
                		}
                	    }else if(choice==3) {
                			System.out.println("Enter brand name: ");
                			String brand = scan.nextLine();
                			notebookManager.listByBrand(brand);
                		} else if(choice==4) {
                			notebookManager.listAll();
                		} else {
                			System.out.println("You have made an invalid choice");
                			continue;
                		}
                		}  		
                	}
                		
                	}
                }
	}


	
	
