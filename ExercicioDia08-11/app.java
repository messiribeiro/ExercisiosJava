package exercise;

public class app {

	public static void main(String[] args) {
		pessoaFisica pessoa1 = new pessoaFisica();
		pessoaJuridica pessoa2 = new pessoaJuridica();
		
		
		pessoa1.setName("micael");
		pessoa1.setLastName("Ribeiro");
		pessoa1.setAge(19);
		pessoa1.setCpf("068631661-43");
		
		pessoa1.getName();
		
		
		pessoa2.setName("2rrs");
		pessoa2.setCnpj("12.345.678/0001-00");
		pessoa2.setAge(2);
		
		pessoa2.getCnpj();

	}

}
