package pacote_dos_Bichos;

abstract class Animal {
	protected int idade;
	protected double peso, tamanho;
	
	protected Animal(int idade, double peso, double tamanho) {
		super();
		this.idade = idade;
		this.peso = peso;
		this.tamanho = tamanho;
	}
	
	protected abstract String fazerbarulho();
	
	protected abstract String comer();
	
	public String dormir() {
		return "Todo bicho dorme fechando os olhos";
	}
	
	protected abstract String vaguear();

	@Override
	public String toString() {
		return "Animal [idade=" + idade + ", peso=" + peso + ", tamanho=" + tamanho + "]";
	}
	
	
}
	
	

