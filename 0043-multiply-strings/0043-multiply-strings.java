
class Solution {
    public String multiply(String num1, String num2) {

        // Handle zero
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        // Array to store multiplication result
        int[] result = new int[m + n];

        // Traverse both strings from right to left
        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                // Convert individual characters into digits
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                // Multiply digits
                int mul = digit1 * digit2;

                // Calculate positions
                int p1 = i + j;
                int p2 = i + j + 1;

                // Add existing value
                int sum = mul + result[p2];

                // Store carry and current digit
                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }

        // Build final answer
        StringBuilder sb = new StringBuilder();

        for (int num : result) {

            // Skip leading zeros
            if (sb.length() == 0 && num == 0) {
                continue;
            }

            sb.append(num);
        }

        return sb.toString();
    }
}
