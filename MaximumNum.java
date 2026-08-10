// This is a program to find the maximum number in an array.
// for eg given array is [1,2,3,4,5] then the maximum number is 5.
public class MaximumNum {
    static int MaxNum(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]> max){
                max=arr[i];
            }
            
            
        }
        return max;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans=MaxNum(arr);
        System.out.println("The maximum number in the array is: " + ans);
    }
}
