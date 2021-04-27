package pacote_dos_Bichos;

public class Cachorro extends Canino {

	public Cachorro(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
	}

	@Override
	public String fazerbarulho() {
		return "Cachorro fazendo barulho";
	}

	@Override
	public String comer() {
		return "Cachorro comendo";
	}

}
