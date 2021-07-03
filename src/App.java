import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int opcao, dias_investidos;
        String nome_anuncio, cliente, data;
        double valor_investido_dia;

        Date data_inicio = new Date();
        Date data_termino = new Date();

        SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yyyy");
 
        ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
        
        do{
            System.out.println("O que deseja?\n 1- Cadastrar anúncio\n 2- Emitir relatórios\n 3- Sair");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("Nome do anúncio: ");
                    nome_anuncio = ler.next();
                    System.out.printf("Nome do cliente: ");
                    cliente = ler.next();
                    System.out.printf("Data de início (dd/mm/yyy): ");
                    data = ler.next();
                    data_inicio = mascara.parse(data);
                    System.out.printf("Data de término (dd/mm/yyyy): ");
                    data = ler.next();
                    data_termino = mascara.parse(data);
                    System.out.printf("Investimento: ");
                    valor_investido_dia = ler.nextDouble();
    
                    dias_investidos = 1; //infelizmente não consegui manipular as datas para calcular o data_termino-data_inicio
    
                    Calculadora calculadora;
                    calculadora = new Calculadora(valor_investido_dia, dias_investidos);
    
                    Anuncio anuncio;
                    anuncio = new Anuncio(nome_anuncio, cliente, data_inicio, data_termino, valor_investido_dia, calculadora.getInvestimento_total(),
                                        calculadora.getVisualizacoes(), calculadora.getCliques(), calculadora.getCompartilhamentos());
                    
                    anuncios.add(anuncio);
    
                    break;
                case 2:
                    for (Anuncio element : anuncios) {
                        System.out.println("Anúncio: " + element.getNome_anuncio());
                        System.out.println("Valor total investido: " + element.getInvestimento_total());
                        System.out.println("Máxima visualizações: " + element.getVisualizacoes());
                        System.out.println("Máxima cliques: " + element.getCliques());
                        System.out.println("Máxima compartilhamentos: " + element.getCompartilhamentos());
                    }
                    break;      
            }
        }while(opcao!=3);

        ler.close();
    }
}
