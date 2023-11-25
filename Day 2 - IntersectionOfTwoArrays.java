class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> inter=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    if(!inter.contains(nums1[i]))
                         inter.add(nums1[i]);
                }
            }
        }
        int arr[]=new int[inter.size()];
        for(int i=0;i<inter.size();i++)
        {
            arr[i]=inter.get(i);
        }
        return arr;
    }
}
