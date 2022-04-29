public class LinList{
    Node head;
    class Node{
        String data;
        Node next;

         Node(String data){
            this.data = data;
            this.next = null; //by default next of every new node is null
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        
        
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    public static void main(String args[]){
        LinList ll = new LinList();
        ll.addFirst("rajat");
        ll.addLast("is");
        ll.addLast("a");
        ll.addLast("goodBoy");
        ll.printList();
    }
}