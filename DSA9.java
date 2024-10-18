
public class DSA9 {

     public static class Node{
         int data;
         Node next;

         public Node(int data){
            this.data=data;
            this. next=null;
         }
     }
     public static Node head;
     public static Node tail;

     public  static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
     }

      public static void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
      }

    public static void main(String[] args) {
        DSA9 dsa9=new DSA9();
        dsa9.addFirst(1);
        dsa9.addFirst(2);
        dsa9.addFirst(3);
        dsa9.addFirst(4);

        printList(head);
        reverse();
        System.out.println();
        printList(head);
        

        
    }
    public static void printList(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
