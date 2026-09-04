public class SquareRootUsingBS {
    static int square(int x){
        int start=1;
        int end=x;
        int ans=-1;
        if(x==0 || x==1){
            return x;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid>x/mid){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=40;
        System.out.println("the square root of " + x + " is " + square(x));
    }
}
