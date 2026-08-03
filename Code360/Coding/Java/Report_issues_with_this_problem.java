import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPeriodic(String s) {
        int n=s.length();
        // Write your code here.
        if(s.length()%2!=0) return false;
        int i=0;
        int mid=(n+1)/2;
        int j=mid;
        while(i<mid && j<n){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else return false;
        }
        return i==mid && j==n; 
    }
}
 