import java.util.Date;

public class Anuncio{
    private String nome_anuncio, cliente;
    private Date data_inicio, data_termino;
    private double valor_investido_dia, investimento_total;
    private int visualizacoes, cliques, compartilhamentos;

    
    public Anuncio(String nome_anuncio, String cliente, Date data_inicio, Date data_termino, double valor_investido_dia,
                    double investimento_total, int visualizacoes, int cliques, int compartilhamentos) {
        this.nome_anuncio = nome_anuncio;
        this.cliente = cliente;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.valor_investido_dia = valor_investido_dia;
        this.investimento_total = investimento_total;
        this.visualizacoes = visualizacoes;
        this.cliques = cliques;
        this.compartilhamentos = compartilhamentos;
    }


    public String getNome_anuncio() {
        return nome_anuncio;
    }


    public void setNome_anuncio(String nome_anuncio) {
        this.nome_anuncio = nome_anuncio;
    }


    public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public Date getData_inicio() {
        return data_inicio;
    }


    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }


    public Date getData_termino() {
        return data_termino;
    }


    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }


    public double getInvestimento_dia() {
        return valor_investido_dia;
    }


    public void setInvestimento_dia(double valor_investido_dia) {
        this.valor_investido_dia = valor_investido_dia;
    }


    public double getInvestimento_total() {
        return investimento_total;
    }


    public void setInvestimento_total(double investimento_total) {
        this.investimento_total = investimento_total;
    }


    public int getVisualizacoes() {
        return visualizacoes;
    }


    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }


    public int getCliques() {
        return cliques;
    }


    public void setCliques(int cliques) {
        this.cliques = cliques;
    }


    public int getCompartilhamentos() {
        return compartilhamentos;
    }


    public void setCompartilhamentos(int compartilhamentos) {
        this.compartilhamentos = compartilhamentos;
    }

    

}
