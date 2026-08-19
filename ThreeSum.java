public class ThreeSum {
    static int[]ThreeSum(int arr[], int target){
        int n=arr.length;
        for(int i=0; i<n-2; i++){            //outer loop traverse to 0 to n-2 because we need 3 elements to sum up to target for eg if n=6 then i=0,1,2,3 and j=1,2,3,4 and k=2,3,4,5 so we need to traverse till n-2
            for(int j=i+1; j<n-1; j++){        //inner loop traverse to 1 to n-1 because we need 3 elements to sum up to target for eg if n=6 then i=0,1,2,3 and j=1,2,3,4 and k=2,3,4,5 so we need to traverse till n-1
                for(int k=j+1; k<n; k++){       //innermost loop traverse to 2 to n because we need 3 elements to sum up to target for eg if n=6 then i=0,1,2,3 and j=1,2,3,4 and k=2,3,4,5 so we need to traverse till n
                    if(arr[i]+arr[j]+arr[k]==target){
                        int ans[]={i, j, k};   //return the indices of the elements that sum up to target   
                        return ans;
                        
                    }
                }
            }
        }
        int ans[]={};
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,5,4,6};
        int result[]=ThreeSum(arr, 15);
        for(int k:result){
            System.out.print(k+" ");
        }
    }
}
