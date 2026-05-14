// Valid Parentheses (LeetCode #20)
// Given a string s containing just the characters (, ), {, }, [ and ], determine if the input string is valid.
// A string is valid if:

// Every open bracket must be closed by the same type of bracket
// Open brackets must be closed in the correct order

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

// Example 4:
// Input: s = "([)]"
// Output: false

// Example 5:
// Input: s = "{[]}"
// Output: true
// Constraints:

// Try to solve it in O(n) time

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        return st.size() == 0;
    }
}