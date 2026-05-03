class Finding_Max{
    void find_max(){
        int[] arr= {1,5,3,6,7,8,2};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value: "+max);
    }
}
public class MAX {
    public static void main(String[] args) {
        Finding_Max obj=new Finding_Max();
        obj.find_max();
    }
}


// Output:
// 8
