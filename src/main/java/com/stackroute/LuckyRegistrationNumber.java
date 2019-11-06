package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

//Complete the code below as given in the problem.md file
public class LuckyRegistrationNumber {

   
    public static int checkRegistrationNumber(String regNumber) {
       
    	String[] str = null;
    	String[] str2= null;
    	int sumLuckyNum =0;
    	
    	if((null == regNumber) || (regNumber.isEmpty())) {
    		
    		return -1;
    	}
    	
    	str = regNumber.split("\\D+");
		str2 = regNumber.split("\\d+");
		
    	if(regNumber.startsWith("KA") || regNumber.startsWith("DL")) {
    		
    		//str[0].replace(" ", "");
    		
    		/*System.out.println("str2 length" + str2.length);
    		for(String s : str2) {
    			System.out.println(s);
    		}*/
    		if((str[1].length()==2) &&(str[1]!="00") && (str[1].matches("\\d+")) && (Integer.parseInt(str[1])<=10)) {
    			
    			if(str2[1].length()>=1 && str2[1].length()<=2 && !(str.equals(str2[1].toLowerCase())) && str2[1].matches("\\w+")) {
    				
    				
    				if((str[2].length()==4)&& ((Integer.parseInt(str[2])>=1000) && (Integer.parseInt(str[2])<=9999))) {
        				
        				int luckyNum = Integer.parseInt(str[2]);
        				while(luckyNum>0) {
        					int temp = luckyNum%10;
        					sumLuckyNum+=temp;
        					luckyNum=luckyNum/10;
        				}
        				
        				sumLuckyNum = (sumLuckyNum/10)+(sumLuckyNum%10);
        				//System.out.println("lucky num" + sumLuckyNum);
        					if(sumLuckyNum==6) {
        						return 1;
        					}
        					
        					return 0;
        				}
        				return -1;    				
        			}
        			else {
        				return -1;
        			}
    			}
    			else {
    				return -1;
    			}   			   			
    			
    		}
    		
    	return -1;
    }

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
    	Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
	int regNum = checkRegistrationNumber(str);
	
	if(regNum ==1) {
		System.out.println("Lucky Registration Number");
	}
	else if(regNum ==0) {
		System.out.println("Valid Registration Number");
	}
	else {
		System.out.println("Invalid Registration Number");
	}
    
    }

}