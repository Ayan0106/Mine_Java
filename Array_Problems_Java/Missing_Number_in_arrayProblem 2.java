// Constraints 
// when the array starts with 0

public class MissingNum {
    static int Missingnum(int[] arr){

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int actualsum=(arr.length*(arr.length+1))/2;
        int missingnum=actualsum-sum;
        return missingnum;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,5};
        int result=Missingnum(arr);
        System.out.println(result);
    }
}

// Output ...
// 4                 

