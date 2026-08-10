

public class MultiplyBy10 {
    static int[] multiplyBy10(int arr[]){
        for(int i=0; i<arr.length; i++){  // traverse through the array using for loop
            arr[i]=arr[i]*10;  // multiply each element by 10
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int result[]=multiplyBy10(arr);  // call the multiplyBy10 method and store the result in an array
        System.out.print("The array after multiplying by 10 is: ");
        for(int i:result){  // traverse through the result array using for-each loop
            System.out.print(i + " ");  // print each element of the result array
        }
    }
}
