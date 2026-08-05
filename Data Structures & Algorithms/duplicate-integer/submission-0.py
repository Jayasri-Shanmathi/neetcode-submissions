class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        d={}
        for i in range(len(nums)):
            if(nums[i] not in d):
                d[nums[i]]=0
            else:
                return True 
        return False           
