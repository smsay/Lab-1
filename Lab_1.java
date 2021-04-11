package day14;

public class Lab_1 {
//QUESTÝON1
	public static void main(String[] args) {
		stringTimes("Hi",5);
		love6(6,12);
        specialEleven(23);
        deerPlay(95,false);
        caughtSpeeding(65,true);
        cigarParty(50,false);
	}
   public static void stringTimes(String name,int i) {
	  for(int j=0;j<i;j++) {
		  
	      System.out.print(name);
	      
   }System.out.println();}
	  
//QUESTÝON2------------------------------------
	  
	public static void love6(int num1,int num2) {
		  if(num1==6 || num2==6 ||num1+num2==6 || num1-num2==6 || num2-num1==6) {
			  System.out.println("true");
		  }else {
			  System.out.println("false");
		  }}
	  
//QUESTÝON3-----------------------------------------
		  
		 public static void specialEleven(int i) {
			if(i%11==0 || i%11==1) {
System.out.println(true);
			}else {
				System.out.println(false);
			}	 
		 }
	  
//QUESTÝON4-------------------------------------------
		 
	public static void deerPlay(int temp,boolean summer) {
		if(summer) {
			if(temp>60 && temp<100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>60 && temp<90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
	}
	  
//QUESTÝON5-------------------------------------------------
	
	public static void caughtSpeeding(int speed, boolean birthDay) {
		if(birthDay) {
			if(speed<=65) {
				System.out.println(0);
			}else if(speed>=66 && speed <=85) {
				System.out.println(1);
			}else if(speed>=86) {
				System.out.println(2);
			}
		}else {
			if(speed<=60) {
				System.out.println(0);
			}else if(speed>=61 && speed <=80) {
				System.out.println(1);
			}else if(speed>=81) {
				System.out.println(2);
			}
		}}
//QUESTÝON6------------------------------------------
		public static void cigarParty(int cigar, boolean weekend ) {
			if(weekend) {
				if(cigar>=40) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}else {
				if(cigar>=40 && cigar<=60) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
		}
		
		
		
	}	
	  
