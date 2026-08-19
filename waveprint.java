

public class waveprint {
    static void WavePrint(int arr[][]){
        int row=arr.length;        //get the number of rows in the 2D array
        int col=arr[0].length;      //get the number of columns in the 2D array
         
    //loop through each column of the 2D array
        for(int j=0; j<col; j++){  

            //check if the current column is even or odd
            if(j%2==0){
                //for even columns, print the elements from top to bottom
                for(int i=0; i<row; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }  
            //for odd columns, print the elements from bottom to top
            else {
                for(int i=row-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        WavePrint(arr);
    }
}
