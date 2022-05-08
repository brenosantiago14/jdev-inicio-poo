package cursojava.executavel;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe login:");
		String senha = JOptionPane.showInputDialog("Informe senha: ");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * É uma lista que dentro dela temos uma chave que identifica uma sequência de
			 * valores também
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtdAluno = 1; qtdAluno <= 5; qtdAluno++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do(a) aluno(a) " + qtdAluno + "?");
				/*
				 * String idade = JOptionPane.showInputDialog("Idade?"); String nascimento =
				 * JOptionPane.showInputDialog("Data de nascimento?"); String rg =
				 * JOptionPane.showInputDialog("RG?"); String cpf =
				 * JOptionPane.showInputDialog("CPF?"); String nomePai =
				 * JOptionPane.showInputDialog("Nome do pai?"); String nomeMae =
				 * JOptionPane.showInputDialog("Nome da mãe?"); String serieMatriculado =
				 * JOptionPane.showInputDialog("Série matriculado(a)"); String dataMatricula =
				 * JOptionPane.showInputDialog("Data Matricula"); String escola =
				 * JOptionPane.showInputDialog("Nome da escola?");
				 */

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(nascimento); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomePai(nomePai);
				 * aluno1.setNomeMae(nomeMae); aluno1.setSerieMatriculado(serieMatriculado);
				 * aluno1.setNomeEscola(escola); aluno1.setDataMatricula(dataMatricula);
				 */

				for (int pos = 1; pos <= 1; pos++) {
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

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) { /* Separei em listas */

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			}

			System.out.println("- - - - - - - - - - - - - - - Lista dos Aprovados - - - - - - - - - - - - - - -");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
				System.out.println("Média: " + aluno.getMediaNota());
			}

			System.out.println("- - - - - - - - - - - - - - - Lista dos Reprovados - - - - - - - - - - - - - - -");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
				System.out.println("Média: " + aluno.getMediaNota());
			}

			System.out.println("- - - - - - - - - - - - - - - Lista dos em Recuperação - - - - - - - - - - - - - - -");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
				System.out.println("Média: " + aluno.getMediaNota());
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

}