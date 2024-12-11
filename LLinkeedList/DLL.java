public class DLL {
    Node head;

    class Node{
        Node prev;
        String data;
        Node next;

        Node(String data){
            this.prev=null;
            this.data= data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head==null) {
            head = newNode;
            return;
        }

        newNode.next= head;
        head.prev= newNode;
        head=newNode;
    }

  public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
        newNode.prev=currNode;
  }

   public void insertAt(int idx,String data) {

        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        if(idx==0){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node temp = head;

        for(int i =0;i < idx-1;i++){
            if(temp == null){
                System.out.println("Index out of bound");
                return;
            }
            temp=temp.next;
        }

        if(temp ==null || temp.next == null && idx>1){
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;

    }


    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty,Nothing to delete");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        head=head.next;
        head.prev=null;
    }


    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty, Nohting to delete");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node Last = head;

        while(Last.next !=null){
            Last=Last.next;
        }

        Last.prev.next=null;
        Last.prev = null;


    }

    public void ReverseLL(){

        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next= curr.next;
            curr.next= prev;
            curr.prev=curr;

            prev= curr;
            curr=next;
        }
        head=prev;


    }


    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while(currNode!=null){
            System.out.print(currNode.data+"<->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        DLL list = new DLL();

        list.addFirst("Saif");
        list.display();

        list.addLast("Ansari");
        list.display();

        list.insertAt(1,"wwe");
        list.display();

        list.addFirst("Mohd");
        list.display();

        list.ReverseLL();
        list.display();
    }
}
