import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPeriodic(String s) {
        int n=s.length();
        int mid=n/2;
        for(int i=1;i<=mid;i++){
            if(n%i==0){
                int j=i;
                while(j<n && s.charAt(j)==s.charAt(j%i)){
                    j++;
                }
                if(j==n) return true;
            }
        }
        return false;
    }
}
 