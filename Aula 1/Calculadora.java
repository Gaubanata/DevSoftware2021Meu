public class Calculadora {
 
public float soma (float n1, float n2) {
    float soma = n1 + n2;
    return soma;
}

public float sub (float n1, float n2) {
    float sub = n1 - n2;
    return sub;
}

public float mult (float n1, float n2) {
    float mult = n1 * n2;
    return mult;
  }

public float div (float n1, float n2) {
    float div = n1 / n2;
    return div;
  }

public double raiz (double n1) {
    double raiz = Math.sqrt(n1);
    return raiz;
  }

  public static void main(String a[]) {
    	Calculadora m = new Calculadora();
    	System.out.println("Soma de 4+4=" + m.soma(4,4));
	System.out.println("Subtracao de 4-4=" + m.sub(4,4));
	System.out.println("Multiplicacao de 4*4=" + m.mult(4,4));
	System.out.println("Divisao de 4/4=" + m.div(4,4));
	System.out.println("Raiz Quadrada de 9=" + m.raiz(9));
  }
}