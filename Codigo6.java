public class Codigo6 {// Se corrigio el nombre de la clase para que sea igual al del .java
	public static void main( String[] args) { //se agrego el main
		  
	  
	    int[] n = new int[20]; //Se uso el new para

	    for (int i = 0; i < 20; i++) {// i+ -> i++
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//System.print(); -> System.out.print();
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");//System.out.printl -> System.out.println | la n
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine()); //se agrego ) al final para cerrar parseInt 

	    
	    int multiplo = (opcion == 1) : 5 ? 7; //Se esta regresando bool a una variable entera, 
		//Pero no recuerdo bien los de cortocircuito

	    foreach (char e : n) {
	    	if (e % multiplo == 0) {
	    		System.out.print("[" + e + "] ");
	    	}
	    	else {
	    		System.in.print(e + " ");
	    	}
	    }
	}
}