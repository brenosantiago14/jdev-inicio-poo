package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do(a) aluno(a)?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("RG?");
		String cpf = JOptionPane.showInputDialog("CPF?");
		String nomePai = JOptionPane.showInputDialog("Nome do pai?");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
		String serieMatriculado = JOptionPane.showInputDialog("Série matriculado(a)");
		String escola = JOptionPane.showInputDialog("Nome da escola?");

		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(escola);

		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " +pos+ " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}

		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? [1] [2] [3] [4]");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}
		
		
		/*
		 * System.out.println("O(a) aluno(a) " + aluno3.getNome() + ", nascido em " +
		 * aluno3.getDataNascimento() + ", com " + aluno3.getIdade() +
		 * " anos de idade, " + "filho(a) de " + aluno3.getNomePai() + " e de " +
		 * aluno3.getNomeMae() + ", matriculado na " + aluno3.getSerieMatriculado() +
		 * " série\nna escola " + aluno3.getNomeEscola() + ", teve média de " +
		 * aluno3.getMediaNota() + " e está " + (aluno3.getAlunoAprovado() ? "Aprovado!"
		 * : "Reprovado!"));
		 */

		System.out.println(aluno1.toString());
		System.out.println("O aluno teve média: " + aluno1.getMediaNota());
		System.out.println("Está " + aluno1.getAlunoAprovado2());

		/* EQUALS E HASHCODE ENTRE OBJETOS!!!!! */
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