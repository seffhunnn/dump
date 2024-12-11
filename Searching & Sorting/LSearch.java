public class LSearch{
    public static void main(String[] args) {
        int[] arr= {25,56,97,88,23,75};
        int key = 99;
        boolean flag = false;

        for(int i =0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Key found at index "+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Key not found");
        }
    }
}