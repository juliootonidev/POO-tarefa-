package Teste;

public class TesteMain {

    public static void main(String[] args){
        Transporte t = new Transporte();
        Veiculo v = new Veiculo();
        Carro c = new Carro();
        System.out.println("Passando o Transporte:");
        moverTransporte(t);
        System.out.println("Passsando o veiculo:");
        moverTransporte(v);
        System.out.println("Passando o carro:");
        moverTransporte(c);
    }

    static void moverTransporte (Transporte trans){
        System.out.println(trans.mover());
    }
}
