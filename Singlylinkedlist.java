
class Node{
    int value;
    Node next;
    
    Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class Singlylinkedlist{
    
    Node head;
    
    public void InsertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head=newNode;
    }
    
    
    public void InsertAtEnd(int value){
        Node temp = head;
        Node newNode = new Node(value);
        while(temp.next!=null){
            temp =  temp.next;
        }
        temp.next = newNode;
    }
     
    
    public void insertAtSpecificPosition(int value, int position){
     if(position<1){
        System.out.print("invalid position");
        return;
     }
     
     if(position==1){
         InsertAtBeginning(value);
         return;
     }
     Node temp = head;
     Node newNode = new Node(value);
     for(int i=1; temp!=null && i<position-1; i++){
         temp = temp.next;
     }
     
     if(temp==null){
         System.out.println("Position out of Range");
         return;
     }
     else{
         newNode.next = temp.next;
         temp.next = newNode;
     }
     
    }
    
    public void deleteatbeg(){
        if(head==null){
            return;
        }
        head= head.next;
    }
 
    
    public void deleteatend(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    
    public void display(){
     
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.value + " ->");
           temp = temp.next;
       }
    
       System.out.print("null");
    }
    public static void main(String[] args){
        
        SLL list = new SLL();
        list.InsertAtBeginning(100);
        list.InsertAtBeginning(200);
        list.InsertAtBeginning(300);
        list.InsertAtBeginning(400);
        
        list.InsertAtEnd(700);
        list.InsertAtEnd(800);
        list.InsertAtEnd(1000);
        
        list.insertAtSpecificPosition(650, 3);
        
        
        list.deleteatend();
        
        list.deleteatbeg();
        
        list.display();
    }
}