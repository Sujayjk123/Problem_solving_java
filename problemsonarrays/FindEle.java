package problemsonarrays;

public class FindEle {
    public static void main(String[] args) {
        int[] a ={2,3,4,5,6};
        
      
        int x = 4;
        boolean res = findEle(a,x);
        if(res==true){
            System.out.println("YES");;
        }else{
            System.out.println("No");
        }
    }

   static boolean findEle(int []a,int x){
    int len = a.length;
    for(int i=0;i<len;i++){
        if(a[i] == x){
            return true;
        }
    }
    return false;
   }
}
