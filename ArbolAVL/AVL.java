package ArbolAVL;

public class AVL<E extends Comparable<E>> {
    private Node<E> root;
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
    private Node<E> insertRec(E x,Node<E> current) throws ItemDuplicated {
        Node<E> res = current;
        if (current == null) {//En Caso el árbol este vacio.
			this.height = true;
			res = new Node<E>(x);
		}
        else {
			int resC = current.data.compareTo(x);
			if(resC == 0)//En caso el elemento este repetido
				throw new ItemDuplicated("El dato "+x+" ya fue insertado antes...");
            else if(resC < 0)//En caso el elemento sea mayor que el nodo 
				res.right = insertRec(x, current.right);
				if (this.height) {
					switch(res.fb) {
					case -1 : res.fb = 0; 
                        this.height = false; break;
					case 0 : res.fb = 1; 
                        this.height = true; break;
					case 1 : res.fb = 2;
						res = balanceToLeft(res);
						this.height = false;
					}
				}
            else {
                res.left = insertRec(x, current.left);
				if (this.height) {
					switch(res.fb) {
					case -1 : res.fb = 0; this.height = false; break;
					case 0 : res.fb = 1; this.height = true; break;
					case 1 : res.fb = 2;
							 res = balanceToRight(res);
							 this.height = false;
					}
				} 
            }  
        }
        return res;

    }
    private Node<E> balanceToRight(Node<E> node) {
		Node<E> son = node.left;
		switch(son.fb) {
		case 1 : node.fb = 0;
				 son.fb = 0;
				 node = rotateSL(node);
				 break;
		case -1 : Node<E> grandson = son.right;
				  switch(grandson.fb) {
				  case -1 : node.fb = 0; son.fb = -1; break;
				  case 0 : node.fb = 0; son.fb = 0; break;
				  case 1 : node.fb = 1; son.fb = 0; break;
				  }
				  node.left = rotateSL(son);
				  node = rotateSR(node);
				  break;
		case 0 :
		}
		return node;
	}
    private Node<E> balanceToLeft(Node<E> node) {
        Node<E> son = node.right;
		switch(son.fb) {
		case 1 : node.fb = 0;
				 son.fb = 0;
				 node = rotateSL(node);
				 break;
		case -1 : Node<E> grandson = son.left;
				  switch(grandson.fb) {
				  case -1 : node.fb = 0; son.fb = -1; break;
				  case 0 : node.fb = 0; son.fb = 0; break;
				  case 1 : node.fb = 1; son.fb = 0; break;
				  }
				  node.right = rotateSR(son);
				  node = rotateSL(node);
				  break;
		}
		return node;
    }
    private Node<E> rotateSL(Node<E> node) {
		Node<E> son = node.right;
		node.right = son.left;
		son.left = node;
		node = son;
		return node;
	}
	private Node<E> rotateSR(Node<E> node) {
		Node<E> son = node.left;
		node.left = son.right;
		son.right = node;
		node = son;
		return node;
	} 
    public E search(E x) throws ItemNotFound {
        Node<E> resp = searchRec(x,this.root);
		if(resp == null) 
			throw new ItemNotFound("El dato "+x+" no se encuentra...");
		return resp.data;
    }
    public Node<E> searchRec(E x,Node<E> actual) throws ItemNotFound {
        return null;
    }

    public void remove(E x) {	
    }
    public String toString() {
        return null;
    }
}
