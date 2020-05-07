package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe da peca rainha
public class Rainha extends Pecas {
	void define(char tipo) {//tipo = 'Q' ou 'q'
		super.define(tipo);
	}
	
	void mostrar(){//mostra a peca no tabuleiro
        System.out.print(tipo+" ");
    }
}
