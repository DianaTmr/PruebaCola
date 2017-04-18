package Main;

import Models.Cola;

public class Main {

	public static void main(String[] args) {
		int n1 = 62, n2 = 1, n3 = 3, n4 = 8;

		Cola array = new Cola();
		
		System.out.println(array.toString());
		System.out.println("Elementos a añadir: " +n1+" - "+n2+" - "+n3+" - "+n4);
		System.out.println("\n[>] Añadiendo elementos... ");
		// Añadimos los elementos al array
		array.add(n1);  
		array.add(n2); 
		array.add(n3); 
		array.add(n4); 
		
		System.out.println(array.toString());
		System.out.println("\n[>] Removiendo el objeto "+n2+"...");
		array.remove(n4);
		System.out.println(array.toString());
	}

}
