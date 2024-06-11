package Com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Suku {

    public static void suSorting(int[] arr){

        for (int s = 0; s < arr.length-1; s++) {
            for (int k = 1; k < arr.length-1 ; k++) {
                if (arr[s]>arr[k]){
                    int temp;
                    temp=arr[s];
                    arr[s]=arr[k];
                    arr[k]=temp;
                }else {
//                    s++;
//                    k++;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sudhanshu is coding ");
        int[] suArr={1,5,2,4};
        suSorting(suArr);

        Arrays.sort(suArr);

    }
}