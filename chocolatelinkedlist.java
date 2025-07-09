class Node{
	String data;
	Node next;
	Node(String data){
		this.data=data;
		this.next=null;
	}
}
class linkedlist{
	Node head;
	linkedlist(){
		head = null;
	}

	void append(String data){
		Node newnode= new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+ "->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	void insertatend(String data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newnode;
	}

	void insertatbeginning(String data){
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
}


class chocolatelinkedlist{
	public static void main(String args[]){
		linkedlist list=new linkedlist();

		list.insertatend("DairyMilk");     // Machine added
		list.insertatbeginning("Perk");    // Worker added
		list.insertatend("KitKat");        // Machine added
		list.insertatbeginning("5Star");   // Worker added
		
		list.display();                 //Display Details

	}
}