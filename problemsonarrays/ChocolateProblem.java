package problemsonarrays;

import java.util.Scanner;

public class ChocolateProblem {
    public static void main(String[] args) {
        // int totalChoco = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("goal to sell :");
        int goalToSell = sc.nextInt();
        int totalEarn =0;
        System.out.println();
        System.out.print("actuall number of chocos sold: ");
        int totalSoldInDay = sc.nextInt();
        if(totalSoldInDay<=100){
        if(totalSoldInDay <= goalToSell){
            totalEarn = totalSoldInDay;
        }else{
            int sale = totalSoldInDay - goalToSell;
            totalEarn = goalToSell + sale*2;
        }
    }
        System.out.println();
        System.out.println("total money earned : "+totalEarn);
        sc.close();
    }
}
