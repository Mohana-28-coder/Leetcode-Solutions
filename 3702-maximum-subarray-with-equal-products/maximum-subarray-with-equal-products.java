
import java.math.BigInteger;

class Solution {

    public int maxLength(int[] nums) {

        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            BigInteger product = BigInteger.ONE;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {

                int num = nums[j];

                // Product
                product = product.multiply(BigInteger.valueOf(num));

                // GCD
                gcd = findGCD(gcd, num);

                // LCM
                lcm = (lcm / findGCD(lcm, num)) * num;

                // Check condition
                BigInteger result = BigInteger.valueOf(gcd)
                        .multiply(BigInteger.valueOf(lcm));

                if (product.equals(result)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    // GCD method
    public long findGCD(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
