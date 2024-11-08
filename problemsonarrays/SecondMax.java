package problemsonarrays;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = 0;
        int min = 0;
        if(num1>num2 && num1>num3){
            max = num1;
        }else if(num2>num1 && num2>num3){
            max = num2;
        }else{
            max = num3;
        }if(num1<num2 && num1<num3){
            min = num1;
        }else if(num2<num1 && num2<num3){
            min = num2;
        }else{
            min = num3;
        }

        if(num1<max && num1>min){
            System.out.println("second largest : "+num1);
        }
        if(num2<max && num2>min){
            System.out.println("second largest : "+num2);
        }
       else{
            System.out.println("second largest : "+num3);
        }

        int []a = {3,6,7};
        int maxi =0;
        int secMax =0;
        int mini =0;
        for(int i=0;i<a.length;i++){
            if(maxi<a[i]){
                maxi = a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(mini>a[i]){
                mini = a[i];
            }
        }for(int i=0;i<a.length;i++){
            if(a[i]>mini && a[i]<maxi){
                System.out.println(a[i]);
            }
        }
        
            
        
        sc.close();
     }
}
