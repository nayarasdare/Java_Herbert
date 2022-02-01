import java.util.ArrayList;

public class Empresa {
    private String Nome;
    private String CNPJ;

    public Empresa(String nome, String cnpj) {
        this.Nome = nome;
        this.CNPJ = cnpj;
    };

    public void AdicionarDepartamentos(String nomeDoDepartamento) {
        ArrayList<Departamento> departamentos = new ArrayList<>(10);
        Departamento depUnidade = new Departamento(this.Nome, this.CNPJ, nomeDoDepartamento);
        departamentos.add(depUnidade);

    };
}
