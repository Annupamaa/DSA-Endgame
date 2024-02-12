//Node type --> data type
//null size node generate in which a value with null ref.
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
//when we make a object of constructor class then it will automatically called.
//create a shallow copy list node. ==> change in dup also changed in main linkedlist becz of shallow copy
class Listnode{
        Node head;
        public void append(int data){
            //the parameter data need to convert into listNode that's why a newNode is created.
                Node newNode = new Node(data);
                if(head==null){
                    head=newNode;
                }else{
                    //empty node-->duplicate. so that main head is not disturb.
                    Node dup=head;
                    while(dup.next!=null){
                        dup=dup.next;
                    }
                    dup.next=newNode;
                }
        }


        public void display(){
            if(head==null){
                System.out.println("Empty");
            }else{
                Node dup = head;
                while(dup!=null){
                    System.out.print(dup.data+"-->");
                    dup=dup.next;
                }
                System.out.println("null");
            }
        }


        public void deleteNode(int data){
            if(head==null){
                return;
            }
            if(head.data == data){
                head.next=head.next.next;
            }
            Node dummy = head;
            while(dummy.next!=null && dummy.next.data!=data){
                dummy=dummy.next;
                if(dummy.next!=null){
                    dummy.next=dummy.next.next;
                    return;
                }else{
                    System.out.println("element not found");
                }
            }
        }
        

        public void addStart(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head=newNode;
        }

        
        public static void main(String [] args){
            Listnode linklist = new Listnode();
            linklist.append(1);
            linklist.append(2);
            linklist.append(3);
            linklist.addStart(4);
            linklist.display();
            linklist.deleteNode(2);
            linklist.display();
            
        }
}