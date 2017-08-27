public class BinaryTreeV2 {
	
	/**
	 * 
	 * 内部节点类
	 * @author yhh
	 */
	private class Node{
		private Node left;
		private Node right;
		private int data;
		public Node(int data){
			this.left = null;
			this.right = null;
			this.data = data;
		}
	}
	
	/**
	 * 递归创建二叉树
	 * @param input
	 * @param index
	 */
	public Node buildTree(int[] input,int index){
		if(index<=input.length){
			Integer value = input[index-1];
			if(value!=null){
				Node t = new Node(value);
				t.left = buildTree(input, index*2);
				t.right = buildTree(input, index*2+1);
				return t;
			}
		}
		return null;
	}
	
	/**
	 * 前序遍历
	 * @param node
	 */
	public void preOrder(Node node){
		if(node != null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	/**
	 * 中序遍历
	 * @param node
	 */
	public void inOrder(Node node){
		if(node != null){
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	/**
	 * 后序遍历
	 * @param node
	 */
	public void postOrder(Node node){
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2,4,12,45,21,6,111};
		BinaryTreeV2 bTree = new BinaryTreeV2();
		Node root = bTree.buildTree(a, 1);
		
		bTree.preOrder(root);
		//bTree.inOrder(bTree.root);
		//bTree.postOrder(bTree.root);
	}

}