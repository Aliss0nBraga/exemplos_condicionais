package exemplos_condicionais;

import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

//		Random rand = new Random();
//		byte num1 = (byte) rand.nextInt(4);
//		byte num2 = (byte) rand.nextInt(4);
//		
//		boolean comp1 = num1 == num2;
//		boolean comp2 = num1 != num2;
//		
//		System.out.printf("A primeira comparação é verdadeira: %b\n", comp1);
//		System.out.printf("A segunda comparação é verdadeira: %b\n", comp2);

//		boolean logico1 = true; 
//		boolean logico2 = false;
//
//		// Lógico OU (Disjunção)
//		boolean comparacaoLogica1 = logico1 || logico2;
//		// Lógico E (Conjunção)
//		boolean comparacaoLogica2 = logico1 && logico2;
//		
//		System.out.printf("A primeira comparação lógica é verdadeira: %b\n", comparacaoLogica1);
//		System.out.printf("A segunda comparação lógica é verdadeira: %b\n", comparacaoLogica2);

//		byte nota1 = 5;
//		byte nota2 = 8;
//		byte nota3 = 6;
//		
//		float media = (nota1+nota2+nota3)/3;
//		
//		boolean estaAprovado = media >= 6;
//		//boolean estaReprovado = media <= 6;
//		
//		System.out.printf("O aluno foi aprovado? %b\n" ,estaAprovado);
//		//System.out.printf("O aluno foi reprovado? %b\n", estaReprovado);

//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite o primeiro número");
//		float num1 = teclado.nextFloat();

//		System.out.println("Digite o segundo numero");
//		float num2= teclado.nextFloat();
//		
//		float maior = maiorValor(num1,num2);
//		
//		System.out.printf("o maior valor é o número %.0f\n", maior);

//		boolean resultado = ePositivo(num1);
//		
//		if(resultado) {
//			System.out.println("O número digitado é positivo");
//		}else {
//			System.out.println("O número digitado é negativo");

//		System.out.println("Digite a letra desejada:");
//		String letra = teclado.next();

//		System.out.println(eVogal (letra));

///		System.out.println(verificarSexo(letra));

//		teclado.close();

//	private static float maiorValor(float num1, float num2) {
//		if (num1 > num2) {
//			return num1;
//		} else {
//			return num2;

//	private static boolean ePositivo(Float num) {
//		return num >= 0;

//	private static String eVogal(String letra) {
//		if(letra.equalsIgnoreCase("a")) letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||letra.equalsIgnoreCase("u");
//			return "A letra digitada é uma vogal";
//	}else {
//		return "A letra digitada é uma consoante";

//	private static String verificarSexo(String sexo) {
//		if (sexo.equalsIgnoreCase("M")) {
//			return "O sexo selecionado é masculino";
//
//		} else if (sexo.equalsIgnoreCase("F")) {
//			return "O sexo selecionado é feminino";

//		} else {
//			return "Sexo é inválido";

	// comentar tudo
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a primeira nota:");
	float n1 = teclado.nextFloat();
	System.out.println("Digite a segunda nota");
	float n2 = teclado.nextFloat();
	
	System.out.println(verificarNota(n1, n2));
	}

	private static String verificarNota(float n1, float n2) {
		float media = (n1 + n2) / 2;

		if (media == 10) {
			return "Aluno aprovado com mérito!!!";
		} else if (media >= 6) {
			return "Aluno aprovado!!!";
		} else {
			return "Aluno reprovado!!!";
		}
	}
}