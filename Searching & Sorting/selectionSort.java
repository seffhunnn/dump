public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {23,41,21,34,12,415,61,16,5};

        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
