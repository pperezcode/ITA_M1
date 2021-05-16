
public class VariablesM1N3App {

	public static void main(String[] args) {
		/*    Declara un array de numeros int e inicialitzala amb valors del 1 al 10
	    Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.*/

		
		//Declarar un array de numeros int i inicialitzar amb valors del 1 al 10
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		
		//Pintem l'array inicial
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");		
		}
		System.out.println("");						//Salt de línia
		
		
		//Rotar l'array (sense utilitzar un array auxiliar ni llibreries; es pot utilizar una variable auxiliar)
		
		int j = 0; 		//comptador que ens ajudarà a rotar l'array
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - j;
			j++;
		}
	
		
		//Pintem l'array resultant de la rotació
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");		
		}	
	}

}