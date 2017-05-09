import java.util.HashMap;

/**
 * Created by Administrator on 2016/11/16.
 */
public class LongestSub {
    //数组
//    public int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        int[] cache = new int[256];
//        for (int i = 0, j = 0; i < s.length(); i++) {
//            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
//            cache[s.charAt(i)] = i + 1;
//            result = Math.max(result, i - j + 1);
//        }
//        return result;
//    }
    public int lengthOfLongestSubstring(String s) {
    if (s.length()==0)
        return 0;
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        int max=0;
        for(int i=0,j=0;i<s.length();++i)
        {
            if (map.containsKey(s.charAt(i)))
                j=Math.max(j,map.get(s.charAt(i)));
            map.put(s.charAt(i),i+1);
            max=Math.max(max,i+1-j);
        }
            return max;
    }

    public static void main(String[] args)
    {
       String b="abcd";
        LongestSub longestSub=new LongestSub();
        int x=longestSub.lengthOfLongestSubstring(b);
        System.out.print(x);
    }
}
