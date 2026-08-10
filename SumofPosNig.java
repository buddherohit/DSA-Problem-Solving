
public class SumofPosNig {
    static int[] SumofPosNeg(int arr[]){
        int positive=0;
        int negative=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){             // check if the current element is positive
                positive=positive+arr[i];       // if positive, add it to the positive sum
            }
            else{
                negative=negative+arr[i];         // if negative, add it to the negative sum
            }
        }
        int ans[]={positive,negative};          // create an array to store the sum of positive and negative numbers
        return ans;               
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-4,-5};
        int ans[]=SumofPosNeg(arr);
        System.out.println("The sum of positive numbers in the array is: " + ans[0]);   // print the sum of positive numbers in the array
        System.out.println("The sum of negative numbers in the array is: " + ans[1]);   // print the sum of negative numbers in the array
    }
}
