class LL {
    Node head;
    public int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;// by default
            size++;
        }
    }

    // add first
    public void AddFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add last
    public void AddLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // add in between
    public void addInBetween(String data, int index) {
        if (index <= 0 || index > size) {
            // Invalid index, cannot add at this position
            System.out.println("Invalid index: " + index);
            return;
        }

        Node newNode = new Node(data);
        size++;

        if (index == 1) {
            // Adding at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        int count = 1;
        while (count < index - 1) {
            currNode = currNode.next;
            count++;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");

        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");

        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LL list = new LL();

        list.AddFirst("a");

        list.AddFirst("is");

        list.printList();
        list.AddLast("list");

        list.printList();

        // list.deleteFirst();

        // list.printList();

        // list.deleteLast();
        // list.printList();
        System.out.println(list.getSize());
        list.addInBetween("or", 1);
        list.printList();

    }
}