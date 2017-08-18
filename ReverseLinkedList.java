import java.util.LinkedList;

public class ReverseLinkedList {
	public void reverse(LinkedList<Integer> list) {
		Node h = ml.getHead();
		while (h != null) {
			
			h = h.next;
		}
		
		for (; first <= last; first++, last--) {
			node temp = list.get(last);
			node tempPrev = list.get(last).prev;
			node tempNext = list.get(last).next;
			list.get(last) = list.get(first);
			list.get(last).prev = list.get(first).prev;
			list.get(last).next = list.get(first).next;
			list.get(first) = temp;
			list.get(first).prev = tempPrev;
			list.get(first).next = tempNext;
		}
	
	}
	
	public static void main(String[] args) {
		ReverseLinkedList r = new ReverseLinkedList();
		LinkedList<Intger> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(r.reverse(list));
	}
}