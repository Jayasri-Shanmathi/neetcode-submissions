class Solution:
    def isPalindrome(self, s: str) -> bool:
        str1=''
        for i in range(len(s)-1,-1,-1):
            if s[i].isalnum():
                str1=str1+s[i].lower()
        if str1==str1[::-1]:
            return True
        else:
            return False            

        
