package ArbolAVL;

public class Node<E extends Comparable<E>> {
    protected E data;
    protected Node<E> left;
    protected Node<E> right;
    protected int fb;
    
    public Node(E data,Node<E> left,Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.fb = 0;
    }
    public Node(E data) {
        this(data, null, null);
    }
    public E getData() {
        return this.data;
    }
    public void setData(E data) {
        this.data = data;
    }
    public Node<E> getLeft(){
        return this.left;
    }
    public void setLeft(Node<E> left) {
        this.left = left;
    }
    public Node<E> getRight(){
        return this.right;
    }
    public void setNext(Node<E> right) {
        this.right = right;
    }
    public String toString() {
        return this.data.toString();
    }
}
