package com.bilgeadam.boost.Java101;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		
		 //izideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir.
        // Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
		 int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

	        Arrays.sort(liste);  //önce diziyi sıraladık
	        System.out.println(Arrays.toString(liste));

	        int index = Arrays.binarySearch(liste, 33);  //burda da 33 ün indeksini buluyoruz 
	        System.out.println("33'ün indeksi :" + index);
	    }

	}


