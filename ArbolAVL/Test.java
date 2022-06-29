package ArbolAVL;

public class Test {
    public static void main(String[]args) {
        AVL<Integer> b = new AVL<Integer>();
        try {
            Integer[] data = {100,200,300,400,50,25,350,365,120};
            for (Integer i : data) {
                b.insert(i);
            }
            System.out.println(b);
            b.remove(100);
            System.out.println(b);
            System.out.println(b.search(200));
            System.out.println(b);
        }
        catch(Exception x){
            System.out.println(x.getMessage());
        }
     }
}
