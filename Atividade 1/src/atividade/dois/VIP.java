package atividade.dois;

public class VIP extends Ingresso{

    private String local;
    private int valor;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public void setValor(int valor) {
        this.valor = valor;
    }

    public VIP(int data, int hora, int valor, String local, int valor1) {
        super(data, hora, valor);
        this.local = local;
        this.valor = valor1;
    }
}
