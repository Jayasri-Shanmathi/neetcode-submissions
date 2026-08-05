class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d={}
        l=[]
        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]]=0
            else:
                d[nums[i]]+=1
        ans=[]        
        for i in range(k): 
           high = max(d,key=d.get)
           l.append(high)
           del d[high]
        return l   

