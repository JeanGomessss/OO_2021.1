package pacote_dos_Bichos;

public class Hipopotamo extends Animal {

	public Hipopotamo(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		
	}

	@Override
	public String fazerbarulho() {
		return "Hipopotamo fazendo barulho";
	}

	@Override
	public String comer() {
		return "Hipopotamo comendo";
	}

	@Override
	public String vaguear() {
		return "Hipopotamo vagueando";
	}

}
