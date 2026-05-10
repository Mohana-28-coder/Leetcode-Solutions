class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        // Try every possible first and second number
        for (int i = 1; i <= n / 2; i++) {

            // Leading zero check for first number
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }

            for (int j = i + 1; j < n; j++) {

                // Leading zero check for second number
                if (num.charAt(i) == '0' && j - i > 1) {
                    break;
                }

                String first = num.substring(0, i);
                String second = num.substring(i, j);

                if (isValid(first, second, j, num)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValid(String first, String second, int start, String num) {

        while (start < num.length()) {

            String sum = addStrings(first, second);

            // Check if next part matches the sum
            if (!num.startsWith(sum, start)) {
                return false;
            }

            start += sum.length();

            first = second;
            second = sum;
        }

        return true;
    }

    // Adds two large numbers represented as strings
    private String addStrings(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}