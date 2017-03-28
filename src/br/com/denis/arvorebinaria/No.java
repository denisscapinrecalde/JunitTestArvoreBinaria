package br.com.denis.arvorebinaria;

public class No {
	
	public No(int valor){
		this.valor = valor;
	}
	public No(){
	}

	private int valor;
	private static No raiz;
	private No esquerdo, direito;
	
	public void incluirNoEmArvore(int valor){
		
		incluirNoEmArvore(raiz, valor);
		
	}
	
	public static void incluirNoEmArvore(No no, int valor){
		
		if(no == null){
			raiz = new No(valor);
		}else{
			if (valor < no.valor) {
                if (no.esquerdo != null) {
                	incluirNoEmArvore(no.esquerdo, valor);
                } else {
                    no.esquerdo = new No(valor);
                }
            } else {
                if (no.direito != null) {
                	incluirNoEmArvore(no.direito, valor);
                } else {
                    no.direito = new No(valor);
                }
            }
		}
		
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getRaiz() {
		return raiz;
	}
	public void setRaiz(No raiz) {
		No.raiz = raiz;
	}
	public No getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}
	public No getDireito() {
		return direito;
	}
	public void setDireito(No direito) {
		this.direito = direito;
	}	
}
