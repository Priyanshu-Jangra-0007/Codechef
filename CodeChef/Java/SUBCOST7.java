import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int cnt=0;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int i=0;i<n;i++){
                if(i<=2){
                    cnt+=x;
                }
                else{
                    cnt+=y;
                }
            }
            System.out.println(cnt);
        }
    }
}

int local
in snippet
IncompatibleClassChangeError keyword
IndexOutOfBoundsException keyword
Infinity keyword
info snippet
InheritableThreadLocal keyword
instanceof keyword
InstantiationError keyword