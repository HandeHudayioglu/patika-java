package com.bilgeadam.boost.Java102.listclass;

public class MyList <T>{
	
	private T [] list;
	
	public MyList() {
		
		this.list = (T[]) new Object[10];
	}
	
	public MyList(int capacity) {
		
		this.list = (T[]) new Object[capacity];
	}
	
	public int size() {
		
		int count=0;
		
		for (T t : list) {
			
			if(t!=null)
			count++;
		}
		
		return count;
	}
	
	public int getCapacity() {
		
		return list.length;
	}
	
	public void add(T data) {
		
		
		int index=-1;
		//bu for döngüsüyle dizinin içinde boş yer var mı onu kontrol ediypruz, indexin ilk değerini -1 aldık, çünkü eğer boş
		//yer varsa 0 dan başlayarak indexi o sayıyla değitirebilsin diye eğer 0 deseydik i 0 olduğunda yine 0 olacaktı 
		for( int i=0; i<list.length;i++) {
			
			if (list[i]==null) {
				
				index=i;
				break;
			}
		}
		
		
		//burda da eğer index hala -1 se (bu da listede hiç boş yer yok anlamına geliyor) liste kapasitesini
		//iki katına çıkarıyoruz 
		if(index==-1) {
			
			index=list.length;
			T[] temp = (T[]) new Object [list.length*2];
			
			for(int i=0; i<list.length; i++) {
				
				temp[i]=list[i];  //ilk listenin elemanlarını ikinci liste olan tempe aktardık
				
				list =temp;
			}
			
			list[index]=data; // yeni veri ekleniyor
		}
	}
		
		public T get(int index) {  // verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
			
			if(index>=0 && index<list.length) 
				
				return list[index];
			
			 else 
				return null;
			
		}
		
		public void remove(int index) {  //verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. 
		                                 //Geçersiz indis girilerse null döndürür.
			
			if(index < 0 || index >= list.length)
				return;
			
			if(index == size()-1) {
				list[index] = null;
				return;
			}
			
			while(list[index] != null && index < list.length - 1)
				list[index] = list[++index];
			
			if(index == list.length-1)
				list[index] = null;
		}
		
	     public void set(int index, T data) {  //verilen indisteki veriyi yenisi ile değiştirme işlemi yapılıyor Geçersiz indis girilerse null döndürür.
					
	    	 if(index >= 0 && index < list.length) 
						
	    		     list[index] = data;
				}
	           
	     public int indexOf(T data) {  //Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
//	    	 
//	    	 int size = size();
//             for(int i=0; i<size; i++) {
//	 			if(list[i] == data)
//	 				return i;
//	 		}
//	 		return -1;
//	    	 
	    	 	 
	    	 int i=0;
	 		while(list[i] != null) {
	 			if(list[i] == data)
	 				return i;
	 			i++;
	 		}
	 		return -1;
	 	}
	      
	    	
	     
	     public int lastIndexOf(T data) { //Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
	    		
	    		int last = size()-1;
	    		
	    		
	    		for(int i=last; i>=0; i--) {
	    			if(list[i] == data)
	    				return i;
	    			
	    		}
	    		return -1;
	    	}	
	     
	     
	     public boolean isEmpty() {
	 		
	    	 
	    	 for(T i : list) {
	 			
	    		 
	    		 if(i != null)
	 				return false;
	 		}
	 		return true;
	 	}
	     
	     
	     
	     public T[] toArray() {  // Listedeki öğeleri, aynı sırayla bir array haline getirir.
	 		
	    	 int size = size();
	 		
	    	 T[] arr = (T[]) new Object[size];
	 		
	    	 for(int i=0; i<size; i++) 
	 			
	    		 arr[i] = list[i];
	 		
	    	 return arr;
	 	}
	    	 
	     
	     public void clear() {  //Listedeki bütün öğeleri siler, boş liste haline getirir.(boş yeni bi liste atanmış)
	 		
	    	 this.list = (T[]) new Object[10];
	 	}
	     
	     
	     public MyList<T> subList(int start, int finish) {   //Parametrede verilen indeks aralığına ait bir liste döner.
	 		
	    	 if(start < 0 || finish > size())
	 			
	    		 return null;
	 		
	 		MyList<T> result = new MyList<>(finish-start);
	 		
	 		for(int i=start; i<finish; i++)
	 			
	 			result.add(list[i]);
	 		
	 		return result;
	 	}
	     
	     
	     public boolean contains(T data) {
	 		
	    	 int size = size();
	 		
	    	 for(int i=0; i<size; i++) {
	 			
	    		 if(list[i] == data)
	 				return true;
	 		}
	 		return false;
	 	}

	     
	     public String toString() {
	 		
	    	 int size = size();
	 		
	    	 if(size < 1)
	 			return "[]";
	 		
	 		String result="[";
	 		
	 		for(int i=0; i<size; i++) {
	 				result += list[i];
	 				result += ", ";
	 		}
	 		
	 		result = result.substring(0, result.length()-2);
	 		result += "]";
	 		return result;
	    	 
	     }
	     
}
		
	


