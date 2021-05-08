import javax.swing.JOptionPane;

public class VariablesM1N1F3App {

	public static void main(String[] args) {
		
		//Crear variable booleana TRUE (any de traspàs) / FALSE (any no de traspàs)
		boolean any_traspas = false;	//variable inicialitzada en FALSE

		
		//Demanem per pantalla un any per verificar si és de traspàs
		int any = Integer.parseInt(JOptionPane.showInputDialog("Introdueix un any per saber si és de traspàs"));
		
		if (any%100 == 0) {
			if (any%400 == 0) {
				any_traspas = true;
			} 
		} else if (any%4 == 0) {
			any_traspas = true;
		}
		
		
		//Creem dues variables String per guardar les frases de la validació
		String text_traspas = "L'any " + any + " és un any de traspàs.";
		String text_no_traspas = "L'any " + any + " no és un any de traspàs.";
				
		//Mostrem per consola la frase pertinent en funció de si l'any introduït és de traspàs o no
		//Ex: Anys de traspàs: 1948, 1968, 2000, 2400. Anys que no són de traspàs: 1900, 1979, 1965, 2100. 
		
		if (!any_traspas) {
			System.out.println(text_no_traspas);
		} else {
			System.out.println(text_traspas);
		}

	}

}
