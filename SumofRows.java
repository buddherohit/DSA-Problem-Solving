

public class SumofRows {
    static void SumofRows(int arr[][]){
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum=sum+arr[i][j];
            }
            System.out.println("The sum of row "+(i+1)+" is: "+sum);
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        SumofRows(arr);
    }
}
