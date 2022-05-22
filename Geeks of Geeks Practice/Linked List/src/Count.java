import java.util.Scanner;

public class Count {
    /*
    2->4->9-1->8
     */

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node curr = head;
        for(int i =1; i<n; i++){
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }

        int ele = sc.nextInt();

        if(checkifele(head, ele)){
            System.out.println("is Present");
        }else{
            System.out.println("not Present");
        }

        display(head);

    }

    private static boolean checkifele(Node head, int n) {
        Node curr = head;
        while(curr!=null){
            if(curr.data == n){
                return true;
            }
            curr =curr.next;
        }

        return false;
    }

    private static void display(Node head) {
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
    }


}
