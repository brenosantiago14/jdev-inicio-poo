package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do(a) aluno(a)?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String nomePai = JOptionPane.showInputDialog("Nome do pai?");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
		String serieMatriculado = JOptionPane.showInputDialog("Série matriculado(a)");
		String escola = JOptionPane.showInputDialog("Nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		String nota2 = JOptionPane.showInputDialog("Nota 21?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		String nota4 = JOptionPane.showInputDialog("Nota 4?");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome(nome);
		aluno3.setIdade(Integer.valueOf(idade));
		aluno3.setDataNascimento(nascimento);
		aluno3.setNomePai(nomePai);
		aluno3.setNomeMae(nomeMae);
		aluno3.setSerieMatriculado(serieMatriculado);
		aluno3.setNomeEscola(escola);
		aluno3.setNota1(Double.parseDouble(nota1));
		aluno3.setNota2(Double.parseDouble(nota2));
		aluno3.setNota3(Double.parseDouble(nota3));
		aluno3.setNota4(Double.parseDouble(nota4));
		
		System.out.println("O(a) aluno(a) " + aluno3.getNome() + ", nascido em " + aluno3.getDataNascimento() + ", com " + aluno3.getIdade() + " anos de idade, " + "filho(a) de " + aluno3.getNomePai() + " e de " + aluno3.getNomeMae() + ", matriculado na " + aluno3.getSerieMatriculado() + " série\nna escola " + aluno3.getNomeEscola() + ", teve média de " + aluno3.getMediaNota() + " e está " + (aluno3.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));
		
	}

}