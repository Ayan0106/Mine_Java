// Search an item within an array if it is not found then return -1
class First{
    void search_in_array(){
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int item=5;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
public class New {
    public static void main(String[] args) {
        First obj=new First();
        obj.search_in_array();
    }
}

// output
// 4
