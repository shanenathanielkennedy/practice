class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode() #so we can assign and return to dummy.next
        curr = dummy # First val of returned LL
        carry = 0 #Initializing Carry variable
        while l1 or l2 or carry: # Length of longest list, + 1 if carry in cache
            val1 = l1.val if l1 else 0 # Value if Not nothing
            val2 = l2.val if l2 else 0
            
            summ = val1 + val2 + carry 
            carry = summ // 10 # checking if carry is needed, adding
            val = summ % 10 # getting ones place only
            curr.next = ListNode(val) # inserting value of operation

            curr = curr.next # continue
            l1 = l1.next if l1 else None #next node
            l2 = l2.next if l2 else None

        return dummy.next