
public class CountZeorOne {
    static int[] countZerosOnes(int arr[]){
        int zero=0;
        int one=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zero++;
            }
            else{
                one++;
            }
        }
        int ans[]={zero,one};
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,0,1};
        int ans[]=countZerosOnes(arr);
        System.out.println("The number of zeros in the array is: " + ans[0]);
        System.out.println("The number of ones in the array is: " + ans[1]);
    }
}
