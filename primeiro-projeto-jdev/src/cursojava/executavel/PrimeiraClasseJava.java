package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		 String nome = JOptionPane.showInputDialog("Qual o nome do(a) aluno(a)?");
		 String idade = JOptionPane.showInputDialog("Qual a idade?"); 
		 String nascimento = JOptionPane.showInputDialog("Data de nascimento?");
		 String rg = JOptionPane.showInputDialog("RG?");
		 String cpf =  JOptionPane.showInputDialog("CPF?");
		 String nomePai = JOptionPane.showInputDialog("Nome do pai?");
		 String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
		 String serieMatriculado = JOptionPane.showInputDialog("Série matriculado(a)");
		 String escola = JOptionPane.showInputDialog("Nome da escola?");
		 String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		 String nota1 = JOptionPane.showInputDialog("Nota 1?");
		 String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		 String nota2 =  JOptionPane.showInputDialog("Nota 2?");
		 String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		 String nota3 =  JOptionPane.showInputDialog("Nota 3?");
		 String disciplina4 = JOptionPane.showInputDialog("DIsciplina 4?");
		 String nota4 = JOptionPane.showInputDialog("Nota 4?");
		 
		 Aluno aluno3 = new Aluno();
		 aluno3.setNome(nome);
		 aluno3.setIdade(Integer.valueOf(idade));
		 aluno3.setDataNascimento(nascimento);
		 aluno3.setRegistroGeral(rg);
		 aluno3.setNumeroCpf(cpf);
		 aluno3.setNomePai(nomePai);
		 aluno3.setNomeMae(nomeMae);
		 aluno3.setSerieMatriculado(serieMatriculado);
		 aluno3.setNomeEscola(escola);
		 aluno3.getDisciplina().setNota1(Double.parseDouble(nota1));
		 aluno3.getDisciplina().setNota2(Double.parseDouble(nota2));
		 aluno3.getDisciplina().setNota3(Double.parseDouble(nota3));
		 aluno3.getDisciplina().setNota4(Double.parseDouble(nota4));
		 
		 aluno3.getDisciplina().setDisciplina1(disciplina1);
		 aluno3.getDisciplina().setDisciplina2(disciplina2);
		 aluno3.getDisciplina().setDisciplina3(disciplina3);
		 aluno3.getDisciplina().setDisciplina4(disciplina4);
		 
		
		 /*
		  System.out.println("O(a) aluno(a) " + aluno3.getNome() + ", nascido em " +
		  aluno3.getDataNascimento() + ", com " + aluno3.getIdade() +
		  " anos de idade, " + "filho(a) de " + aluno3.getNomePai() + " e de " +
		  aluno3.getNomeMae() + ", matriculado na " + aluno3.getSerieMatriculado() +
		  " série\nna escola " + aluno3.getNomeEscola() + ", teve média de " +
		  aluno3.getMediaNota() + " e está " + (aluno3.getAlunoAprovado() ? "Aprovado!"
		  : "Reprovado!"));
		 */
		
		
		 System.out.println(aluno3.toString());
		 System.out.println("O aluno teve média: " + aluno3.getMediaNota());
		 System.out.println("Está " + aluno3.getAlunoAprovado2());
		 
		
		
		
		/*EQUALS E HASHCODE ENTRE OBJETOS!!!!!*/
		/*
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("José");
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("José");
		 * 
		 * 
		 * if(aluno1.equals(aluno2)) {
		 * System.out.println("Os alunos têm o mesmo nome. São iguais."); }else {
		 * System.out.println("Os alunos têm nomes diferentes. Não são iguais."); }
		 */
		
	}

}