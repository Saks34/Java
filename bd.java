public class bd {
    public static int[] bubble(int [] arr){
        int temp;
        boolean swapped;
        for(int i =0;i<arr.length;i++){
            swapped =false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
                
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
public static void main(String[] args){
     int [] arr = {20,5,9,40,2,32,11};
     int [] b = bubble(arr);
    for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
    }
}    

}
