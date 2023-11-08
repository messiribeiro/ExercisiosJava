package exercise;

public class pessoaFisica extends Pessoa{

	private String cpf;

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		System.out.println(this.name);
		return this.name;
	}
	
	public String getCpf() {
		System.out.println(this.name);
		return cpf;
	}
	
	public String getLastName() {
		System.out.println(this.lastName);
		return this.lastName;
	}
}
