public class RBinSearch {

    public static int RBinS(int[] arr,int l,int h,int key){
        if(l<=h){
            int mid = (l+h)/2;

            if(key==arr[mid])
                return mid;

            else if(key<arr[mid])
                return RBinS(arr,l,mid-1,key);

            else
                return RBinS(arr,mid+1,h,key);

        }
        return -1;
    }


    public static void main(String[] args) {

        int[] arr ={4,15,26,34,46,57,64,78,83,97};
        int l=0;
        int h= arr.length-1;

        int key=99;

        int result = RBinS(arr,l,h,key);

        if(result == -1)
            System.out.println("Key not found");

        else
            System.out.println("Key found at "+result);
    }
}

