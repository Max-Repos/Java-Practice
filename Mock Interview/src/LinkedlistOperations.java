import java.util.Scanner;

public class LinkedlistOperations {

    static class Node{
        int data;
        Node next;
        Node (int data){
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

        //Display the LL
        display(head);

        //INSERTION OPERATIONS
        int k = sc.nextInt();
        //1.    Insert at beginning
        insertAtStart(head,k,len);
        System.out.println();
        //2.    Insert at ending
        insertAtExit(head,k,len);


    }

    private static void insertAtExit(Node head, int k, int len) {
        Node insert = new Node(k);

        if(len == 0){
            insert.next = null;
            head = insert;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = insert;
        insert.next = null;

        display(head);
    }

    private static void insertAtStart(Node head, int k, int len) {
        Node insert = new Node(k);

        if(len == 0){
            insert.next = null;
            head = insert;
            return;
        }

        Node curr = head;
        insert.next = head;
        head = insert;


        display(head);
    }

    private static void display(Node head) {
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
