class Solution {
    public String longestWord(String[] words) {

        Arrays.sort(words);

        Set<String> set = new HashSet<>();

        String result = "";

        for (String word : words) {

            // Valid if:
            // 1. Length is 1
            // 2. Prefix without last char exists
            if (word.length() == 1 ||
                set.contains(word.substring(0, word.length() - 1))) {

                set.add(word);

                // Update answer
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}