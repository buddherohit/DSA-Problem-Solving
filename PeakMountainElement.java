public class PeakMountainElement {
    static int mountainElement(int arr[]){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,2};
        int ans=mountainElement(arr);{
            System.out.println("The mountain element is " + ans);
        }
    }
}
