package Java12Sortings;

public class SelectionSort {
    public static void increaseSelection(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len-1; i++){
            int min_index = i;
            for(int j = i+1; j < len; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void decreaseSelection(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len-1; i++){
            int min_index = i;
            for(int j = i+1; j < len; j++){
                if(arr[j] > arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 5, 4 , 1 , 3};

//        increaseSelection(arr);
        decreaseSelection(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
