package ArbolAVL;

public class AVL<E extends Comparable<E>> {
    private Node root;
	private boolean height;
    public AVL() {
		this.root = null;
	}
	public boolean isEmpty() {
		return this.root == null;
	}
    public void insert(E x) throws ItemDuplicated{
        this.height = false;
		this.root = insertRec(x, this.root);
	}
    private Node<E> insertRec(E x,Node current) throws ItemDuplicated {
        Node<E> res = current;
        if (current == null) {//En Caso el árbol este vacio.
			this.height = true;
			res = new Node<E>(x);
		}
        return null;

    }    
    public E search(E x) {
        return null;
    }
    public void remove(E x) {	
    }
    public String toString() {
        return null;
    }
}
