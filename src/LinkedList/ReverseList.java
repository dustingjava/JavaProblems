// Reverse Linked List (LeetCode #206)
// Given the head of a singly linked list, reverse the list and return the reversed list.
// Example 1:
// Input:  1 → 2 → 3 → 4 → 5 → null
// Output: 5 → 4 → 3 → 2 → 1 → null

// Example 2:
// Input:  1 → 2 → null
// Output: 2 → 1 → null

// Example 3:
// Input:  1 → null
// Output: 1 → null
// Constraints:

// Try to solve it in O(n) time and O(1) space

// Definition for singly-linked list (already provided by LeetCode)

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;  // handle empty list
        
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode next = current.next; // save next
            current.next = prev;          // reverse the arrow ⬅️
            prev = current;              // move prev forward
            current = next;              // move current forward
        }
        
        return prev; // prev is the new head
    }
}

// 1 → 2 → 3 → null

// Step 1: prev=null, curr=1
//         curr.next = prev → 1 → null
//         prev=1, curr=2

// Step 2: prev=1, curr=2
//         curr.next = prev → 2 → 1 → null
//         prev=2, curr=3

// Step 3: prev=2, curr=3
//         curr.next = prev → 3 → 2 → 1 → null
//         prev=3, curr=null

// → return prev = 3 ✅