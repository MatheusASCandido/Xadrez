package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//aplicacao do xadrez
public class AppXadrez {

	public static void main(String[] args) {
		//iniciando a classe CSVReader e criando um vetor de comandos
		CSVReader csv= new CSVReader();
		csv.setDataSource("https://github.com/MatheusASCandido/Xadrez/tree/master/src/pt/teste.csv");//endereco do arq csv
		String commands [] = csv.requestCommands();
		//iniciando o tabuleiro
		ControleComando xadrez = new ControleComando();
		xadrez.criar_vetor(commands.length);//cria o vetor de objetos de comando
		xadrez.criar_tab(8);//cria o tabuleiro
		xadrez.fazer_tab();//preenche o tabuleiro
		xadrez.mostrar_tab();//mostra o tabuleiro inicial
		for(int i=0; i<commands.length;i++) {
			xadrez.preecher(commands[i]);//preenche o vetor de objetos de comando
		}
		xadrez.executar(xadrez);//executa os comandos
			
	}
	

}
