package pacote_dos_Bichos;

public class Leao extends Felino {

	public Leao(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
	}

	@Override
	public String fazerbarulho() {
		return "Le�o fazendo barulho";
	}

	@Override
	public String comer() {
		return "Le�o comendo";
	}

	@Override
	public String toString() {
		return "Leao com atributos que se segue [idade=" + idade + ", peso=" + peso + ", tamanho=" + tamanho + "]";
	}

}
