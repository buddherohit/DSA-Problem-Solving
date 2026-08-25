public class NumberOfOccurances {
    static int Upper(int arr[], int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while (start<=end) {
            int mid=start+(end-start);
            if(arr[mid]<=target){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
            
        }
        return ans;

    }
    static int Lower(int arr[], int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while (start<=end) {
            int mid=start+(end-start);
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
        int arr[]={10,20,20,20,20,20,40,50};
        int target=20;
        int Ub=Upper(arr, target);
        int Lb=Lower(arr, target);
        int ans=Ub-Lb;
        System.out.println("The Number of occurance is: "+ ans);
    }
}
