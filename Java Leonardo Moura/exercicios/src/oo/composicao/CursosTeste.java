package oo.composicao;

public class CursosTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("Ana");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Flutter");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno3.adicionarCuso(curso3);
		aluno3.adicionarCuso(curso3);
		aluno3.adicionarCuso(curso3);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("Meu nome é " + aluno.nome);
		}
	}

}
