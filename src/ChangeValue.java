import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args){

        int []arr = {1,2,3,4,5};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    //in java pass by ref is not done
    //but here in this ex pass by value of copy of reference
    static void changeArr(int[] arr){
        arr[0] = 99;
    }
}
