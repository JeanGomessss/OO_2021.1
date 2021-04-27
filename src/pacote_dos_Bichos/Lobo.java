package pacote_dos_Bichos;

public class Lobo extends Canino {

	public Lobo(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
	}

	@Override
	public String fazerbarulho() {
		return "Lobo fazendo barulho";
	}

	@Override
	public String comer() {
		return "Lobo comendo";
	}

}
