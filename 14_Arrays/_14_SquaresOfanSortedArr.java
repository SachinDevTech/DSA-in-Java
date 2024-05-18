import java.util.Arrays;

public class _14_SquaresOfanSortedArr {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10}; 
        System.err.println(Arrays.toString(sortedSquares(arr)));
    }
        public static int[] sortedSquares(int[] nums) {
            //Creating an new Array to store result by using two-pointer method
            int resultArr[] = new int[nums.length];
            //Squaring all the elements of the array
            for(int i = 0; i < nums.length; i++){
                nums[i] = nums[i] * nums[i];
            }
    
            //For Two pointer Approach:
            int head = 0, tail = nums.length - 1;
            for(int pos = nums.length - 1; pos >= 0; pos--){
                if(nums[head] > nums[tail]){
                   resultArr[pos] = nums[head];
                   //Now will increment the position of head
                   head++;
                }
                else{
                    resultArr[pos] = nums[tail];
                    //Decrement tail value by 1
                    tail--;
                }
            }
            return resultArr; 
        }
    }
