package Calculadora;
/*
 * @version 04/03/2018
 */
public class Calculadora {

	double op1;
	double op2;
	
	/*
	 * @param op1,op2: creamos los parametros para las operaciones.
	 */
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double suma(double num1, double num2) {
		return op1+op2;
		
		/*
		 * @return op1+op2 : devuelve la suma de op1 y op2.
		 */
	}
	
	public double resta(double num1, double num2) {
		return op1-op2;
		/*
		 * @return op1-op2 : devuelve la resta de op1 y op2
		 */
	}
	
	public double division(double num1, double num2) {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
			/*
			 * Imprime por pantlla "El divisor es 0 " si hay un error
			 */
		}
		return op1/op2;
		/*
		 * @return op1/op2 : devuelve la division entre op1 y op2
		 */
		
	}
	
	public double potencia(double op1, double op2) {
		/*
		 * @return devuelve la variable op2 elevada a op1
		 */
		if(op1==0) {
			return 1;
		}
		
		if(op2>0) {
			return Math.pow(op1,op2);
		}
		return Math.pow(op1,op2);
	}

	@Override
	public String toString() {
		return "Calculadora Jesús Morales [operacion 1=" + op1 + ", operacion 2=" + op2 + "]";
	}
	

	
	
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
