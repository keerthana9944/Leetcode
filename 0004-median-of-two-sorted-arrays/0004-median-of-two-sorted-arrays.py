class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums.sort()
        
        d = len(nums)

        if d%2==1:
            return nums[d//2]
        else:
            return (nums[d//2-1] + nums[d//2])/2
        