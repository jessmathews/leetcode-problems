class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={search(nums,target,true),search(nums,target,false)};
        return ans;

    }
    public int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end ) {
			int mid = start + (end - start) / 2;
			if (target < nums[mid]) {
				end = mid - 1;

			}
			else if (target > nums[mid]) {
				start = mid +1;

			}
			else  {
                //probable answer
                ans = mid;
                if (findStart) {
                    end = mid-1;
                }               
                else {
                    start = mid +1;
                }
			}

		}
		return ans;


    }

}