import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/5.
 */
public class Num26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int start=1;
        for(int i=0;i<nums.length-1;i++){
            while(i<nums.length-1&&nums[i]!=nums[i+1]){
                nums[start]=nums[i+1];
                start++;
                i++;
            }

        }
        return start;

    }
    public static void main(String[] args) {
        Num26 num26=new Num26();
        HashMap map=new HashMap();
        int[] a={1,2};
        System.out.print(num26.removeDuplicates(a));
    }
}
