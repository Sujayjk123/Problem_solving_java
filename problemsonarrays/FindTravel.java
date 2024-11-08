package problemsonarrays;

import java.util.Scanner;

public class FindTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kilometers = sc.nextInt();
        System.out.println("total kilometers travelled y chef is : "+ kilometers*2*5);
        sc.close();
    }
}
