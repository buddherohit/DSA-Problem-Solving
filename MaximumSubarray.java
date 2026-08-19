public class MaximumSubarray {
    static int  MaxSubArray(int arr[]){
        int sum=0;    //initialize sum to 0, this variable will keep track of the current subarray sum
        int maxi=Integer.MIN_VALUE;     //initialize maxi to the minimum value of integer, this variable will keep track of the maximum subarray sum
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];       //calculate the   current subarray sum by adding the current element to the sum
            maxi=Math.max(maxi, sum);     //update the maximum subarray sum by comparing the current subarray sum with the maximum subarray sum and taking the maximum of the two
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum subarray sum is: "+MaxSubArray(arr));
    }
}
