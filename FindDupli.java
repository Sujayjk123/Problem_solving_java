public class FindDupli {
    public static void main(String[] args) {
        int []myArray = {22,3,28,18,3,22};
        int isDupli = findDupli(myArray);
        System.out.println(isDupli);

        int noDupliarray[] = removeDuplicates(myArray);
        for(int i=0;i<noDupliarray.length;i++){
            System.out.println(noDupliarray[i]);
        }
    }

    public static int findDupli(int []a){

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    a[i] =0;
                }
            }
        }
        return -1;
    }
    
     public static int[] removeDuplicates(int[] array) {
        
        int[] tempArray = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }
        int[] resultArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            resultArray[i] = tempArray[i];
        }

        return resultArray;
    }

}
