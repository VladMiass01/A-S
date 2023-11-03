public class HashTable<K, V> {
    int size = 0;
    private int capacity = 16;
    private Node<K, V>[] nodes = new Node[capacity];

    private class Node<K, V> {
        private final K key;
        private V value;
        private final int hash;
        private Node<K, V> head;
        private Node<K, V> node;
        private Node<K, V> tail;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.hash = key.hashCode() ^ value.hashCode();
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public int getHash() {
            return hash;
        }
    }

    public void putNode(K key, V value) {
        Node<K, V> node = new Node<>(key, value);
        int index = node.getHash() % capacity;
        if (nodes[index] == null) {
            nodes[index] = node;
            size ++;
            return;
        }
        for (Node<K, V> i = nodes[index]; i != null ; i = i.node) {
            if (i.key == key) {
                i.value = value;
                return;
            }
            if (i.node == null) {
                i.node = node;
                size ++;
                return;
            }
        }
    }

    public V get(K key) {
        for (Node<K, V> n: nodes) {
            if (n != null) {
                for (Node<K, V> i = n; i != null ; i = i.node) {
                    if (i.key == key) {
                        return i.value;
                    }
                }
            }
        }
        return  null;
    }

    //public void delNode(K key, V value) {
    //   Node<K, V> node = new Node<>(key, value);
    //    node.previous
    //    int index = node.getHash() % capacity;
    //    if (nodes[index] == null) {
    //        nodes[index] = node;
    //        size ++;
    //        return;
    //    }

    public void lpt() {
        for (Node<K, V> n: nodes) {
            if (n != null) {
                for (Node<K, V> i = n; i != null ; i = i.node) {
                        System.out.println(i.key + "  " + i.value);
                }
            }
        }
    }
}
