public class VariablesM1N1F4App {

	public static void main(String[] args) {
				
		//Crear una �nica variable on juntarem nom i cognoms (nom complet)
		
		String nom = "Patricia";
		String cognom1 = "P�rez";
		String cognom2 = "Gallego";
		
		String nom_complet = nom + " " + cognom1 + " " + cognom2;
		
			
		//Crear una �nica variable on juntarem la data de naixement (DD/MM/AAA)
		
		int dia = 14;
		int mes = 4;
		int any = 1979;
		
		String data_naixement = dia + "/" + mes + "/" + any;
		
		
		//Verificar si l'any de naixement �s de trasp�s o no
		
		boolean any_traspas = false;
		
		if (any%100 == 0) {
			if (any%400 == 0) {
				any_traspas = true;
			} 
		} else if (any%4 == 0) {
			any_traspas = true;
		}
		
		String text = "";
		String text_traspas = "L'any " + any + " �s un any de trasp�s.";
		String text_no_traspas = "L'any " + any + " no �s un any de trasp�s.";
				
		if (!any_traspas) {
			text = text_no_traspas;
		} else {
			text = text_traspas;
		}

				
		//Mostrar per consola nom complert, data de naixement i si l'any de naixement �s de trasp�s o no
		
		System.out.println("El meu nom �s " + nom_complet + ".\nVaig n�ixer el " + data_naixement + ".\n" + text);			
		
	}

}
