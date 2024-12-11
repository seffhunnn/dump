public class LL {
Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;

        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;

    }

    public void insertAt(int idx,String data){
        Node newNode = new Node(data);

        if(idx==0){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node temp = head;

        for(int i=0;i<idx-1;i++){

            if(temp==null){
                System.out.println("Index out of bounds");
                return;
            }
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }

        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node Last = head.next;

        while(Last.next !=null){

            Last=Last.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;
    }

    public void deleteAt(int idx){
        if(head==null){
            System.out.println("List is empty,Nothing to delete");
            return;
        }

        if(idx==0){
            head= head.next;
            return;
        }

        Node temp = head;

        for(int i=0;i < idx-1;i++){
            if(temp == null || temp.next==null){
                System.out.println("Index out of bounds");
                return;
            }
            temp=temp.next;
        }

        if(temp.next==null){
            System.out.println("Index out of bounds");
            return;
        }

        temp.next= temp.next.next;
    }

    public void ReverseLL(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public void displayLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("Saif");
        list.addLast("Ansari");
        list.addFirst("Mohd");

        list.insertAt(1,"WWE");
        list.displayLL();

        list.ReverseLL();
        list.displayLL();
    }
}
