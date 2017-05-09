/**
 * Created by Administrator on 2016/11/24.
 */
public class Num14 {
//    public String longestCommonPrefix(String[] strs) {
//        String res = strs.length == 0 ? "" : strs[0];
//        for(int i = 1; i < strs.length; i++)
//            while(strs[i].indexOf(res) != 0)
//                res=res.substring(0, res.length()-1);
//        return res;
//    }
    public void find(int l,int r){
        double pi=Math.PI;
        double w=l%(2*pi*r);
        double a1=Math.cos(-w);
        double a2=Math.sin(-w);
        double b1=Math.cos(w);
        double b2=Math.sin(w);
        System.out.println(a1+' '+a2);
        System.out.println(b1+' '+b2);
    }
    public String longestCommonPrefix(String[] strs) {

        if (strs.length==0) return "";
        int index=strs[0].length()-1;
        if (strs.length==1) return strs[0].substring(0,index+1);

        for(int i=0;i<strs.length-1;++i){
            index=Math.min(index,strs[i+1].length()-1);
            while (index>=0){
                if (strs[i].substring(0,index+1)==strs[i+1].substring(0,index+1)) break;
                if (strs[i].substring(0,index+1)!=strs[i+1].substring(0,index+1)) index--;

            }
        }
        return strs[0].substring(0,index+1);
    }
    public static void main(String[] args){
     Num14 num14=new Num14();
        String[] strs={"c","c"};
        String s=num14.longestCommonPrefix(strs);
        System.out.print(s);

    }
}
