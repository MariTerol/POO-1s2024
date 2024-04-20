package exemplos.heranca.empresa;

public class Gerente extends Funcionario{
    
    private Integer quantidadegerenciados;
    
    private Gerente(){}

    public Gerente(String nome,Integer telefone,Integer cpf,Double salario,Integer quantidadegerenciados){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.salario = salario;
        this.quantidadegerenciados = quantidadegerenciados;
    }

    public Integer getQuantidadegerenciados() {
        return this.quantidadegerenciados;
    }

    public void setQuantidadegerenciados(Integer quantidadegerenciados) {
        this.quantidadegerenciados = quantidadegerenciados;
    }

    public Double getBonificacao(){
        return this.salario * 0.25;
    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadegerenciados='" + getQuantidadegerenciados() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }

}
