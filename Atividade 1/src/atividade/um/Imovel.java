package atividade.um;

public abstract class Imovel {

    private int endress;
    private int preco;

    public int getEndress() {
        return endress;
    }

    public void setEndress(int endress) {
        this.endress = endress;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Imovel() {
        this.endress = endress;
        this.preco = preco;
    }
}
