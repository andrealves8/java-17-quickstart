package banco.classes;

public class Cliente {

	private String nome;
	private String cpf;
	private String dataNascimento;
	
	public Cliente(String titular, String cpf, String dataNascimento) {
		super();
		this.nome = titular;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	

	
	
	

	

}
