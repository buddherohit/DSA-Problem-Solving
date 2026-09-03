public class PivotOnrotatedArray {
    static int Pivot(int arr[]){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        if(arr[start]<arr[end]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[n-1]){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        };
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int ans=Pivot(arr);{
            System.out.println("The pivot element is " + ans);
        }
    }
}
