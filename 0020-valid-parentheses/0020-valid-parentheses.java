class Solution {

    public boolean isValid(String s) {

        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing bracket
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top opening bracket
                char top = stack.pop();

                // Check matching brackets
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // Stack should be empty at the end
        return stack.isEmpty();
    }
}