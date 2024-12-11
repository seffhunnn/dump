public class RevArray {

    public static void RevArray(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void Display(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,45,14,6,75,74};

        Display(arr);
        RevArray(arr);
        System.out.println();
        Display(arr);

    }
}
