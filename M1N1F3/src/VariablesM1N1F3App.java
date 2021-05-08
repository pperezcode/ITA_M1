import javax.swing.JOptionPane;

public class VariablesM1N1F3App {

	public static void main(String[] args) {
		
		//Crear variable booleana TRUE (any de trasp�s) / FALSE (any no de trasp�s)
		boolean any_traspas = false;	//variable inicialitzada en FALSE

		
		//Demanem per pantalla un any per verificar si �s de trasp�s
		int any = Integer.parseInt(JOptionPane.showInputDialog("Introdueix un any per saber si �s de trasp�s"));
		
		if (any%100 == 0) {
			if (any%400 == 0) {
				any_traspas = true;
			} 
		} else if (any%4 == 0) {
			any_traspas = true;
		}
		
		
		//Creem dues variables String per guardar les frases de la validaci�
		String text_traspas = "L'any " + any + " �s un any de trasp�s.";
		String text_no_traspas = "L'any " + any + " no �s un any de trasp�s.";
				
		//Mostrem per consola la frase pertinent en funci� de si l'any introdu�t �s de trasp�s o no
		//Ex: Anys de trasp�s: 1948, 1968, 2000, 2400. Anys que no s�n de trasp�s: 1900, 1979, 1965, 2100. 
		
		if (!any_traspas) {
			System.out.println(text_no_traspas);
		} else {
			System.out.println(text_traspas);
		}

	}

}
