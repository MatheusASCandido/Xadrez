package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe da peca peao
public class Peao extends Pecas {
	void define(char tipo) {//tipo = 'P' ou 'p'
		super.define(tipo);
	}
	
	void mostrar(){//mostra a peca no tabuleiro
        System.out.print(tipo+" ");
    }
}
