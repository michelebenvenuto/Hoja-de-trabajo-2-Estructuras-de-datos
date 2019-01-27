/*Saúl Contreras - 18409
Michele Benevuto - 

Clase MyCalculator.java implente la interfaz Calculator

*/

public class MyCalculator implements Calculator{

    public int calculate(int num1, int num2, String op){
    	int retorno;
    	if (op=="+"){
    		retorno == num1+num2;
    	}
    	else if(op=="-"){
    		retorno == num1-num2;
    	}
    	else if(op=="*"){
    		retorno == num1*num2;
    	}
    	else if(op=="/"){
    		retorno == num1/num2;
    	}
    	return retorno;
    }
}

