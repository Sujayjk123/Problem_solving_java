package problemsonarrays;

import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = 400;
        int timeOfAlice = sc.nextInt();
        int timeOfBob = sc.nextInt();
        int timeofCharlie = sc.nextInt();
         findMaxAverage(distance,timeOfAlice,timeOfBob,timeofCharlie);
         sc.close();
        
    }
    public static void findMaxAverage(int d,int X,int Y,int Z){
        
        float averageX = d/X;
        float averageY = d/Y;
        float averageZ = d/Z;
        if(averageX>averageY && averageX>averageZ){
            System.out.println("Alice has maximum speed with "+ averageX+"m/s");
        }else if(averageY>averageX && averageX>averageZ){
            System.out.println("Bob has maximum speed with "+ averageY+"m/s");

        }else{
            System.out.println("Charlie has maximum speed with "+ averageZ+"m/s");

        }
        
    }
}
