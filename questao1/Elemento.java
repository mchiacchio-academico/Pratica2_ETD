package questao1;

public class Elemento {
	
			private int senha;
			private Elemento proximo;
			
			public Elemento(int novaSenha){
		        this.senha = novaSenha;
			}
			public int getSenha() {
		        return senha;
		    }

		    public void setSenha(int senha) {
		        this.senha = senha;
		    }

		    public Elemento getProximo() {
		        return proximo;
		    }

		    public void setProximo(Elemento proximo) {
		        this.proximo = proximo;
		    }
}


