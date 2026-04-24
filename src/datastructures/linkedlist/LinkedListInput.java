package datastructures.linkedlist;

public class LinkedListInput {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public static ListNode of(int... vals) {
            if (vals.length == 0) return null;
            ListNode head = new ListNode(vals[0]);
            ListNode cur  = head;
            for (int i = 1; i < vals.length; i++) {
                cur.next = new ListNode(vals[i]);
                cur = cur.next;
            }
            return head;
        }

        @Override public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode cur = this;
            while (cur != null) { sb.append(cur.val); if (cur.next != null) sb.append("->"); cur = cur.next; }
            return sb.toString();
        }
    }

    public static class RandomNode {
        public int val;
        public RandomNode next;
        public RandomNode random;
        public RandomNode(int val) { this.val = val; }
    }

    // Pre-built lists
    public static ListNode LIST_1()        { return ListNode.of(1,2,3,4,5); }
    public static ListNode LIST_SORTED_A() { return ListNode.of(1,3,5,7,9); }
    public static ListNode LIST_SORTED_B() { return ListNode.of(2,4,6,8); }
    public static ListNode LIST_PALINDROME(){ return ListNode.of(1,2,3,2,1); }
    public static ListNode LIST_DUPS()     { return ListNode.of(1,1,2,3,3,4,4,5); }
    public static ListNode LIST_PARTITION(){ return ListNode.of(3,5,8,5,10,2,1); } // partition around 5

    // Cycle: 3->2->0->-4 and -4 points back to index 1 (node val=2)
    public static ListNode LIST_WITH_CYCLE() {
        ListNode n3  = new ListNode(3);
        ListNode n2  = new ListNode(2);
        ListNode n0  = new ListNode(0);
        ListNode nm4 = new ListNode(-4);
        n3.next = n2; n2.next = n0; n0.next = nm4; nm4.next = n2; // cycle at n2
        return n3;
    }
}
