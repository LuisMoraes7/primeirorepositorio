public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;
    public void cadastrarAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public void ministrarDisciplina(Professor professor){
        this.professor = professor;
    }

    public Disciplina() {
    }

    public Disciplina(String nome, Aluno aluno, Professor professor) {
        setNome(nome);
        cadastrarAluno(aluno);
        ministrarDisciplina(professor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }


    public Aluno getAluno() {
        return aluno;
    }


    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
