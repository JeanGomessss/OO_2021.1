package main;

import pacote_dos_Bichos.Cachorro;
import pacote_dos_Bichos.Gato;
import pacote_dos_Bichos.Hipopotamo;
import pacote_dos_Bichos.Leao;
import pacote_dos_Bichos.Lobo;

public class Main {

	public static void main(String[] args) {
	

		Leao leao = new Leao(5, 5.5, 5.5);
		Gato gato= new Gato(10, 10.5, 10.5);
		Cachorro cachorro = new Cachorro(15, 15.5, 15.5);
		Lobo lobo = new Lobo(20, 20.5, 20.5);
		Hipopotamo hipopotamo = new Hipopotamo(25, 25.5, 25.5);
		
		System.out.println(leao.fazerbarulho());
		System.out.println(leao.comer());
		System.out.println(leao.vaguear());
		System.out.println(leao.dormir());
		System.out.println(leao.toString());
		System.out.println("--");
		
		System.out.println(gato.fazerbarulho());
		System.out.println(gato.comer());
		System.out.println(gato.vaguear());
		System.out.println(gato.dormir());
		System.out.println(gato.toString());
		System.out.println("--");
		
		System.out.println(cachorro.fazerbarulho());
		System.out.println(cachorro.comer());
		System.out.println(cachorro.vaguear());
		System.out.println(cachorro.dormir());
		System.out.println(cachorro.toString());
		System.out.println("--");
		
		System.out.println(lobo.fazerbarulho());
		System.out.println(lobo.comer());
		System.out.println(lobo.vaguear());
		System.out.println(lobo.dormir());
		System.out.println(lobo.toString());
		System.out.println("--");
		
		System.out.println(hipopotamo.fazerbarulho());
		System.out.println(hipopotamo.comer());
		System.out.println(hipopotamo.vaguear());
		System.out.println(hipopotamo.dormir());
		System.out.println(hipopotamo.toString());
		System.out.println("--");
	}

}
