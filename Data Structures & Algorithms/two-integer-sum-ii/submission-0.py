class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        for ind1 in range(len(numbers)):
            for ind2 in range(ind1+1,len(numbers)):
                if(numbers[ind1]+numbers[ind2]==target and ind1<ind2):
                    return[ind1+1,ind2+1]
