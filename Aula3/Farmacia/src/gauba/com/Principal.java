package gauba.com;

public class Principal {
	public static void main(String a[]) {
		
		
		Pessoa p = new Pessoa(); //Instância classe Pessoa
		
		
		p.setNome("pão"); //Definindo o objeto Nome como "pão"
		System.out.println("Nome: " + p.getNome()); //Envia o Nome("pão") na tela de console
		
		p.setCpf("07323454312"); //Definindo o objeto cpf como "07323454312"
		System.out.println("CPF: " + p.getCpf()); //Envia o cpf("07323454312") na tela de console
		
		p.setRg("1233212"); //Definindo o objeto rg como "1233212"
		System.out.println("RG: " + p.getRg()); //Envia o rg("1233212") na tela de console
		

}
	
}
