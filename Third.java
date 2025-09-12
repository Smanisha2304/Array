class Solution {
    public int thirdMax(int[] nums) {
        // // Arrays.sort(nums);
         int max=0;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num:nums)
        {
            set.add(num);
        } 
        if(set.size()<3) 
        {
            return set.first();
        }
        set.pollFirst();
        set.pollFirst();
        return set.first();


    }

}

