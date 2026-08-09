class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int fre : nums) {
            hm.put(fre, hm.getOrDefault(fre, 0) + 1);

            if (hm.get(fre) > 1) {
                return true;
            }
        }

        return false;

    }
}