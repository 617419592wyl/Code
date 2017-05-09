/**
 * Created by Administrator on 2016/11/22.
 */
public class Num9 {
//    public boolean isPalindrome(int x) {
//        if (x<0 || (x!=0 && x%10==0)) return false;
//        int rev = 0;
//        while (x>rev){
//            rev = rev*10 + x%10;
//            x = x/10;
//        }
//        return (x==rev || x==rev/10);
//    }
    public boolean isPalindrome(int x) {
        String s ="";int flag=1;
        char a;
        if(x<0) return false;
           while(x/10!=0)
           {
               a= (char) ('0'+x%10);
               s+=a;
               x=x/10;
           }
        s+=(char) ('0'+x%10);
        System.out.print(s);
        for(int i=0,j=s.length()-1;i<=j;++i,--j)
        {
            if (s.charAt(i)!=s.charAt(j)) {flag=0;break;}

        }
        if (flag==0)return false;
        else return true;
    }
    public static void main(String[] args) {
       Num9 num9=new Num9();
        System.out.print(num9.isPalindrome(-2147447412));
    }
}
