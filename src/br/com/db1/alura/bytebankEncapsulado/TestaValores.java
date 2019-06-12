package br.com.db1.alura.bytebankEncapsulado;

public class TestaValores {

    public static void main(String[] args) {


        Conta conta= new Conta(1337,24226);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        Conta conta2 = new Conta(1337,16549);
        System.out.println(conta2.getAgencia());
        System.out.println(conta2.getNumero());

        Conta conta3 = new Conta(1337,14660);
        System.out.println(conta3.getAgencia());
        System.out.println(conta3.getNumero());

        System.out.println(Conta.getTotal());
    }
}
