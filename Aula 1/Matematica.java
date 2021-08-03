public class Matematica {
  public float soma (float n1, float n2) {
    float res = n1 + n2;
    return res;
  }

  public static void main(String a[]) {
    Matematica m = new Matematica();
    System.out.println("Soma 4+4=" + m.soma(4,4));
  }
}