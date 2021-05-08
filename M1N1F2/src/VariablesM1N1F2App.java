import javax.swing.JOptionPane;

public class VariablesM1N1F2App {
	public static void main(String[] args) {
		
		//Constant amb el valor de l'any 1948
		
		final int ANY1 = 1948;
		
		//Variable que guardi cada quan hi ha un any de traspàs
		
		int anys_entre_traspas = 4;
		
		
		//Calcular anys de traspàs entre 1948 i any naixement, emmagatzemar resultat en una variable (anys_traspas) 
		
		int any_naixement = 1979;
		int anys_traspas = 0;	//la inicialitzem a 0
		
		anys_traspas = Math.abs((any_naixement - ANY1) / anys_entre_traspas) + 1;	//sumem 1 per comptabilitzar 1948
		
		
		//Mostrar tots els anys de traspàs mitjançant un bucle for i el resultat de la variable anys_traspas
		
		String text = "";
		
		for (int i = 0; i < anys_traspas; i++) {
			
			text = text + " " + Integer.toString(ANY1 + (4 * i));
		}
		
		JOptionPane.showMessageDialog(null, "Anys de traspàs des de 1948 fins 1987:\n" + text + "\n\nNombre d'anys de traspàs entre 1948 i 1979: " + anys_traspas);
		
	}
	
}
