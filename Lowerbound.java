public class Lowerbound {
    static int LowerBound(int arr[], int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while (start<=end) {
            int mid= start+(end-start);
            if (arr[mid]>=target) {
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,40,40,40,50};
        int target=40;
        int ans=LowerBound(arr, target);
        System.out.println("The lower bound element is: "+ ans);
    }
    
}
