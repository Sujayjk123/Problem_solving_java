package problemsonarrays;

public class TallestMount {
    public static void main(String[] args) {
        int []heigtsOfMountains = {8848,8802,2662,8888};
        int res = findTallest(heigtsOfMountains);
        System.out.println("the tallest Mountain Height : "+res);
    }
    public static int findTallest(int[] heigtsOfMountains){
        int height =0;
        for(int i=0;i<heigtsOfMountains.length;i++){
            if(heigtsOfMountains[i]>height){
                height = heigtsOfMountains[i];
            }
        }
        return height;
    }
}
