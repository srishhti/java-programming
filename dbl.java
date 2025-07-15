class Node{
   	int data;
	Node prev;
	Node next;

	Node(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}

class doublylinkedlist{
	Node head;
	Node tail;

	public void append(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=tail=newNode;
			return;
		}

		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
	}
	public void prepend(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}

	public void delete(int data){
		Node current=head;
		while(current!=null){
			if(current.data==data){
				if(current== head)
					head=current.next;
				if(current==tail)
					tail=current.prev;
				if(current.prev!=null)
					current.prev.next=current.next;
				if(current.next!=null)
					current.next.prev=current.prev;
				break;
				
			}
			current=current.next;
		}
	}


	public void displayforward(){
		Node current=head;
		while(current!=null){
			System.out.println(current.data+ " ");
			current=current.next;
		}
		System.out.println();
	}

	public void displaybackward(){
		Node current=tail;
		while(current!=null){
			System.out.println(current.data+ " ");
			current=current.prev;
		}
		System.out.println();
	}


	public void insertion(int data,int position){
		Node newNode=new Node(data);

		if(position == 0){
			newNode.next=head;
			if(head!=null){
				head.prev=newNode;
			}
			head=newNode;
			return;
		}

		Node current=head;
		int count=0;

		while(current!=null && count<position-1){
			current=current.next;
			count++;
		}

		if(current == null){
			System.out.println("position out of bound");
			return;
		}

		newNode.next = current.next;
		newNode.prev = current;

		if(current.next!=null){
			current.next.prev=newNode;
		}

		current.next=newNode;
	}

}

class dbl{
	public static void main(String args[]){
		doublylinkedlist dl1 =new doublylinkedlist();
		dl1.append(10);
		dl1.append(20);
		dl1.append(30);
		dl1.append(40);
		dl1.append(50);
		dl1.append(60);

		System.out.println("forward");
		dl1.displayforward();
		System.out.println("backward");
		dl1.displayforward();
		dl1.delete(20);
		System.out.println("after deleting");
		dl1.displayforward();

		dl1.insertion(10,0);
		dl1.insertion(20,1);
		dl1.insertion(30,2);
		dl1.displayforward();
	}
}