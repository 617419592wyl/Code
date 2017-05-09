import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/25.
 */
public class Num16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum,k,j;int result=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[k] + nums[j];
                if (sum < target) j++;
                else if (sum > target) k--;
                else return result = target;
                if (Math.abs(sum - target) < Math.abs(result - target)) result = sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
      Num16 num16=new Num16();int []a={0,2,1,-3};
        System.out.print(num16.threeSumClosest(a,1));
    }
}
