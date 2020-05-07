package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe da peca bispo
public class Bispo extends Pecas {
	void define(char tipo) {//tipo = 'B' ou 'b'
		super.define(tipo);
	}
	
	void mostrar(){//mostra a peca no tabuleiro
        System.out.print(tipo+" ");
    }
}
