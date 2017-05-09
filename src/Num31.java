/**
 * Created by Administrator on 2016/12/8.
 */
public class Num31 {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1,end=0;
        int[] res;
        if(high==0&&nums[0]==target) {res= new int[]{0,0};return res;}
        int start=searchtarget(nums,target,low,high);
        if(start==-1) {res= new int[]{-1,-1};return res;}
        low=high=start;
        while(low>0&&low<nums.length){
            if(nums[low]!=nums[--low]) {low=low+1;break;}
        }
        while(high<nums.length-1&&high>=0){
            if(nums[high]!=nums[++high]) {high=high-1; break;}

        }

        res= new int[]{low, high};
        return res;

    }

    public int searchtarget(int[] nums,int target,int low,int high){
        while(low<high){
            if(nums[low]==target) return low;
            else if(nums[high]==target) return high;
            else {
                if(nums[(low+high)/2]==target) return (low+high)/2;
                else if(nums[(low+high)/2]>target) high=(low+high)/2-1;
                else low=(low+high)/2+1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int[] a={1,3};
        Num31 num31=new Num31();
        int[] b=num31.searchRange(a,1);
        for (int y:b) {
            System.out.print(y);
        }
    }
}
