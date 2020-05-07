package pt;
//Matheus A. S. Candido - ra241640
//Pedro H. Bueno - ra223402
//classe parte da etapa xadrez do trabalho
//classe que controla os movimentos e as transformacoes
public class ControleComando extends Movimento {
	Movimento v[];
	int a;
	int tam=0;
	ControleComando(){
		//this.a = a;
	}
	void criar_vetor(int a) {
		this.a=a;
		v = new Movimento[a];
	}
	void preecher(String s) {
		if(s.length()==5) {
			v[tam]= new Movimento();
			v[tam].str(s);
			//v[tam].comando(s);
		}
		else if(s.length()==1) {
			v[tam]= new Transformacao();
			v[tam].str(s);
			v[tam].movimento=false;
		}
		tam++;
	}
	void executar(ControleComando x) {
		for(int i=0; i<a; i++) {
			if(v[i].s.length()==5) {
				v[i].comando(v[i].s);
				String a = v[i].s;
				String b = a.substring(0,2);
				String c = a.substring(3);
				System.out.println("Source: "+b);
		        System.out.println("Target: "+c);
				x.mover(v[i].i,v[i].j,v[i].m,v[i].n);
				
				
			}
			else if (v[i].s.length()==1) {
				v[i].comando(v[i].s);
				x.transformar(v[i].f);
			}
			
		}
	}
}
