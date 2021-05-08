
public class VariablesM1N3App {

	public static void main(String[] args) {
		/*    Declara un array de numeros int e inicialitzala amb valors del 1 al 10
	    Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.*/

		
		//Declarar un array de numeros int i inicialitzar amb valors del 1 al 10
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		//Rotar l'array (sense utilitzar un array auxiliar ni llibreries; es pot utilizar una variable auxiliar)
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");		//El pintem del dret
		}
		
		System.out.println("");						//Salt de línia
		
		for (int i = 9; i >= 0; i--) {
			System.out.print(array[i] + " ");		//El pintem del revés
		}
	
	}

}