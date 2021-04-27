package pacote_dos_Bichos;

public class Gato extends Felino {

	public Gato(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
	}

	@Override
	public String fazerbarulho() {
		return "Gato fazendo barulho";
	}

	@Override
	public String comer() {
		return "Gato comendo";
	}

}
