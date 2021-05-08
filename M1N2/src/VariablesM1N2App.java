import javax.swing.JOptionPane;

public class VariablesM1N2App {

	public static void main(String[] args) {
		/*Declara una variable double. Assigna-li un valor amb 4 decimals
		 * Declara variables de tipus: int, float i string
		 * Fes un "cast" de la variable double a cada una de les variables que has creat 
		 * anteriorment per inicialitzar-les i pinta-les per pantalla.*/

		
		//Declarar una variable double i assignar-li un valor amb 4 decimals
		double var_double = 3.1416;
		
		//Declarar variables de tipus: int, float i string
		int var_int;
		float var_float;
		String var_string;
		
		//Fer un "cast" de la variable double a cada una de les variables creades per inicialitzar-les, i pintar-les per pantalla
		
		var_int = (int) var_double;
		var_float = (float) var_double;
		var_string = Double.toString(var_double);
		
		JOptionPane.showMessageDialog(null, var_double + " double\n" + var_int + " int\n" + var_float + " float\n" + var_string + " string");
		
	}

}