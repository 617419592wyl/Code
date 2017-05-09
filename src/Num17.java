import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/28.
 */
public class Num17 {
    public List<String> letterCombinations(String digits) {
    
        String[] str={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> res=new LinkedList();
        if (digits.length()==0) return res;
        res.add("");
        for(int i=0;i<digits.length();i++){
            int x=digits.charAt(i)-'0'-2;
            int q=res.size();
            while(q-->0){
                String c=res.remove();
                for(char a:str[x].toCharArray()){
                    res.add(c+a);
                }
            }
        }
        return res;
    }
}