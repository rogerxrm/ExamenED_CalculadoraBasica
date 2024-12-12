package calculadora;
//Importamos un scaner
import java.util.Scanner;  
public class SumaNumeros {
	//Creamos el metodo main
	public static void main(String[] args) {  
		
		//Inicializamos el scaner
		Scanner scanner = new Scanner(System.in);  
		
		//Te dice que ingreses un numero y lo escanea
		System.out.print("Ingresa el primer número: ");  
		int numero1 = scanner.nextInt();  
		
		//Te dice que ingreses otro numero y lo escanea
		System.out.print("Ingresa el segundo número: ");  
		int numero2 = scanner.nextInt();  
		
		//Crea una variable que es igual a la suma de los dos numeros ingresadors
		int suma = numero1 + numero2;  
		
		//Te printea por pantalla el resultado de la suma
		System.out.println(" La suma de " + numero1 + " y " + numero2 + " es: " + suma);  
		}  
}

	//Este programa te pide dos numeros y te hace su suma i te enseña el resultado por pantalla
	//Cambio desde la rama feature-suma
	//Comentario despues de realizar fusion entre ramas