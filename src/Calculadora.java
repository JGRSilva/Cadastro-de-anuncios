public class Calculadora {
    private double valor_investido_dia, investimento_total;
    private int dias_investidos, visualizacoes, cliques, compartilhamentos;

    public Calculadora(double valor_investido_dia, int dias_investidos) {
        this.valor_investido_dia = valor_investido_dia;
        this.dias_investidos = dias_investidos;
    }

    public double getInvestimento_total() {
        investimento_total = valor_investido_dia * dias_investidos;
        return investimento_total;
    }

    public int getVisualizacoes() {
        visualizacoes = (int)(((30*valor_investido_dia * 0.018) + 24*valor_investido_dia) * 40 * dias_investidos);
        return visualizacoes;
    }

    public int getCliques() {
        cliques = (int)((30*valor_investido_dia * 0.12) * dias_investidos);
        return cliques;
    }

    public int getCompartilhamentos() {
        compartilhamentos = (int)(((30*valor_investido_dia * 0.018) + 24*valor_investido_dia) * dias_investidos);
        return compartilhamentos;
    }
}
