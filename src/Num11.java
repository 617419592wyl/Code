/**
 * Created by Administrator on 2016/11/23.
 */
public class Num11 {
    public int maxArea(int[] height) {
        int left=0;int right=height.length-1;
        int mianji=0;
        while (left<right)
        {
            mianji=Math.max(mianji,Math.min(height[left],height[right])*(right-left));
            if (height[left]<height[right]) left++;
            else right--;
        }
        return mianji;
    }
}
