package Java12HashMap;
import java.util.*;
public class HashMap05Rules {
    /*
     * Constructor and Description
     * HashMap ( )
     * Constructs an empty HashMap with the default initial capacity (16) and the
     * default load factor (0.75).
     *
     * HashMap (int initialCapacity)
     * Constructs an empty HashMap with the specified initial capacity and the
     * default load factor (0.75).
     *
     * HashMap (int initialCapacity, float loadFactor)
     * Constructs an empty HashMap with the specified initial capacity and load
     * factor.
     *
     * HashMap (Map<? extends K,? extends V› m)
     * Constructs a new HashMap with the same mappings as the specified Map.
     */

    /*
     * Implement your own HashMap with the following methods.
     *
     * 1. put (key,value)
     * • Returns void
     * • Inserts/Updates
     * get(key)
     * • Returns value corresponding to key if it exists
     * • Returns null if key doesn't exist
     * 3. size
     * • Returns the number of entries in HashMap
     * 4. remove(key)
     * • Removes an entry with key 'key' from the HashMap
     * • Returns null or value
     *
     * Both keys and values can be of any type. I
     */

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_FACTOR = 0.75F;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // the number of entries in map
        private LinkedList<Node>[] buckets;

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        @SuppressWarnings("unchecked")
        private void initBuckets(int N) { // N - capacity/size of buckets array
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hashCode = key.hashCode();
            return (Math.abs(hashCode)) % buckets.length;
        }

        // Traverses the LinkedList and looks for a node with key, if found it returns
        // its index otherwise
        private int searchInBuckets(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public int size() { // return the number of entries
            return n;
        }

        public void put(K key, V value) { // insert / update
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];

            int ei = searchInBuckets(currBuckets, key);
            if (ei == -1) { // key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBuckets.add(node);
                n++;
            } else {
                Node currNode = currBuckets.get(ei);
                currNode.value = value;
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBuckets(currBuckets, key);
            if (ei != -1) { // key doesn't exist, we have to
                Node curNode = currBuckets.get(ei);
                return curNode.value;
            }
            return null;
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBuckets(currBuckets, key);

            if (ei != -1) { // key doesn't exist, we have to
                Node curNode = currBuckets.get(ei);
                V val = curNode.value;
                currBuckets.remove(ei);
                n--;
                return val;
            }

            return null;
        }

        public static void main(String[] args) {
            MyHashMap<String, Integer> map = new MyHashMap<>();
            System.out.println("Testing Put");
            map.put("A", 2);
            map.put("B", 3);
            map.put("C", 4);

            System.out.println("Size of map: " + map.size());
        }
    }
}
