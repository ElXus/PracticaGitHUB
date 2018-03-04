package Calculadora;
import java.util.Scanner;
public class Programa {
static Scanner s=new Scanner(System.in);
	public static void main (String[] args) {
		double num1=0,num2=0,resulSuma,resulResta,resulDiv,resulPot;
		System.out.println("Introduce el primer numero: ");
		num1=s.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		num2=s.nextDouble();
		Calculadora c1=new Calculadora(num1,num2);
		resulSuma=c1.suma(num1, num2);
		resulResta=c1.resta(num1,num2);
		resulDiv=c1.division(num1,num2);
		resulPot=c1.potencia(num1,num2);
		
		System.out.println("La suma de los numeros introducidos es: "+resulSuma);
		System.out.println("La resta de los numeros introducidos es: "+resulResta);
		System.out.println("La división de los numeros introducidos es: "+resulDiv);
		System.out.println("La potencia de los numeros introducidos es: "+resulPot);
		System.out.println(c1.toString());
		//TODO: Crear un programa principal que 
	    //utilice todas las funciones de la calculadora
	    //Incluida las operaciones toString y la potencia
		//que habr�is a�adido.
		//Ejecutadlo.

	}
}
