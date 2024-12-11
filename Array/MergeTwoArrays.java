public class MergeTwoArrays {

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];

        int index=0;

        for(int i=0;i<arr1.length;i++){
            mergedArray[index++]= arr1[i];
        }

        for(int i =0;i<arr2.length;i++){
            mergedArray[index++]=arr2[i];
        }

        return mergedArray;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6};
        int[] arr2= {7,8,9,10};

        int[] mergedArray = mergeArray(arr1,arr2);
        printArray(mergedArray);
    }
}
