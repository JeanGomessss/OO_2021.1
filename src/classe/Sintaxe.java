package classe;

public class Sintaxe {
	
	public int int1 = 1, int2 = 2, int3 = 3;
	public float float1 = 1.1f , float2 = 2.2f, float3 = 3.3f;
	public double double1 = 1.1, double2 = 2.2, double3 = 3.3;
	public boolean boolean1;
	public String nome = "Jean", sobrenome = "Gomes", str1, str;
	public char[] vetChar;
	//Outra forma de declarar um vetor
	public String vetStr[];
	public Sintaxe() {
		vetChar = new char[6];
		vetChar[0] = 'J';
		vetChar[1] = 'e';
		vetChar[2] = 'a';
		vetChar[3] = 'n';

	}
	
	
//------------------------------------------------------------------------------------------------------------------------------
	public void calculaInt() {
		
		System.out.println(int1+int2+int3);
		
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------	
	public void calculaFloat() {
		int x = 20;
		System.out.println(float1+float2+float3);
		System.out.printf("O valor é %.2f e o outro é %d", float1+float2+float3, x);
		System.out.println();
		
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------	
	public void calculaDouble() {
		
		System.out.println(double1+double2+double3);
		
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------	
	public void calculaComCast() {
		
		System.out.printf("O valor é: %.1f", double1 + (double)int1);
		
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------	
	public void concatenaString() {
		
		System.out.println("O meu nome1 é: " + nome + " " + sobrenome);		
		System.out.printf("O meu nome2 é: %s%n", nome + " " + sobrenome);		
		str1 = nome.concat(sobrenome);
		System.out.printf("O meu nome3 é: %s%n", str1);				
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------
	public void vetorChar() {
		
		vetChar[0] = 'J';
		vetChar[1] = 'e';
		vetChar[2] = 'a';
		vetChar[3] = 'n';
		
		System.out.println("Meu nome é: " + vetChar[0] + vetChar[1] + vetChar[2] + vetChar[3] + "\n");
		System.out.printf("%c%c%c%c%c%c\n", vetChar[0], vetChar[1], vetChar[2],  vetChar[3]);				
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------
	// EXEMPLOS DE FOR
	
	public void fluxoFor1() {
		
		for (int i = 0; i < 10; i = i+1) {
			System.out.println("Olá");
		}
	}
	
	public void fluxoFor2() {
		int i = 0;
		
		for (i = 5; i < 10; i = i+1) {
			System.out.println("Mundo");
		}
	}
	
	public void fluxoFor3() {
		int i = 0;
		for(; i < 10; ++i) {
			System.out.println("Louco");
		}
	}
	
	public void fluxoFor4() {
		int i = 0;
		for (; i < 10;) {
			++i;
			System.out.println("Incremento");
		}
	}
	
	public void fluxoFor5() {
		int i = 10;
		for (; i > 0;) {
			--i;
			System.out.println("Decremento5");
			
		}
	}
	
	public void fluxoFor6() {
		int i = 10;
		for (; i > 0; i = i-1) {
			System.out.println("Decremento6");
		}
	}

//------------------------------------------------------------------------------------------------------------------------------
	
	public void fluxoForVet() {
	
		for(int i = 0; i < 6; ++i) {
			System.out.println(vetChar[i]);
		}
	}
	
	public void fluxoForVet2() {
		for (char aux : vetChar) {
			System.out.println(aux); 
		}
	}
	
	public void fluxoForVet3() {
		for (int i = 0; i < vetChar.length ; ++i) {
			System.out.println(vetChar[i]);
		}
	}

	
//------------------------------------------------------------------------------------------------------------------------------
	
	public void concatCharComFor1() {
		str = "";
		for (int i = 0; i < 6; ++i ) {
			str = str + vetChar[i];
		}
		System.out.println("Meu nome é: " + str);
		
	}
	
	public void concatCharComFor2() {
		str = "";
		for (int i = 0; i < vetChar.length; ++i) {
			//J + E + A + N = JEAN
			str = str.concat(Character.toString(vetChar[i]));
		}
		System.out.printf("Meu nome concatChar é: %s%n", str);
	}
	
	public void concatCharComFor3() {
		str = "";
		for (char aux : vetChar) {
			//J + E + A + N = JEAN
			str = str.concat(Character.toString(aux)); //JEAN
		}
		System.out.printf("Meu nome concatChar é: %s%n",  str);
	}
	
//------------------------------------------------------------------------------------------------------------------------------	
	
	public void contcatCharComOperador() {
		String auxStr1 = "";
		String auxStr2 = "";
		for (int i = 0; i < 6; ++i) {
			auxStr1 = auxStr1 + Character.toString(vetChar[i]);
			auxStr2 += Character.toString(vetChar[i]);
		}
		
		System.out.println("Meu nome concatCharComOperador1 é:" + auxStr1);
		System.out.println("Meu nome concatCharComOperador1 é:" + auxStr2);
		System.out.println("Meu nome valueOf é:" + String.copyValueOf(vetChar));
	}

//------------------------------------------------------------------------------------------------------------------------------
	
	public void condicionalIF1() {
		
		if(int1 < int2)
			System.out.println("O valor do inteiro 1 é menor que o valor do inteiro 2.");
		else
			System.out.println("O valor do inteiro 1 é maior que o valor do inteiro 2.");
	}
	
	public void condicionalIF2() {
		int1 = 10;
		int2 = 20;
		
		if(int1 > int2)//true
			System.out.println("O valor do inteiro 1 é menor que o valor do inteiro 2.");
		else
			System.out.println("O valor do inteiro 1 é maior que o valor do inteiro 2");
	}
	
	public void condicionalIF3() {
		
		String result = int1 < int3? "Sim" : "Não";
		System.out.println(result);
	}
	
	
	public void operadorlogico() {
		int idade = 15;
		boolean amigoDoDono = true;
		
		if(idade < 18 && amigoDoDono == false) {
			System.out.println("Não pode entrar");
		}
		else {
			System.out.println("Pode entrar");
		}
	}
	
	public void operadorlogico2() {
		int idade = 15;
		boolean amigoDoDono = true;
		
		if(idade < 18 || amigoDoDono == false) {
			System.out.println("Não pode entrar");
		}
		else {
			System.out.println("Pode entrar");
		}
	}
	
	public void incrementosPrePos() {
		int i = 0;
		int x = i++;
		System.out.println(x);
		int y = ++i;
		System.out.println(y);
		
	}
	
	public void loopWhile() {
		int i = 0;
		
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void loopDoWhile() {
		int i = 4;
		
		do {
			System.out.println(i);
			i++;
		}
		while (i < 5);
	}
	
	public void switchCase() {
		int day = 5;
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Nenhuma das opções");
			break;
		}
	}
}
	
	

