public class MainMatematica {
	public static void main(String a[]) {
		Matematica m = new Matematica();
		System.out.println("Soma 4+4=" + m.somar(4, 4));
		System.out.println("Subtrair 6-4=" + m.subtrair(6, 4));
		System.out.println("Multiplicar 10*2=" + m.multiplicar(10, 2));
		System.out.println("Dividir 25/5=" + m.dividir(25, 5));
		System.out.println("Raiz 49=" + m.raiz(49));
	}

	public class Matematica implements InterfaceMatematica {
		public float somar(float n1, float n2) {
			float res = n1 + n2;
			return res;
		}

		public float subtrair(float n1, float n2) {
			float res = n1 - n2;
			return res;
		}

		public float multiplicar(float n1, float n2) {
			float res = n1 * n2;
			return res;
		}

		public float dividir(float divisor, float dividendo) {
			float res = divisor / dividendo;
			return res;
		}

		public double raiz(float numero) {
			double res = Math.sqrt(numero);
			return res;
		}
	}

}
