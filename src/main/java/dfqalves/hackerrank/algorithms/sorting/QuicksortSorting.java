package dfqalves.hackerrank.algorithms.sorting;


/**
 * Created by cin_dalves on 4/4/16.
 */
public class QuicksortSorting {

    public static class Node {
        int value;
        int lenght;
        Node next;

        public Node(int value) {
            this.value = value;
            this.lenght = 1;
        }

        Node setNext(Node node){
            if(node == null)
                return this;

            if(next == null) {
                next = node;
            } else {
                this.next.setNext(node);
            }
            lenght++;
            return this;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.value);
            if(next != null)
                sb.append(" " + this.next);
            return sb.toString();
        }

    }

    static Node sort(Node n){
        if(n == null || n.lenght == 1)
            return n;

        int p = n.value;
        Node minor = null, equal = null, major = null;

        while(n != null) {
            if(n.value < p) {
                minor = setNext(n, minor);
            } else if (n.value > p) {
                major = setNext(n, major);
            } else {
                equal = setNext(n, equal);
            }

            n = n.next;
        }

        minor = sort(minor);
        major = sort(major);

        Node out = (minor != null) ? minor.setNext(equal).setNext(major) : equal.setNext(major);
        System.out.println(out);
        return out;

    }

    private static Node setNext(Node n, Node node) {
        return node == null ? new Node(n.value) : node.setNext(new Node(n.value));

    }

}
