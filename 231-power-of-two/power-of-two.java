import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // changed to num
        
        if (isPowerOfTwo(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
    public static boolean isPowerOfTwo(int number) {  // changed parameter name
        if (number <= 0) {
            return false;  // Negative numbers & zero are not powers of two
        }
        
        // Keep dividing by 2 while number is divisible by 2
        while (number % 2 == 0) {
            number = number / 2;
        }
        
        // If we end up with 1, it's a power of two
        return number == 1;
    }
}