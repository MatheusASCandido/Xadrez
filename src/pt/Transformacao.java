package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe responsavel pela transformacao das pecas
public class Transformacao extends Movimento {
	String s;
	//int i,j,m,n;
	char f;
	boolean movimento = false;
	void str(String s) {
		super.str(s);;
	}
	void comando(String s){
		super.comando(s);
	}
	
	/*void mover(int i,int j,int m,int n) {
		super.mover(i,j,m,n);
	}*/
	void transformar(char f) {
		super.transformar(f);
	}
}
