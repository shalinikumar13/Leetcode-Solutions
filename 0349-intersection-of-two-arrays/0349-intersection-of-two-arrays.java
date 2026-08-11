class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int nums:nums1){
            set.add(nums);
        }
        HashSet<Integer> Set1=new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                Set1.add(i);
            }
        }
        int[] result = new int[Set1.size()];
        int index = 0;
        for (int num :Set1) {
            result[index++] = num;
        }

        return result;
    }
}