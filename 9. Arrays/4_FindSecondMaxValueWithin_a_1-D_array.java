// Find the second largest element in an array... Better way.. for repitative numbers.
class Main {
    public static int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        if(arr==null || arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=max){
                second_max=arr[i];
            }
        }
        return second_max;
    }
    public static void main(String[] args) {
        int[] arr={12,41,5,78,46,78,46};
        System.out.println(findSecondMax(arr));
    }
}











