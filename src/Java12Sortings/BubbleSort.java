package Java12Sortings;

public class BubbleSort {

    public static void increaseSort(int[] arr){
        int len = arr.length;

        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void decreaseSort(int[] arr){
        int len = arr.length;

        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void optimiseBubble(int[] arr){
        int len = arr.length;

        for (int i = 0; i < len-1; i++) {
            boolean flag = false;
            for (int j = 0; j < len-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){  //Have any swaps Happened
                return;
            }
        }
    }
    public static void main(String[] args) {

//        int[] arr = {4, 1, 2, 3, 5, 6};
        int[] arr = { 4, 3, 5, 4, 2, 1};

//        increaseSort(arr);
//        decreaseSort(arr);

        optimiseBubble(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }


    }
}
