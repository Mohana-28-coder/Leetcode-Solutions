class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> 
                    Integer.bitCount(a) == Integer.bitCount(b)
                        ? a - b
                        : Integer.bitCount(a) - Integer.bitCount(b))
                .mapToInt(i -> i)
                .toArray();
    }
}