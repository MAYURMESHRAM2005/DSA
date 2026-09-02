class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        // Monotonic increasing stack
        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If k digits are still remaining,
        // remove them from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();

        // IMPORTANT:
        // If all digits were removed
        if (result.length() == 0) {
            return "0";
        }

        // Remove leading zeros
        int i = 0;

        while (i < result.length() - 1
                && result.charAt(i) == '0') {
            i++;
        }

        return result.substring(i);
    }
}