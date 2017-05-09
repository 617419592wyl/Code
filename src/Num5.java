import java.util.HashMap;

/**
 * Created by Administrator on 2016/11/18.
 */
public class Num5 {
    public String longestPalindrome(String s) {
        String res = "";
        int currLength = 0;
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,i-currLength-1,i)){
                res = s.substring(i-currLength-1,i+1);
                currLength = currLength+2;
            }
            else if(isPalindrome(s,i-currLength,i)){
                res = s.substring(i-currLength,i+1);
                currLength = currLength+1;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int begin, int end){
        if(begin<0) return false;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String str="babad";
        Num5 num5=new Num5();
        System.out.print(num5.longestPalindrome(str));
    }
}
