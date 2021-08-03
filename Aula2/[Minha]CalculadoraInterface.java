public interface InterfaceMatematica {
public float soma(float m1, float m2);
public float sub(float m1, float m2);
public float mult(float m1, float m2);
public float div(float m1, float m2);
public double raiz(double m1);
}

public class Calculadora implements InterfaceMatematica {

    float soma = m1 + m2;
    return soma;

    float sub = m1 - m2;
    return sub;

    float mult = m1 * m2;
    return mult;

    float div = m1 / m2;
    return div;

    double raiz = Math.sqrt(m1);
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