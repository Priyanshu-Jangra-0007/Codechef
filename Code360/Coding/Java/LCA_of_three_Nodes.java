import java.util.ArrayList;
 
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int m = mat.size();
        int n = mat.get(0).size();
 
        int low = 0;
        int high = m * n - 1;
 
        while (low <= high) {
            int mid = low + (high - low) / 2;
 
            int row = mid / n;
            int col = mid % n;
 
            int value = mat.get(row).get(col);
 
            if (value == target) {
                return true;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
 
        return false;
    }
}