import java.util.ArrayList;

public class Departamento extends Empresa {
    private String n;

    public Departamento(String N, String CNPJ, String nDepartamento) {
        super(N, CNPJ);
        this.n = nDepartamento;
    }

    public void AdicionarFuncionarios(String NEmpresa, String CNPJEmpresa, double salarioFuncionario,
            String nFuncionario, int admissaoFuncionario) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>(100);
        Funcionario funcUnidade = new Funcionario(NEmpresa, CNPJEmpresa, this.n, salarioFuncionario, nFuncionario,
                admissaoFuncionario);
        funcionarios.add(funcUnidade);
    };

    public double aumentarSalario(int porcentagem, double salario) {
        return (salario / 100 * porcentagem);
    };
}
