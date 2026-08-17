public class uniqueelement {
    static void uniqueElment(int arr[]){
        int sum=0;
        for(int num:arr){
            sum=sum ^ num;       //xor the sum with the current element of the array 
        }
        System.out.println("The unique element in the array is: "+sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        uniqueElment(arr);
    }
}
