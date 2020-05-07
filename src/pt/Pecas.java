package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe generica para as pecas
public class Pecas {
	char tipo;//tipo da peca, peao, rei, torre, etc.
	//maiusculas sao pecas pretas e minusculas brancas
	/* 	Rei(king) = K ou k
	 	Rainha(queen) = Q ou q
	 	Bispo(bishop) = B ou b
	 	Cavalo(horse) = H ou h
	 	Torre(tower) = T ou t
	 	Peao(paw) = P ou p
	 	vazio = -
	 */
	 
	void define(char tipo){
		this.tipo = tipo;
	}
	
	void mostrar(){//mostra a peca no tabuleiro
        System.out.print(tipo+" ");
    }
}
