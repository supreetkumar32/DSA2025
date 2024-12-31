package linkedList;

import java.util.HashSet;

public class LinkedList {
    
    private Node head;  
    class Node {
        int value;
        Node next;
     
        Node(int value) {
            this.value = value;
        }
    }
    
    public LinkedList(int value) {    //4
    	Node a=new Node(value);
    	head=a;
    }
    
    public void insertAtBeginning(int value) {   ///3->4
    	Node newnode=new Node(value);
    	if(head==null) {
    		head=newnode;
    	}else {
    		newnode.next=head;
    		head=newnode;
    	}
    }
    
    public void insertAtLast(int value) { //3->4->6
    	Node newnode =new Node(value);
    	if(head==null) {
    		head=newnode;
    	}else {
    		Node temp=head;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		temp.next=newnode;
    	}
    }
    
    public void insert(int pos,int value) {//3->4>5>6
    	Node newnode=new Node(value);
    	if(pos==1) {
    		newnode.next=head;
    		head=newnode;
    	}else {
    		int count=1;
    		Node previous=head;
    		while(count<pos-1) {
    			previous=previous.next;
    			count++;
    		}
    		Node current=previous.next;
    		previous.next=newnode;
    		newnode.next=current;   		
    	}
    }
    
    public void deleteFirst() {
    	if(head==null) {
    		return;
    	}
    	Node temp=head;
    	head=head.next;
    	temp.next=null;
    }
    
    public void deleteLast() {
    	Node temp=head;
    	while(temp.next.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=null;
    }
    
    public void deleteAtPos(int pos) {
    	if(pos==1) {
    		head=head.next;
    	}else {
    		int count=1;
    		Node previous=head;
    		while(count<pos-1) {
    			previous=previous.next;
    			count++;
    		}
    		Node current=previous.next;
    		previous.next=current.next;
    	}
    }
    
    public boolean search(int key) {
    	if(head==null) {
    		return false;
    	}
    	Node temp=head;
    	while(temp!=null) {
    		if (temp.value==key) {
    			return true;
    		}
    		temp=temp.next;
    	}
    	return false;
    }
    
    public void reverse() {
//    	Node previous=head;
//    	Node current=head.next;
//    	while(current!=null) {
//    		Node next=current.next;
//    		current.next=previous;
//    		previous=current;
//    		current=next;
//    	}
//    	head.next=null;
//    	head=previous;
    	if(head==null || head.next==null) return;
    	Node curr=head;
    	Node next=null;
    	Node prev=null;
    	while(curr!=null) {
    		next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	head=prev;
    }
    
    public int middleElement() {
    	if(head==null)
    		return 0;
    	Node fast=head;
    	Node slow=head;
    	while(fast!=null && fast.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	return slow.value;
    }
    
    public void insertInSorted(int key) {
    	Node newnode =new Node(key);
    	Node temp=head;
    	if(head==null) return;
    	if(head.value>key) {
    		newnode.next=head;
    		head=newnode;
    		System.out.println("head value" +head.value);
    	}
    	while(temp.next.value < key && temp.next!=null) {
    		temp=temp.next;
    	}
    	newnode.next=temp.next;
    	temp.next=newnode;
    	
    }
    
    public int nthfromend(int n) {
    	int len=1;
    	Node temp=head;
    	while(temp.next!=null) {
    		len++;
    		temp=temp.next;
    	}
    	System.out.println("length" +len);
    	Node current=head;
    	for(int i=1;i<len-n+1;i++) {
    		current=current.next;
    	}
    	return current.value;
    }
    
    public boolean hasCyclefirstApproach() {
    	if(head==null) return false;
    	Node fast=head;
    	Node slow=head;
    	while(fast!=null && fast.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    		if(fast==slow) return true;
    	}
    	return false;
    }
    
    public boolean hasCycleSecondApproach() {
    	HashSet<Node> hs=new HashSet<Node>();
    	for(Node curr=head;curr!=null;curr=curr.next) {
    		if(hs.contains(curr)) {
    			return true;
    		}
    		hs.add(curr);
    	}
    	return false;
    }
    
    public void printelements() {
    	Node temp=head;
    	//System.out.println("head" +head.value);
    	while(temp!=null) {
    		System.out.println(temp.value);
    		temp=temp.next;
    	}
    }

    


}


