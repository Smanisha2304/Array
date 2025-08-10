class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        // List<List<Integer>> myList = new ArrayList<>();
        //  int [] a = new int[nums.length];
         int r = nums[0]+nums[1]+nums[2];
        for(int i =0;i<nums.length-2;i++)
        {
            
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-r))
                {
                    r= sum;
                }
                if(sum==target)
                {
                    return target;
                }
                else if(sum<target)
                {
                    left++;
                }
                else{
                    right--;
                }
               
                
            }
        }
        return r;
    }
}