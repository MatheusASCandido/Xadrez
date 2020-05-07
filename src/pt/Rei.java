package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe da peca rei
public class Rei extends Pecas{
	void define(char tipo) {//tipo = 'K' ou 'k'
		super.define(tipo);
	}
	
	void mostrar(){//mostra a peca no tabuleiro
        System.out.print(tipo+" ");
    }
}
