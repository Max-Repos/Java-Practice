import java.util.Scanner;

public class LinkedListInsertionOperation {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node curr = head;
        for(int i=1; i<len; i++){
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }

        int k = sc.nextInt();
        //1.    insertion at end
        //insertAtStart(head,k);

        //2.    inserting at end
        //insertAtEnd(head, k);

        //3.    inserting at middle
        insertAtMiddle(head, k, len);

        //display(head);
    }

    private static void insertAtMiddle(Node head, int k, int len) {
        int mid = len/2;
        Node insert = new Node(k);
        Node curr = head;
        for(int i=1; i<mid; i++){
            curr = curr.next;
        }
        insert.next = curr.next;
        curr = insert;

        display(head);
    }

    private static void insertAtStart(Node head, int k) {
        Node insert = new Node(k);


        insert.next = head;
        head = insert;

        //display(head);
    }

    private static void insertAtEnd(Node head, int k) {

        Node insert = new Node(k);
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        insert.next = curr.next;
        curr.next = insert;
    }

    private static void display(Node head) {

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" --> ");
            curr = curr.next;
        }
        System.out.print("NULL");
    }
}
