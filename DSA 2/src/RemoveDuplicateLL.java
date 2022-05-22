import java.util.Scanner;

public class RemoveDuplicateLL {

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

        removeDuplicate(head);
    }

    private static void removeDuplicate(Node head) {
        Node i = null;
        Node j = null;

        i=head;
        while(i!=null && i.next!=null){
            j=i;
            while(j.next!=null){
                if(i.data == j.next.data){
                    j.next = j.next.next;
                }else {
                    j = j.next;
                }
            }
            i = i.next;
        }

        display(head);
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
