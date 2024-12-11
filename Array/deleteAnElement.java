public class deleteAnElement {

    public static int delete(int[] arr,int index){
        if(index >=0 && index <arr.length){
            int x = arr[index];

            for(int i = index; i<arr.length-1;i++){
                arr[i]= arr[i+1];
            }
            return x;
        }
        return -1;
    }
    public static void display(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr ={2,4,5,6,7,9};
        display(arr);

        System.out.println(delete(arr,1));
        display(arr);

    }
}
