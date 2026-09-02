class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();
        if (result.length() == 0) {
            return "0";
        }
        int i = 0;

        while (i < result.length() - 1
                && result.charAt(i) == '0') {
            i++;
        }

        return result.substring(i);
    }
}