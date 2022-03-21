package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtdAluno = 1; qtdAluno <= 2; qtdAluno++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do(a) aluno(a) " + qtdAluno + "?");
			/*
			String idade = JOptionPane.showInputDialog("Idade?");
			String nascimento = JOptionPane.showInputDialog("Data de nascimento?");
			String rg = JOptionPane.showInputDialog("RG?");
			String cpf = JOptionPane.showInputDialog("CPF?");
			String nomePai = JOptionPane.showInputDialog("Nome do pai?");
			String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
			String serieMatriculado = JOptionPane.showInputDialog("Série matriculado(a)");
			String dataMatricula = JOptionPane.showInputDialog("Data Matricula");
			String escola = JOptionPane.showInputDialog("Nome da escola?");
			*/

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			/*
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(nascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomePai(nomePai);
			aluno1.setNomeMae(nomeMae);
			aluno1.setSerieMatriculado(serieMatriculado);
			aluno1.setNomeEscola(escola);
			aluno1.setDataMatricula(dataMatricula);
			*/

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) { /* o 0 é SIM */

				int continuarRemover = 0;

				int posicao = 1;

				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? [1] [2] [3] [4]");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar removendo disciplinas?");
				}
			}

			alunos.add(aluno1);

		}

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("Breno")) {
				alunos.remove(aluno);
				break;
			}else {
				System.out.println(aluno);
				System.out.println("O aluno teve média: " + aluno.getMediaNota());
				System.out.println(aluno.getAlunoAprovado2());
				System.out.println("-----------------------------------------------------------------------------");
			}
		}
		
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista:");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são:");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}

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