package exercise;

public class pessoaJuridica extends Pessoa{

		private String cnpj;

		@Override
		public void setName(String name) {
			this.name = name;
		}
		
		public void setCnpj(String cpf) {
			this.cnpj = cpf;
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
		
		public String getCnpj() {
			System.out.println(this.name);
			return cnpj;
		}
		
		public String getLastName() {
			System.out.println(this.lastName);
			return this.lastName;
		}
	

}
