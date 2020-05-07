package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//calsse responsavel pelos movimentos das pecas
public class Movimento extends Tabuleiro{
//pos inicial e final
	//f4:d4
	String s;
	int i,j,m,n;
	char f;
	boolean movimento = true;
	void str(String s) {
		this.s=s;
	}
	void comando(String s){
		if(s.length()==5) {
			char b = s.charAt(0);//transforma a letra de inicio em um caracter
			char c = s.charAt(1);//transforma o numero de inicio em um caracter
			char d = s.charAt(3);//transforma a letra de destino em um caracter
			char e = s.charAt(4);//transforma o numero de destino em um caracter
			/*if(s.length()==7) {
        	this.f = s.charAt(6);
        	//System.out.println(f);
        	}*/
			this.j = b - 97;
			this.i = 8-Character.getNumericValue(c);
			this.m = 8-Character.getNumericValue(e);
			this.n = d - 97;
			//System.out.println(i);
			//System.out.println(j);
			}
		else if(s.length()==1) {
			this.f = s.charAt(0);
			//System.out.println(f);
		}
	}
	void mover(int i,int j,int m,int n) {///!!!!
		int w;
		//System.out.println(tab[i][j].tipo);
		if(tab[i][j].tipo=='p') {
			//System.out.println("entro1");
			if(m-i==-2) {
				//System.out.println("entro2");
				if(i==6) {
					if(tab[i-1][j].tipo=='-' && tab[i-2][j].tipo=='-'&& j==n) {
					//System.out.println("entro3");
					//movimento valido
					tab[i][j] = new Pecas();
					tab[i][j].define('-');
					tab[m][n] = new Peao();
					tab[m][n].define('p');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(m-i==-1) {
				if(n==j) {
					if(tab[m][n].tipo=='-') {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Peao();
						tab[m][n].define('p');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else if(n-j==-1 || n-j==1) {
					if(tab[m][n].tipo=='P' ||tab[m][n].tipo=='T'||tab[m][n].tipo=='H'||tab[m][n].tipo=='B'|| tab[m][n].tipo=='Q'||tab[m][n].tipo=='K') {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Peao();
						tab[m][n].define('p');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='P') {
			//System.out.println("entro1");
			if(m-i==2) {
				//System.out.println("entro2");
				if(i==1) {
					if(tab[i+1][j].tipo=='-' && tab[i+2][j].tipo=='-'&& j==n) {
					//System.out.println("entro3");
					//movimento valido
					tab[i][j] = new Pecas();
					tab[i][j].define('-');
					tab[m][n] = new Peao();
					tab[m][n].define('P');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(m-i==1) {
				if(n==j) {
					if(tab[m][n].tipo=='-') {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Peao();
						tab[m][n].define('P');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else if(n-j==-1 || n-j==1) {
					if(tab[m][n].tipo=='p' ||tab[m][n].tipo=='t'||tab[m][n].tipo=='h'||tab[m][n].tipo=='b'|| tab[m][n].tipo=='q'||tab[m][n].tipo=='k') {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Peao();
						tab[m][n].define('P');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='t') {
			if(i==m && j!=n) {
				if(j<n) {
					for( w=j+1;w<n;w++) {
						if(tab[i][w].tipo!= '-') {
							w=n+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=n+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('t');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=n+1;w<j;w++) {
						if(tab[i][w].tipo!= '-') {
							w=j+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=j+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('t');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else if(i!=m && j==n) {
				if(i<m) {
					for( w=i+1;w<m;w++) {
						if(tab[w][j].tipo!= '-') {
							w=m+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=m+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('t');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=m+1;w<i;w++) {
						if(tab[w][j].tipo!= '-') {
							w=i+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=i+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('t');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='T') {
			if(i==m && j!=n) {
				if(j<n) {
					for( w=j+1;w<n;w++) {
						if(tab[i][w].tipo!= '-') {
							w=n+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=n+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('T');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=n+1;w<j;w++) {
						if(tab[i][w].tipo!= '-') {
							w=j+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=j+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('T');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else if(i!=m && j==n) {
				if(i<m) {
					for( w=i+1;w<m;w++) {
						if(tab[w][j].tipo!= '-') {
							w=m+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=m+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('T');
					}
					else {
						System.out.println("Movimento invalido");
					}
					
				}
				else {
					for( w=m+1;w<i;w++) {
						if(tab[w][j].tipo!= '-') {
							w=i+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=i+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Torre();
						tab[m][n].define('T');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='b') {
			if(i>m && j>n) {
				if(i-m==j-n) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('b');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i>m && j<n) {
				if(i-m==n-j) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('b');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j>n) {
				if(m-i==j-n) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('b');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j<n) {
				if(m-i==n-j) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('b');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='B') {
			if(i>m && j>n) {
				if(i-m==j-n) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('B');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i>m && j<n) {
				if(i-m==n-j) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('B');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j>n) {
				if(m-i==j-n) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('B');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j<n) {
				if(m-i==n-j) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Bispo();
						tab[m][n].define('B');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='q') {
			if(i>m && j>n) {
				if(i-m==j-n) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i>m && j<n) {
				if(i-m==n-j) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j>n) {
				if(m-i==j-n) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j<n) {
				if(m-i==n-j) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i==m && j!=n) {
				if(j<n) {
					for( w=j+1;w<n;w++) {
						if(tab[i][w].tipo!= '-') {
							w=n+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=n+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=n+1;w<j;w++) {
						if(tab[i][w].tipo!= '-') {
							w=j+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=j+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else if(i!=m && j==n) {
				if(i<m) {
					for( w=i+1;w<m;w++) {
						if(tab[w][j].tipo!= '-') {
							w=m+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=m+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=m+1;w<i;w++) {
						if(tab[w][j].tipo!= '-') {
							w=i+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=i+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
			
		
		}
		else if(tab[i][j].tipo=='Q') {
			if(i>m && j>n) {
				if(i-m==j-n) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i>m && j<n) {
				if(i-m==n-j) {
					for(w=1;w<i-m;w++) {
						if(tab[i-w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=i-m+1;
						}	
					}
					if(w!=i-m+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j>n) {
				if(m-i==j-n) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j-w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i<m && j<n) {
				if(m-i==n-j) {
					for(w=1;w<m-i;w++) {
						if(tab[i+w][j+w].tipo!='-') {
							System.out.println("Movimento invalido");
							w=m-i+1;
						}	
					}
					if(w!=m-i+2 &&(tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i==m && j!=n) {
				if(j<n) {
					for( w=j+1;w<n;w++) {
						if(tab[i][w].tipo!= '-') {
							w=n+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=n+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=n+1;w<j;w++) {
						if(tab[i][w].tipo!= '-') {
							w=j+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=j+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else if(i!=m && j==n) {
				if(i<m) {
					for( w=i+1;w<m;w++) {
						if(tab[w][j].tipo!= '-') {
							w=m+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=m+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
				else {
					for( w=m+1;w<i;w++) {
						if(tab[w][j].tipo!= '-') {
							w=i+1;
							System.out.println("Movimento invalido");
						}
					}
					if(w!=i+2 && (tab[m][n].tipo=='-'||tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k')) {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Rainha();
						tab[m][n].define('Q');
					}
					else {
						System.out.println("Movimento invalido");
					}
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='h') {
			if(i-m==2 || i-m==-2) {
				if(j-n==1 || j-n==-1) {
					if(tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k') {
						System.out.println("Movimento invalido");
					}
					else {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Cavalo();
						tab[m][n].define('h');
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i-m==1 || i-m==-1) {
				if(j-n==2 || j-n==-2) {
					if(tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k') {
						System.out.println("Movimento invalido");
					}
					else {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Cavalo();
						tab[m][n].define('h');
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='H') {
			if(i-m==2 || i-m==-2) {
				if(j-n==1 || j-n==-1) {
					if(tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K') {
						System.out.println("Movimento invalido");
					}
					else {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Cavalo();
						tab[m][n].define('H');
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else if(i-m==1 || i-m==-1) {
				if(j-n==2 || j-n==-2) {
					if(tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K') {
						System.out.println("Movimento invalido");
					}
					else {
						tab[i][j] = new Pecas();
						tab[i][j].define('-');
						tab[m][n] = new Cavalo();
						tab[m][n].define('H');
					}
				}
				else {
					System.out.println("Movimento invalido");
				}
			}
			else {
				System.out.println("Movimento invalido");
			}
		}
		else if(tab[i][j].tipo=='k') {
			if(i-m>1 || i-m<-1) {
				System.out.println("Movimento invalido");
			}
			else if(j-n>1 || j-n<-1) {
				System.out.println("Movimento invalido");
			}
			else {
				if(tab[m][n].tipo=='p'||tab[m][n].tipo=='h'||tab[m][n].tipo=='t'||tab[m][n].tipo=='b'||tab[m][n].tipo=='q'||tab[m][n].tipo=='k') {
					System.out.println("Movimento invalido");
				}
				else {
					tab[i][j] = new Pecas();
					tab[i][j].define('-');
					tab[m][n] = new Rei();
					tab[m][n].define('k');
				}
			}
		}
		else if(tab[i][j].tipo=='K') {
			if(i-m>1 || i-m<-1) {
				System.out.println("Movimento invalido");
			}
			else if(j-n>1 || j-n<-1) {
				System.out.println("Movimento invalido");
			}
			else {
				if(tab[m][n].tipo=='P'||tab[m][n].tipo=='H'||tab[m][n].tipo=='T'||tab[m][n].tipo=='B'||tab[m][n].tipo=='Q'||tab[m][n].tipo=='K') {
					System.out.println("Movimento invalido");
				}
				else {
					tab[i][j] = new Pecas();
					tab[i][j].define('-');
					tab[m][n] = new Rei();
					tab[m][n].define('K');
				}
			}
		}
		
		mostrar_tab();
		
	}
	void transformar(char f) {
		for(int n=0; n<8;n++) {
			if(tab[0][n].tipo=='p') {
				if(f =='q' ) {
					tab[0][n] = new Rainha();
					tab[0][n].define('q');
				}
				else if(f == 'b') {
					tab[0][n] = new Bispo();
					tab[0][n].define('b');
				}
				else if(f == 'h') {
					tab[0][n] = new Cavalo();
					tab[0][n].define('h');
				}
				else if(f == 't') {
					tab[0][n] = new Torre();
					tab[0][n].define('t');
				}
			}
			else if(tab[7][n].tipo=='P') {
				if(f =='Q' ) {
					tab[7][n] = new Rainha();
					tab[7][n].define('Q');
				}
				else if(f == 'B') {
					tab[7][n] = new Bispo();
					tab[7][n].define('B');
				}
				else if(f == 'H') {
					tab[7][n] = new Cavalo();
					tab[7][n].define('H');
				}
				else if(f == 'T') {
					tab[7][n] = new Torre();
					tab[7][n].define('T');
				}
			}
		}
		mostrar_tab();
	}
	/*void transformar(int m,int n,char f) {
		if(tab[m][n].tipo=='P' && m==7) {
			if(f =='Q' ) {
				tab[m][n] = new Rainha();
				tab[m][n].define('Q');
			}
			else if(f == 'B') {
				tab[m][n] = new Bispo();
				tab[m][n].define('B');
			}
			else if(f == 'H') {
				tab[m][n] = new Cavalo();
				tab[m][n].define('H');
			}
			else if(f == 'T') {
				tab[m][n] = new Torre();
				tab[m][n].define('T');
			}
		}
		if(tab[m][n].tipo=='p' && m==0) {
			//System.out.println("entrou");
			if(f =='q' ) {
				tab[m][n] = new Rainha();
				tab[m][n].define('q');
			}
			else if(f == 'b') {
				tab[m][n] = new Bispo();
				tab[m][n].define('b');
			}
			else if(f == 'h') {
				tab[m][n] = new Cavalo();
				tab[m][n].define('h');
			}
			else if(f == 't') {
				tab[m][n] = new Torre();
				tab[m][n].define('t');
			}
		}
		mostrar_tab();
	}*/
}


