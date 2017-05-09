/**
 * Created by Administrator on 2017/1/13.
 */
public class Num136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
