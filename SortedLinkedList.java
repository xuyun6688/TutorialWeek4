public class SortedLinkedList {

	private class Node {
		int val;
		Node next;
	}
	
	private Node tail;
	private Node head;
	
	public void add(int val) {
		if (head == null) {
			head = new Node();
			head.val = val;
			tail = head;
		} else {
			Node n = new Node();
			n.val = val;
			tail.next = n;
			tail = n;
		}
	}
	
	public void insert(int val) {
		if (head != null) {
			Node n = head;
			if (val < n.val) {
				Node newNode = new Node();
				newNode.val = val;
				newNode.next = n;
				head = newNode;
				return;
			}
			
			while (n.next != null) {
				if (n.val < val && n.next.val > val) {
					Node newNode = new Node();
					newNode.val = val;
					newNode.next = n.next;
					n.next = newNode;
					return;
				}
				n = n.next;
			}
		}
		add(val);
	}
	
	public Node getHead() {
		return head;
	}

	public static void main(String[] args) {
		SortedLinkedList ml = new SortedLinkedList();
		ml.add(1);
		Node h = ml.getHead();
		while (h != null) {
			System.out.print(h.val + "->");
			h = h.next;
		}
		System.out.println();
		ml.add(3);
		ml.add(8);
		h = ml.getHead();
		while (h != null) {
			System.out.print(h.val + "->");
			h = h.next;
		}
		System.out.println();
		ml.insert(5);
		h = ml.getHead();
		while (h != null) {
			System.out.print(h.val + "->");
			h = h.next;
		}
		System.out.println();
		ml.insert(9);
		h = ml.getHead();
		while (h != null) {
			System.out.print(h.val + "->");
			h = h.next;
		}
		System.out.println();
		ml.insert(0);
		h = ml.getHead();
		while (h != null) {
			System.out.print(h.val + "->");
			h = h.next;
		}
	}
}