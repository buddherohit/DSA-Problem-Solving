public class TransposeOfmatrix {
    static void Transpose(int arr[][]){
        int row=arr.length;    //get the number of rows in the 2D array
        int col=arr[0].length;  //get the number of columns in the 2D array

        
       
        int newrow=col;  //the number of rows in the transpose is equal to the number of columns in the original array
        int newcol=row;  //the number of columns in the transpose is equal to the number of rows in the original array  
        int transpose[][]=new int[newrow][newcol];  //create new 2d array to store the transpose of the original array

        //travel the orignal array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i]=arr[i][j];  //store the value of the original array in the transpose array
        
            }
        }
        //print the transpose of the original array
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");    //print the value of the transpose array
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Transpose(arr);
    }
    
}
