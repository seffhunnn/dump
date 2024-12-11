public class BSearch {
    public static void main(String[] args) {
        int[] arr = {24,34,56,63,66,69,70,75,89,92,95};

        int l=0;
        int h=arr.length-1;
        boolean flag=false;


        int key = 95;

        while(l<=h) {
            int mid = (l+h)/2;
            if (key == arr[mid]) {
                System.out.println("Key found at " + mid);
                flag = true;
                break;
            } else if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if(!flag){
            System.out.println("Key not found");
        }
    }
}
