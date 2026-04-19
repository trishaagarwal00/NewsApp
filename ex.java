import java .util.*;
class ex{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        int ans=Integer.MAX_VALUE;
        while(t-->0)
        {
            String s=sc.next();
            String []possible={"00","25","50","75"};
          
          for(int i=0;i<4;i++)
          {
            ans=Math.min(ans,solve(s,possible[i]));
          }
           System.out.println(ans);
        }
        
                   
        }
    
    static int solve(String s,String p)
    {
        int op=0;
        int ind=1;
        for(int j=s.length()-1;j>=0;j--)
        {
            if(s.charAt(j)==p.charAt(ind))
            {
                ind--;
                if(ind<0)
                    break;
            }
            else{
                op++;
            }
        }
        if(ind>0)
        {
            return Integer.MAX_VALUE;
        }
        return op;
    }
}