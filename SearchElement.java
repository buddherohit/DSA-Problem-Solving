

// this is also a linear search problem
public class SearchElement {
    
    static boolean searchElement(int arr[], int target){   // method to search for an element in the array
        for(int i=0; i<arr.length; i++){              // traverse through the array using for loop
            if(arr[i]==target){                     // check if the current element is equal to the target  
                return true;                       // if found, return true
            }
        }
        return false;                   // if not found, return false
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean ans=searchElement(arr,3);
        System.out.println(ans);
    }
}


// time complexity of this code is O(n) where n is the size of the array.
// space complexity of this code is O(1) as we are not using any extra space.   