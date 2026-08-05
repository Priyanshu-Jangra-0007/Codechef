import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main (String[] args) throws java.lang.Exception{
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int sum=0;
            int ans=0;
            for(int i=1;i<n;i++){
                int bal=sum+a[i]-i;
                ans=Math.max(ans,bal);
                if(a[i]>0){
                    sum+=a[i];
                }
            }
            System.out.println(ans);
        }
    }
}
ans local
transient keyword
ArrayIndexOutOfBoundsException keyword
IllegalMonitorStateException keyword
SuppressWarnings keyword
EnumConstantNotPresentException keyword