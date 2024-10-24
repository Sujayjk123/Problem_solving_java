public class Problems {
    public static void main(String[] args) {

        //sum of array and count even and odd
        int []a = {2,4,5,2,6,2,7};
        int sum =0;
        int countEven = 0;
        int countOdd = 0;

        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
            if(a[i]!=0){
            if(a[i]%2 ==0){
                countEven++;
            }else{
            countOdd++;
            }
        }
    }
        System.out.println("sum of array : "+ sum);
        System.out.println("even number count :"+countEven);
        System.out.println("even number count :"+countOdd);

        //occurance of each letter
        char character = 'm';
        String lang = "malayalam";
        char []langA = lang.toCharArray();
        for(int i=0;i<langA.length;i++){

            if(character == langA[i]){
               System.out.println("position " + i);
            }
            
        } 



       
       
    }
}
