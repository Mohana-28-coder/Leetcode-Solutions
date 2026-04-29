class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int slots = 1;

        for (String node : nodes) {
            // consume a slot
            slots--;

            if (slots < 0) return false;

            // if not null, add 2 slots
            if (!node.equals("#")) {
                slots += 2;
            }
        }

        return slots == 0;
    }
}