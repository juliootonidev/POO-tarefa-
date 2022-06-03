package atividade.dois;

public class Ingresso {

    private int data;
    private int hora;
    private int valor;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Ingresso(int data, int hora, int valor) {
        this.data = data;
        this.hora = hora;
        this.valor = valor;
    }
}
