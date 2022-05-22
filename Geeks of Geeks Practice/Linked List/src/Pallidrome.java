import java.util.Scanner;

public class Pallidrome {

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
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node curr = head;
        for(int i=0; i<n-1; i++){
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }

        display(head);

        if(palindrome(head)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean palindrome(Node head) {
        int x = 0;
        int y = 0;
        int pow =1;

        Node curr = head;
        while(curr!=null){
            x = (x*10)+curr.data;
            y = y + (curr.data * pow);
            pow = pow*10;
            curr=curr.next;
        }

        return x==y;
    }

    private static void display(Node head) {

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

}
