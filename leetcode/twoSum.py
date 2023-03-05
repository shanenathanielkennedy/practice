def bruteforce(nums, target):
    for i in range(len(nums)):
        for j in range(i, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
            
def two_pass(nums, target):
    seen = {}
    for i in range(len(nums)):
        diff = target - nums[i]
        seen[diff] = i
    for i in range(len(nums)):
        if nums[i] in seen and i != nums[i]:
            return [i, seen[nums[i]]]
        
def one_pass(nums, target):
    seen = {}
    for i, v in enumerate(nums):  
        diff = target - nums[i]
        if nums[i] in seen:
            return [i, seen[nums[i]]]
        seen[diff] = i





