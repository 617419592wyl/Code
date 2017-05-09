import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/11/29.
 */
public class Num18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        int len=nums.length;
        if (len<4) return list;
        Arrays.sort(nums);
        for (int i=0;i<len-3;i++){
            if (i>0&&nums[i-1]==nums[i])continue;
            if (nums[i]+3*nums[len-1]<target) continue;
            if (4*nums[i]>target) break;
            if (4*nums[i]==target){
                if (i+3<len&&nums[i+3]==nums[i]) list.add(Arrays.asList(nums[i],nums[i],nums[i],nums[i]));
                break;
            }
            threeSumForFourSum(nums,i+1,target-nums[i],list,nums[i]);

        }
        return list;

    }

    private void threeSumForFourSum(int[] nums, int begin, int target, List<List<Integer>> list, int num) {
        int end=nums.length-1;int k,j;int i=begin;
        while (i<nums.length-2){
            j=i+1;k=end;
            while (j<k){
                if (nums[i]+nums[j]+nums[k]==target) {
                    list.add(Arrays.asList(num, nums[i], nums[j], nums[k]));
                }
                if (nums[i]+nums[j]+nums[k]<=target) while(nums[j] == nums[++j] && j < k);
                if (nums[i]+nums[j]+nums[k]>target) while(nums[k] == nums[--k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }

    }
    public static void main(String[] args){
        Num18 num18=new Num18();


    }
}
