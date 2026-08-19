public class MissingElementinDublicateArray {
static void missing(int arr[]){
    int n=arr.length; 
    int visited[]=new int[n+1];     //create new array and their size is n+1 for eg n=5 then size of visited array is 6 and all the elements of the visited array are initialized to 0
    for(int i=0; i<n; i++){     //traverse the array and mark the elements that are present in the array as visited by setting the corresponding index in the visited array to 1
        visited[arr[i]]=1;    //mark the element as visited by setting the corresponding index in the visited array to 1
    }
    for(int i=1; i<=n; i++){     //traverse the visited array and check for the elements that are not visited and print them as missing elements
        if(visited[i]==0){      //if the element is not visited then print it as missing element
            System.out.println("The missing element in the array is: "+i);
        }
    }
}public static void main(String[] args) {
    int arr[]={1,2,3,4,5,5,5};
    missing(arr);
}
}
