package problemsonarrays;

public class FindMax {
    public static void main(String[] args) {
        int []a = {2,2,1,3,5};
        int sum = findMaxSum(a);
        System.out.println(sum);
    }
    public static int findMaxSum(int[] a){
        int sum =0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if( a[i]!=a[j]){
                    sum = a[i]+a[j];
                }
            }
        }
        return sum;
    }
}
