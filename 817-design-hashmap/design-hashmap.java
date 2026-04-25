import java.util.*;

class MyHashMap {

    // Bucket array
    private List<int[]>[] buckets;
    private int size = 1000;  // number of buckets

    public MyHashMap() {
        buckets = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {
        int index = hash(key);

        for (int[] pair : buckets[index]) {
            if (pair[0] == key) {
                pair[1] = value; // update
                return;
            }
        }

        buckets[index].add(new int[]{key, value});
    }

    public int get(int key) {
        int index = hash(key);

        for (int[] pair : buckets[index]) {
            if (pair[0] == key) {
                return pair[1];
            }
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);

        Iterator<int[]> it = buckets[index].iterator();
        while (it.hasNext()) {
            int[] pair = it.next();
            if (pair[0] == key) {
                it.remove();
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */