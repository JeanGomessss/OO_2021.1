package classe_objeto;

public class ContaJuridica extends Conta {
	
	private String cnpj;	
	
	
	public ContaJuridica(String nome, String numero, String Cnpj) {
		super(nome, numero);
		this.cnpj = Cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public String imprimeDados() {
		return "Conta Jurídica";
	}
	
	
}
