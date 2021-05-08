import javax.swing.JOptionPane;

public class VariablesM1N1F1App {
	public static void main(String[] args) {
		//Crear 3 variables string i inicialitzar-les
		String nom = "Patricia";
		String cognom1 = "Pérez";
		String cognom2 = "Gallego";
		
		//Crear 2 variables ins i inicialitzar-les
		int dia = 14;
		int mes = 4;
		int any = 1979;
		
		//Mostrar per pantalla les variables string concatenades i les variables int concatenades amb "/"
		
		JOptionPane.showMessageDialog(null, cognom1 + " " + cognom2 + ", " + nom + "\n" + dia + "/" + mes + "/" + any);
		
	}
}
