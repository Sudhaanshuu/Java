class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node h = head;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        for(int i = 0; i<k-1 ; i++){
            h = h.next;
        }
        Node t = h;
        h = h.next;
        t.next = null;
        return h;
    }
}

