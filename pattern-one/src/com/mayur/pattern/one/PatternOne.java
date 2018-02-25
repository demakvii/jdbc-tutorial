package com.mayur.pattern.one;

import java.util.ArrayList;
import java.util.HashSet;

public class PatternOne {

	public static void  main(String args[]) {
		
		String aplha = "ABCDEFGHIJKLMNOPQRST";
		HashSet<String> strings = new HashSet<String>();
		ArrayList<String> aplhaList = new ArrayList<String>();
		for(int i =0; i<aplha.length();i++)
		{	aplhaList.add(aplha.substring(i, i+1));
			
		}
		int movement=0;
		int semi_movement=0;
		int additional_movement=0;
		for(int index =0;index<4;index++){
			System.out.print("A");
			
			for (int index1 = 1; index1 < aplha.length(); index1++) {
				
				if(index1+movement+semi_movement+additional_movement<aplha.length())
					System.out.print(aplha.charAt(index1+movement+semi_movement+additional_movement));
				if(movement!=0){
					semi_movement++;
					if(index1%2!=0)
					if(index>1)
						additional_movement=1;
					else
						additional_movement=0;
					
				}
			}
			System.out.println();
			
			movement+=1;
			semi_movement=0;
			additional_movement+=1;
			
		}
	}

}
