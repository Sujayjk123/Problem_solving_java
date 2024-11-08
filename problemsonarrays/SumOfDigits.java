package problemsonarrays;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int []a = {383,585,933};
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        System.out.println("sum of the array is::"+sum);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = findSum(num);
        System.out.println("the sum of digits : "+res);
        sc.close();
    }
    public static int findSum(int num){
        int sum=0;
        int rem =0;
        while(num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        return sum;
    }
}
