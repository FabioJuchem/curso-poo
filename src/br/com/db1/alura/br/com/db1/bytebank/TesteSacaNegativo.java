package br.com.db1.alura.br.com.db1.bytebank;

public class TesteSacaNegativo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(200);
        System.out.println(conta.getSaldo());



    }
}
