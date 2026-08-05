class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        l = [1] * n 
        for i in range(1, n):
            l[i] = l[i - 1] * nums[i-1]
        r = 1
        for i in range(n - 1, -1, -1):
            l[i] *= r
            r *= nums[i]

        return l
