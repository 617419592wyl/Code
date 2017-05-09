import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/17.
 */
public class Num4 {
    public int findKthSmallest(int[] a1,int n,int begin1,int[] a2,int m,int begin2,int k)
    {
        if (n>m) return findKthSmallest(a2,m,begin2,a1,n,begin1,k);
        if (n==0) return a2[begin2+k-1];
        if (k==1) return Integer.min(a1[begin1],a2[begin2]);
        int partA=Integer.min(k/2,n);int partB=k-partA;
        if (a1[begin1+partA-1]==a2[begin2+partB-1]) return a1[begin1+partA-1];
        else if (a1[begin1+partA-1]<a2[begin2+partB-1]) return findKthSmallest(a1,n-partA,begin1+partA,a2,m,begin2,k-partA);
        else return findKthSmallest(a1,n,begin1,a2,m-partB,begin2+partB,k-partB);

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1=nums1.length;int a2=nums2.length;
        if ((a1+a2)%2==1) return findKthSmallest(nums1,a1,0,nums2,a2,0,(a1+a2)/2+1);
        else return (double)(findKthSmallest(nums1,a1,0,nums2,a2,0,(a1+a2)/2+1)+findKthSmallest(nums1,a1,0,nums2,a2,0,(a1+a2)/2))/2;

    }
    public static void main(String[] args){
        int[] b={1,2};int[]c={3,4};
        Num4 num4=new Num4();
        System.out.print(num4.findMedianSortedArrays(b,c));
    }
}
