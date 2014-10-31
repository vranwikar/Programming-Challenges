import java.io.*;
import java.util.HashSet;

public class LinkedList {

	Node start;

	public LinkedList()
	{
		this.start = null;
	}


	public void add(int data)
	{
		if(start==null)
		{
			System.out.println("Adding First Element...");
			Node nd = new Node(data);
			start = nd;
		}
		else
		{
			Node current = start;
			while((current.next) !=null)
			{
				current = current.next;
			}
			Node nd = new Node(data);
			current.next = nd;
		}
	}

	public void print()
	{
		if(start == null)
			System.out.println("Empty List");
		Node curr = start;
		while(curr != null)
		{
			System.out.println("Node data is " +curr.data);
			curr = curr.next;
		}
	}

	public LinkedList removeDups(LinkedList l1)
	{
		if(this==null)
			System.out.println("LinkedList null");
		else
		{	
			HashSet<Integer> hSet = new HashSet<Integer>();
			Node curr = this.start;
			Node prev = null;
			while(curr!=null)
			{
				if(hSet.contains(curr.data))
				{
					System.out.println("Found duplicate and  Value is " +curr.data);
					prev.next = curr.next;
					curr = curr.next;
				}
				else
				{
					hSet.add(curr.data);
					prev = curr;
					curr = curr.next;
				}
			}
		}

		return this;
	}

	public Node kthLastNode(int k)
	{
		Node p1 = this.start;
		Node p2 = this.start;
		int count = 0;
		while(count < k)
		{
			p2 = p2.next;
			count++;
		}
		while(p2!=null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}

		return p1;
	}

	public LinkedList addLinkedList(LinkedList l2)
	{
		Node l1ptr = this.start;
		Node l2ptr = l2.start;
		int carry =0;
		int sum = 0;
		LinkedList result = new LinkedList();
		while((l1ptr != null && l2ptr != null) )
		{
			int v1 = 0;
			int v2 = 0;

			if(l1ptr!=null)
			{
				v1 = l1ptr.data;
				System.out.println("value v1 is " +v1);
			}
			if(l2ptr!=null)
			{
				v2 = l2ptr.data;
				System.out.println("value v2 is " +v2);
			}
			sum = carry + v1 + v2;

			if(sum >= 10)
			{
				sum = sum % 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}

			result.add(sum);
			System.out.println("Number added to Result" +sum);
			l1ptr = l1ptr.next;
			l2ptr = l2ptr.next;
		}

		if(carry > 0)
		{
			result.add(carry);
		}
		return result;
	}

	public static void pairWiseSwap(LinkedList l1) {

		if(l1.start == null || l1.start.next == null){
			System.out.println("No need to do anything");
		}
		Node head = null;
		Node first = l1.start;
		Node second = first.next;
		head = second;

		while(true){

			Node temp = second.next;
			second.next = first;
			if(temp == null || temp.next== null){
				first.next = second.next;
				break;
			}
			first.next = temp;

			first = temp;
			second = first.next;
		}

		System.out.println();
	}


	public static void mergeSortedLL(LinkedList l1, LinkedList l2) {

		Node head = null;
		Node first = l1.start;
		Node second = l2.start;

		while(first != null && second!= null){

			if(first.data <= second.data){
				Node temp = first.next;
				first.next = second;
				if(head == null)
					head = first;
				first = temp;
			}
			else{
				Node temp = second.next;
				second.next = first;
				if(head == null)
					head = second;
				second = temp;
			}
		}
		System.out.println();
	}

	public static void intersectionofLL(LinkedList l1, LinkedList l2){

		Node first = l1.start;
		Node second = l2.start;
		LinkedList l3 = new LinkedList();
		while(first != null && second != null){
			
			if(first.data == second.data){
				l3.add(first.data);
				first = first.next;
				second = second.next;
			}
			else if(first.data < second.data){
				first = first.next;
			}
			else if(first.data > second.data){
				second = second.next;
			}
		}
		
		l3.print();
	}
}




