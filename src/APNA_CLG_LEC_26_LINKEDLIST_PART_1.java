public class APNA_CLG_LEC_26_LINKEDLIST_PART_1 {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node at beginning
    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add node at end
    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Utility: Print LinkedList
    public void printList() {
            Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx , int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp =head;
        int i = 0;
        while (i < (idx - 1)){
            temp = temp.next;
            i++;
        }
        newNode.next =temp.next;
        temp.next = newNode;
    }

    public int RemoveFirst() {
        if(size == 0){
            System.out.println("Linkedlist is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int Removelast() {
        if(size == 0){
            System.out.println("Linkedlist is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        Node prev =head;
        for (int i = 0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next =null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head;
        int i =0;
        while (temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recsearch(int key){
        return helper(head , key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromend(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp =temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i=1;
        int iToFind = sz -n;
        Node prev = head;
        while(i < iToFind){
            prev =prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        APNA_CLG_LEC_26_LINKEDLIST_PART_1 ll = new APNA_CLG_LEC_26_LINKEDLIST_PART_1();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);

        ll.printList();  // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
        System.out.println(ll.size);

//        ll.RemoveFirst();
//        ll.printList();

        ll.Removelast();
        ll.printList();

        System.out.println(ll.itrsearch(3));
        System.out.println(ll.recsearch(4));

        ll.reverse();
        ll.printList();

        ll.deleteNthfromend(2);
        ll.printList();
    }
}
