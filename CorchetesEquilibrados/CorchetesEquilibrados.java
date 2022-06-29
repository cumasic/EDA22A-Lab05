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
        boolean cond=false;
		if(a.length()%2!=0)
			return cond;
		for(int i=0;i<a.length()/2;i++) {
			if(a.substring(i,i+1).equals("[") && a.substring(a.length()-1,a.length()).equals("]")) 
				cond = true;
			else if(a.substring(i,i+1).equals("(") && a.substring(a.length()-1,a.length()).equals(")")) 
				cond = true;
			else if(a.substring(i,i+1).equals("{") && a.substring(a.length()-1,a.length()).equals("}")) 
				cond = true;
			else 
				cond = false;	
		}
		return cond;
    }
}
