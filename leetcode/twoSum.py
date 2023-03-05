def bruteforce(nums, target):
    for i in range(len(nums)):
        for j in range(i, len(nums)):
            if nums[i] == nums[j]:
                return [i, j]
            
def two_pass(nums, target):
    seen = {}
    
