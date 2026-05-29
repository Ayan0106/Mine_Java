// Missing Number
// output= Missing number 2

class Main {
    public static int missingnumber(int[] arr){
        int n=arr.length;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<n;i++){
            actualsum+=arr[i];
        }
        return expectedsum-actualsum;
    }
    public static void main(String[] args) {
        int[] arr={0,1,3,4,5};
        System.out.println("Missing Number "+missingnumber(arr));
        
    }
}
