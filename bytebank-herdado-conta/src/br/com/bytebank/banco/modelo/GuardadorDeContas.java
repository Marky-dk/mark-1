package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	private Object[] referencias;
	private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }
    
    public void adiciona(Object ref) {
        referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}

}
