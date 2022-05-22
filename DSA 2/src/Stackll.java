import java.util.Scanner;

public class Stackll {


        static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
        }

        // create global top reference variable global
        static Node top;
        // Constructor
        Stackll()
        {
            this.top = null;
        }

        public static void main(String[] args){
            Stackll obj = new Stackll();
            Scanner sc = new Scanner(System.in);
            obj.push(sc.nextInt());
            obj.push(sc.nextInt());
            obj.push(sc.nextInt());

            display();

            obj.pop();
            display();

            int head = obj.peek();
            System.out.println(head);
        }

    private int peek() {
            return top.data;
    }

    private void pop() {
            top = top.next;
            System.out.println("poped");
    }

    private static void display() {
            Node curr = top;
            while(curr!=null){
                System.out.println(curr.data+" ");
                curr = curr.next;
            }
    }


    private void push(int x) {
        Node insert = new Node(x);
        insert.next = top;
        top = insert;
    }
}
