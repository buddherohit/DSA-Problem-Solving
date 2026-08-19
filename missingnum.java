public class missingnum {
    int n=6;
    static int missingnum(int arr[]){        
        int sum=0;            //initalize sum as 0;
        for(int num:arr){        //traverse for all array elements and perform XOR operation with sum and the current element of the array
            sum=sum ^ num;       //xor the sum with the current element of the array
        }
        for(int i=0; i<=6; i++){       //traverse for all numbers from 0 to n and perform XOR operation with sum and the current number
            sum=sum^i;              //xor the sum with the current number
        }
        return sum;            //return the missing number
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(missingnum(arr));
    }
}
