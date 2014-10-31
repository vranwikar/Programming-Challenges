import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Heap {

	private int[] heap;
	private int size=0;
	private static final int FRONT = 1;

	
	public Heap(int size, int[] arr)
	{
		heap =  new int[size+1];
		size = arr.length;
		System.arraycopy(arr, 0, heap, 1, size);
		System.out.println("heap size is " +heap.length);
		
	}

	public int parent(int i)
	{
		return i/2;
	}

	public int left(int i)
	{
		return 2*i;
	}

	public int right(int i)
	{
		return 2*i+1;
	}

	public void swap(int i, int j)
	{
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public int giveMax()
	{
		int max = this.heap[0];
		heap[0] = this.heap[this.size];
		this.heap[this.size-1] = max;
		this.size--;
		this.heapify(1, this.size);
		return max;
	}
	/*public void heapSort(List<Integer> list)
	{
		list.add(this.heap[0]);
		this.heapify(i)
	}*/
	public void heapify(int i,int length)
	{
		int l = this.left(i);
		int r = this.right(i);
		int largest = 0;
		//System.out.println("left and right are " +l +" " + r);
		if( l < length && heap[l] > heap[i])
			largest = l;
		else
			largest = i;
		if(r < length && heap[r] > heap[largest])
			largest = r;
		
		if(largest!=i)
		{
			swap(i, largest);
			heapify(largest,length);
		}
		
	}

	
	public void print()
	{
		for(int i = 0; i<heap.length/2;i++)
			System.out.println("For Parent " +heap[i] + " Left child is " + heap[2*i] + " Right child is " + heap[2*i+1]);
	}

}

public class MaxHeap
{

	public static void main(String[] args)
	{
		int [] arr = {5, 3, 17, 10, 84, 19, 6, 22 ,9, 14};
		System.out.println("arr size is " +arr.length);
		Heap hp = new Heap(arr.length, arr);
		
		List<Integer> list = new ArrayList<Integer>();
		for (int pos = (arr.length/2); pos >= 1; pos--)
		{
			hp.heapify(pos, arr.length);
		}
		int x = hp.giveMax();
		System.out.println(x);
		x = hp.giveMax();
		System.out.println(x);
		//hp.print();
		//hp.heapSort(list);
	
	}
}