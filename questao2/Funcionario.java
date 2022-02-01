public class Funcionario extends Departamento {
    private String nome;
    private double salario;
    private int admissao;

    public Funcionario(String Nome, String CNPJ, String nomeDepartamento,
            double salarioFuncionario, String nomeFuncionario, int admissaoFuncionario) {

        super(Nome, CNPJ, nomeDepartamento);
        this.nome = nomeFuncionario;
        this.salario = salarioFuncionario;
        this.admissao = admissaoFuncionario;
    }
}