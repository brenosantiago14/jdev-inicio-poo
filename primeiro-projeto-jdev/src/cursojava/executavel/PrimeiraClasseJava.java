package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setDataMatricula("01/01/2022");
		aluno1.setDataNascimento("01/01/2012");
		
		System.out.println("Nome: "+aluno1.getNome()+ "\nData Matrícula: "+ aluno1.getDataMatricula()+ "\nData Nascimento: "+ aluno1.getDataNascimento());
		System.out.println();
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.setNomeEscola("Colégio Brasil");
		aluno2.setNomeMae("Antônia");
		
		System.out.println("Nome: "+ aluno2.getNome()+ "\nNome Escola: "+aluno2.getNomeEscola()+ "\nNome Mãe: "+ aluno2.getNomeMae());
		System.out.println();
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Rafaela");
		aluno3.setIdade(10);
		aluno3.setNomePai("José");
		aluno3.setNomeMae("Maria");
		aluno3.setNota1(7.1);
		aluno3.setNota2(4.9);
		aluno3.setNota3(8.9);
		aluno3.setNota4(9);
		
		System.out.println("O(a) aluno(a) " + aluno3.getNome() + ", filho(a) de " + aluno3.getNomePai() + " e de " + aluno3.getNomeMae() + ", teve média de " + aluno3.getMediaNota() + " e está " + (aluno3.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
	}

}