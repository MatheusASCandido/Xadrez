package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe que monta o tabuleiro e mostra depois de cada movimento
public class Tabuleiro {
	Pecas tab[][];
	private int cont=0;
	
	void criar_tab(int a) {//cria os objetos na matriz
        this.tab = new Pecas [a][a];
	}
	
	void fazer_tab() {
		for(int j=0; j<8;j++) {//define os peoes no tabuleiro
			tab[1][j] = new Peao();
			tab[1][j].define('P');	
			tab[6][j] = new Peao();
			tab[6][j].define('p');
		}
		for(int j=0; j<8; j++) {//demais pecas
			if(j==0 || j==7) {//torres
				tab[0][j] = new Torre();
				tab[0][j].define('T');
				tab[7][j] = new Torre();
				tab[7][j].define('t');
			}
			if(j==1 || j==6) {//cavalos
				tab[0][j] = new Cavalo();
				tab[0][j].define('H');
				tab[7][j] = new Cavalo();
				tab[7][j].define('h');
			}
			if(j==2 || j==5) {//bispos
				tab[0][j] = new Bispo();
				tab[0][j].define('B');
				tab[7][j] = new Bispo();
				tab[7][j].define('b');
			}
			if(j==3) {//rainhas
				tab[0][j] = new Rainha();
				tab[0][j].define('Q');
				tab[7][j] = new Rainha();
				tab[7][j].define('q');
			}
			if(j==4) {//reis
				tab[0][j] = new Rei();
				tab[0][j].define('K');
				tab[7][j] = new Rei();
				tab[7][j].define('k');
			}
		}
		for(int i=2; i<6; i++) {
			for(int j=0; j<8; j++) {
				tab[i][j] = new Pecas();
				tab[i][j].define('-');
			}
		}
	
	}
	void mostrar_tab(){//mostra o tabuleiro 
		if(cont==0) {
			System.out.println("Tabuleiro inicial:");
		}
        for (int i=0; i<8; i++){
            System.out.print((8-i)+" ");
            for (int j=0; j<8; j++){
                tab[i][j].mostrar();
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
        System.out.println();
        cont++;
    }
	
}
