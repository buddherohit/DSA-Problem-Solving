public class RemoveDublicates {
    static int RemoveDublicates(int arr[]){
        int i=0;
        int j=1;
        int n=arr.length;
        while(j<n){        //j traverse the array from 1 to n-1 and i traverse the array from 0 to n-2 and if arr[i]==arr[j] then j++ else i++ and arr[i]=arr[j] and j++ and finally return i+1 because i is the index of the last unique element in the array
            if(arr[i]==arr[j]){    //if the current element is equal to the next element then increment j to skip the duplicate element
                j++;      //increment j to skip the duplicate element
            }
            else{
                i++;
                arr[i]=arr[j];     //assign the next unique element to the next position of the unique elements in the array
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,5};
        int ans=RemoveDublicates(arr);
        System.out.println("The length of the array after removing duplicates is: "+ans);
        System.out.print("The array after removing duplicates is: ");
        for(int k=0;k<ans;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}
