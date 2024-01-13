package array;

import modal1.string;

public class array_demo1 {
	
	public static void main(String[] args) {
		
		//declarction;
		int a[] = new int[5];
		//inialization
		
		a[0]=12;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
		
		System.out.println("*******************************************************");
		
		int []b = {1,2,3,4,5};
		  
		for(int i=0; i<b.length;i++) {
			
			
			System.out.println(a[i]);
			
			
		}
		
		
		
		System.out.println("**********************************************************");
		
		
		
		String subject[] = {"Java", "Php","Python","android"};		
		for(int i=0; i<subject.length;i++) {
			
			System.out.println(subject[i]);
		}
		
		
		
	System.out.println("*********************************************************************");
	
	char ch[]= {'a','b','x','y'};
	
	
	for(int i=0; i<ch.length;i++) {
		System.out.println(ch[i]);
		
	}
	
	
	}

}
