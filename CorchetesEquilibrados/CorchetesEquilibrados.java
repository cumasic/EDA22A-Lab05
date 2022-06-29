package CorchetesEquilibrados;
import java.util.*;
public class CorchetesEquilibrados {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena:");
		String cadena=sc.next();
		boolean cond = isBalanced(cadena);
		if(cond)
            System.out.println("La cadena está equilibrada");
        else
            System.out.println("La cadena no está equilibrada");

    }
    public static boolean isBalanced(String a){
        
        return true;
    }
}
