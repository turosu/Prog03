/* Escribir un programa que lea una secuencia de datos num�ricos de longitud indefinida,
 * de manera que cuando el n�mero sea el cero cesar� la entrada de dicha secuencia.
 * El programa debe imprimirnos la media de todos ellos, el mayor y el menor.*/
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);

		int numero,contador,suma,media;
		
		System.out.println ("Ingrese un n�mero");
		numero= teclado.nextInt ();
		contador=0;
		suma=0;
		suma=suma+numero;


		while (numero!=0) {
			System.out.println ("Ingrese un n�mero");
			numero= teclado.nextInt ();
			contador=contador+1;
			suma=suma+numero;
			
				
			}
			
		
	
		media=suma/contador;
		System.out.println("Media" + media);
	}

}
