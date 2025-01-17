package calcularMedia;
import criarAluno.Aluno;
import java.util.Scanner;

public class Media {
	
	//FUNÇÃO QUE PEGA A SOMA DAS NOTAS DIGITADAS E ENCONTRA A MÉDIA
	public static float calcular(float soma) {
		return soma/3;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();//OBJETO ALUNO
		
		//VARIAVEIS
		float vetorNotas[] = new float[3];
		float soma = 0,mediaFinal1 = 0,mediaFinal2 = 0,mediaFinal3 = 0,mediaFinal4 = 0;
		String statusA = "Aprovado", statusR = "Reprovado";
		boolean veri = true;
		int decisao;
 		
		System.out.println("*** CALCULO DA MÉDIA DE UM ALUNO ***\n");
		
		//CAPTURA DE DADOS DO OBJETO ALUNO
		System.out.print("Nome do aluno: ");
		aluno.nome = scan.nextLine();
		System.out.print("Idade do aluno: ");
		aluno.idade = scan.nextInt();
		System.out.printf("Matrícula de %s: ",aluno.nome);
		aluno.matricula = scan.nextInt();
		System.out.println();
		
		//ESCOLHA DA MATERIA 
		System.out.println("Suas disciplinas");
		System.out.println("1- Programação Orientada a Objetos \n2- Banco de Dados \n3- Metodologias ágeis \n4- Redes\n");
		System.out.print("Qual disciplina deseja ver a média? ");
		aluno.disciplina = scan.nextInt();
		
		//LOOP PRINCIPAL ONDE REPETE TODO O CODIGO CONFORME A ESCOLHA DO USUARIO
		while(veri != false) {
			
			//LOOP QUE VERIFICA SE O NUMERO DIGITADO ESTÁ DENTRO DA LISTA DE MATERIAS MENCIONADA 
			while(aluno.disciplina < 1 || aluno.disciplina > 4) {
				System.out.print("Opção inválida, digite uma alternativa listada acima. Qual disciplina deseja ver a média?");
				aluno.disciplina = scan.nextInt();
			}
			
			//SWITCH ONDE RECEBE AS NOTAS E CALCULA CORRESPONDENTE A CADA MATERIA
			switch(aluno.disciplina) {
			case(1):
				System.out.println("*** PROGRAMAÇÃO ORIENTADA A OBJETOS ***\n");
				for(int i = 0; i < vetorNotas.length;i++) {
					System.out.print("Nota " + (i+1) + ": ");
					vetorNotas[i] = scan.nextFloat();
					soma+=vetorNotas[i];
					mediaFinal1 = calcular(soma);
				}
				System.out.printf("Média final: %.2f%n",mediaFinal1);
				if(mediaFinal1 < 7.0) {
					System.out.printf("Aluno '%s' não atingiu a média de 7.0. Status: %s%n",aluno.nome,statusR);
				}else {
					System.out.printf("Aluno '%s' atingiu a média de 7.0 ou superior. Status: %s%n",aluno.nome,statusA);
				}
				break;
			case(2):
				System.out.println("*** BANCO DE DADOS ***\n");
				for(int i = 0; i < vetorNotas.length;i++) {
					System.out.print("Nota " + (i+1) + ": ");
					vetorNotas[i] = scan.nextFloat();
					soma+=vetorNotas[i];
					mediaFinal2 = calcular(soma);
				}
				System.out.printf("Média final: %.2f%n",mediaFinal2);
				if(mediaFinal2 < 7.0) {
					System.out.printf("Aluno '%s' não atingiu a média de 7.0. Status: %s%n",aluno.nome,statusR);
				}else {
					System.out.printf("Aluno '%s' atingiu a média de 7.0 ou superior. Status: %s%n",aluno.nome,statusA);
				}
				break;
			case(3):
				System.out.println("*** METODOLOGIAS ÁGEIS ***\n");
				for(int i = 0; i < vetorNotas.length;i++) {
					System.out.print("Nota " + (i+1) + ": ");
					vetorNotas[i] = scan.nextFloat();
					soma+=vetorNotas[i];
					mediaFinal3 = calcular(soma);
				}
				System.out.printf("Média final: %.2f%n",mediaFinal3);
				if(mediaFinal3 < 7.0) {
					System.out.printf("Aluno '%s' não atingiu a média de 7.0. Status: %s%n",aluno.nome,statusR);
				}else {
					System.out.printf("Aluno '%s' atingiu a média de 7.0 ou superior. Status: %s%n",aluno.nome,statusA);
				}
				break;
			case(4):
				System.out.println("*** REDES ***\n");
				for(int i = 0; i < vetorNotas.length;i++) {
					System.out.print("Nota " + (i+1) + ": ");
					vetorNotas[i] = scan.nextFloat();
					soma+=vetorNotas[i];
					mediaFinal4 = calcular(soma);
				}
				System.out.printf("Média final: %.2f%n",mediaFinal4);
				if(mediaFinal4 < 7.0) {
					System.out.printf("Aluno '%s' não atingiu a média de 7.0. Status: %s%n%n",aluno.nome,statusR);
				}else {
					System.out.printf("Aluno '%s' atingiu a média de 7.0 ou superior. Status: %s%n%n",aluno.nome,statusA);
				}
				break;
			}
			
			//VERIFICAÇÃO CASO O USUARIO DESEJE FAZER OUTRO CALCULO DE MEDIA
			System.out.print("Deseja fazer outro calculo? 1- SIM/ 2- NÃO: ");
			decisao = scan.nextInt();
			while(decisao < 1 || decisao > 2) {
				System.out.print("Opção inválida, digite novamente. 1- SIM/ 2- NÃO: ");
				decisao = scan.nextInt();
			}
			//PEDE O NUMERO CORRESPONDENTE A MATERIA
			System.out.println();
			if(decisao == 1) {
				System.out.print("Qual disciplina deseja ver a média? ");
				aluno.disciplina = scan.nextInt();
			}else {
				veri = false;
			}
		}
		
		//BLOCO CONDICIONAL ONDE MOSTRA NA TELA O RESULTADO CORRESPONDENTE A ESCOLHA DO USUARIO
		if(aluno.disciplina == 1) {
			System.out.printf("Aluno: %s\n",aluno.nome);
			System.out.printf("Matricula: %s\n",aluno.matricula);
			System.out.printf("Média da matéria 'Programação Orientada a Objetos': %.2f%n%n",mediaFinal1);
		}else if(aluno.disciplina == 2) {
			System.out.printf("Aluno: %s\n",aluno.nome);
			System.out.printf("Matricula: %s\n",aluno.matricula);
			System.out.printf("Média da matéria 'Banco de Dados': %.2f%n%n",mediaFinal2);
		}else if(aluno.disciplina == 3) {
			System.out.printf("Aluno: %s\n",aluno.nome);
			System.out.printf("Matricula: %s\n",aluno.matricula);
			System.out.printf("Média da matéria 'Metodologias ágeis': %.2f%n%n",mediaFinal3);
		}else if(aluno.disciplina == 4) {
			System.out.printf("Aluno: %s\n",aluno.nome);
			System.out.printf("Matricula: %s\n",aluno.matricula);
			System.out.printf("Média da matéria 'Redes': %.2f%n%n",mediaFinal4);
		}
		
		System.out.println("Fim do programa");
		
		scan.close();
	}

}
