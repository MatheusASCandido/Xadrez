package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//aplicacao do xadrez
public class AppXadrez {

	public static void main(String[] args) {
		//iniciando a classe CSVReader e criando um vetor de comandos
		CSVReader csv= new CSVReader();
		csv.setDataSource("C:\\Users\\Matheus Cândido\\Documents\\UNICAMP\\MC322\\Xadrez\\src\\pt\\teste.csv");//endereco do arq csv
		String commands [] = csv.requestCommands();
		
		//criando o tabuleiro
		//String v[]= {"a2:a4","c7:c5","a4:a5","a5:a6","a6:b7","b7:a8,q"};
		
		ControleComando xadrez = new ControleComando();
		xadrez.criar_vetor(commands.length);
		xadrez.criar_tab(8);
		xadrez.fazer_tab();
		xadrez.mostrar_tab();
		for(int i=0; i<commands.length;i++) {
			xadrez.preecher(commands[i]);
		}
		xadrez.executar(xadrez);
		
		//executando os comandos
		/*for(int i=0;i<commands.length;i++) {
			//xadrez.comando(commands[i]);
			if(commands[i].length<7)
			//cria um objeto movimento
			 //add no vetor de objetos
		}*/
		/*xadrez.comando("a2:a4");
		xadrez.mover();
		xadrez.comando("c2:c3");
		xadrez.mover();
		xadrez.comando("b7:b5");
		xadrez.mover();
		xadrez.comando("f7:f6");
		xadrez.mover();
		xadrez.comando("c7:c6");
		xadrez.mover();
		xadrez.comando("a4:b5");
		xadrez.mover();
		xadrez.comando("c6:b5");
		xadrez.mover();
		xadrez.comando("b2:b4");
		xadrez.mover();
		xadrez.comando("a1:a2");
		xadrez.mover();
		xadrez.comando("a2:a7");
		xadrez.mover();
		xadrez.comando("a8:a7");
		xadrez.mover();
		xadrez.comando("a7:c7");
		xadrez.mover();
		xadrez.comando("c7:c8");
		xadrez.mover();
		xadrez.comando("c3:c4");
		xadrez.mover();
		xadrez.comando("c1:b2");
		xadrez.mover();
		xadrez.comando("b2:f6");
		xadrez.mover();
		xadrez.comando("f6:h4");
		xadrez.mover();
		xadrez.comando("h4:f2");
		xadrez.mover();
		xadrez.comando("c8:a6");
		xadrez.mover();
		xadrez.comando("a6:d3");
		xadrez.mover();
		xadrez.comando("d1:a4");
		xadrez.mover();
		xadrez.comando("a4:a6");
		xadrez.mover();
		xadrez.comando("a6:g6");
		xadrez.mover();
		xadrez.comando("g6:f4");
		xadrez.mover();
		xadrez.comando("g1:f3");
		xadrez.mover();
		xadrez.comando("f3:d4");
		xadrez.mover();
		xadrez.comando("d4:e2");
		xadrez.mover();
		xadrez.comando("e8:f7");
		xadrez.mover();
		xadrez.comando("e1:d1");
		xadrez.mover();
		xadrez.comando("d1:d1");
		xadrez.mover();
		String v= "teste";
		System.out.print(v.length());*/
	}
	

}
