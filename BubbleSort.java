import java.lang.Math;
public class BubbleSort {

    public static void main(String[] args){
        int[] arr = new int[6];
        int a = 2;
        int b = 20;

        for(int i = 0; i< arr.length; i++){
            arr[i] = (int) ((Math.random() * (b - a + 1))+a);
            System.out.println("Random number: " + arr[i]);
        }

        sort(arr);

    }

    static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }

}
