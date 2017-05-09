import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
public class Num47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    permute(res,nums,0);
    return res;
}
    public void permute(List<List<Integer>> res, int[] num, int start) {
        if(start>=num.length) {
            List<Integer> current = new ArrayList<Integer>();
            for(int n:num) {
                current.add(n);
            }
            res.add(current);
        }
        else{
            for(int i=start;i<num.length;i++) {
                if (!isDuplicate(num, start, i)) {
                    swap(num,start,i);
                    permute(res,num,start+1);
                    swap(num,start,i);
                }
            }
        }
    }
    public boolean isDuplicate(int[] nums, int begin, int i){
        for(int a=begin; a<i; a++){
            if(nums[a]==nums[i]){
                return true;
            }
        }
        return false;
    }
    public void swap(int[] num,int begin,int end) {
        int temp=num[begin];
        num[begin]=num[end];
        num[end]=temp;
    }
}
