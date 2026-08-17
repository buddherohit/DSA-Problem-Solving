public class TwoSum {
    static int[] twoSum(int arr[], int target){
        int n=arr.length;
        for(int i=0; i<n-1; i++){        //outer loop to traverse the array
            for(int j=i+1; j<n; j++){             //inner loop start from i+1 to avoid duplicate pairs means when i=0 then j=1,2,3,4... and when i=1 then j=2,3,4...
                if(arr[i]+arr[j]==target){        //if the sum of the two elements is equal to the target then return the pair
                    int ans[]={arr[i], arr[j]};  // for index use int ans[]={i, j};
                    return ans;
                }
            }
        }
        int ans[]={};    // return empty array if no pair found
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,7,8,9,-1,-4,5,6,7,8,9,10};
        int result[]=twoSum(arr, -5);
        for(int k:result){
            System.out.print(k+" ");
        }
    }
    
}
