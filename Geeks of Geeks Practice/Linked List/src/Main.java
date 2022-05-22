import java.util.Scanner;

class Main{
    // 1 2 3 2 1
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

        display(head);
        if(isPallindrome(head)){
            System.out.println("Treu");
        }else{
            System.out.println("False");
        }
    }

    private static void display(Node head) {
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    private static boolean isPallindrome(Node head) {
        int x=0;
        int y=0;
        int pow =1;
        Node curr = head;
        while(curr!=null){
            x = (x*10)+curr.data;
            y = y + (curr.data*pow);
            pow = pow*10;
            curr = curr.next;
        }
        return x == y;
    }


}