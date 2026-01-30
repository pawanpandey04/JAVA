package Array;

//  Multiply odd indexed elements by  2 and add 10 to even indexed elements

public class MultplyOddElementBy2AndAdd10 {
    public static void main(String[] args) {
        // min of array
        int[] arr = {3,-2,5,-7,8};
        print(arr);
        for(int i=0;i<arr.length;i++){
            if(i%2==1) arr[i] *=2;
            else arr[i] +=10;
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}