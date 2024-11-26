package com.xworkz.Exeptionexample;

public class Runner {
	
	
	public static void main(String[] args) {
       
        String myName = null;
        
        try {
        	System.out.println(myName.charAt(0));
        }catch(Exception e) {
        	System.out.println(e);
        }
        
        
        if(myName == null) {
        	myName = "sujay";
        }
        else {
        	System.out.println("string is not null");
        }
    
        
        TeleVision tv = new TeleVision();

     
        Object obj = new Object();

        if (obj instanceof TeleVision) {
    	 TeleVision televiosions = (TeleVision) obj;
         televiosions.start();
        } else {
         System.out.println("Downcasting not possible.");
        }

     
        if (obj instanceof ElecronicsApllliences) {
    	 ElecronicsApllliences electronics = (ElecronicsApllliences) obj;
         electronics.start();
        } else {
         System.out.println("Downcasting not possible.");
     
        }
        
        if (tv instanceof Object) {
       	 TeleVision televiosions = (TeleVision) tv;
            televiosions.start();
           } else {
            System.out.println("Downcasting not possible.");
           }

        
           if (tv instanceof ElecronicsApllliences) {
       	 ElecronicsApllliences electronics = (ElecronicsApllliences) tv;
            electronics.start();
           } else {
            System.out.println("Downcasting not possible.");
        
           }
        
        

       
	}
}

