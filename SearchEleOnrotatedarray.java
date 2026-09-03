public class SearchEleOnrotatedarray {

    // Pivot find karne ka logic
    static int Pivot(int arr[]) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        // Already sorted array
        if (arr[start] < arr[end]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] <= arr[n - 1]) {

                // mid right sorted part mein hai
                ans = mid;
                end = mid - 1;

            } else {

                // mid left sorted part mein hai
                start = mid + 1;
            }
        }

        return ans;
    }


    // Binary Search
    static int Binary(int arr[], int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }


    // Search in Rotated Sorted Array
    static int search(int arr[], int target) {

        int n = arr.length;

        // Step 1: Find Pivot
        int pivotIndex = Pivot(arr);

        // Array already sorted hai
        if (pivotIndex == -1) {

            return Binary(arr, 0, n - 1, target);
        }

        // Step 2: First sorted part
        int startIndex1 = 0;
        int endIndex1 = pivotIndex - 1;

        if (target >= arr[startIndex1] &&
            target <= arr[endIndex1]) {

            return Binary(arr, startIndex1, endIndex1, target);
        }


        // Step 3: Second sorted part
        int startIndex2 = pivotIndex;
        int endIndex2 = n - 1;

        if (target >= arr[startIndex2] &&
            target <= arr[endIndex2]) {

            return Binary(arr, startIndex2, endIndex2, target);
        }

        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {50, 60, 70, 10, 20, 30};

        int target = 20;

        int ans = search(arr, target);

        System.out.println("Index = " + ans);
    }
}



