package br.com.db1.alura;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.depositar(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar =  contaDoPaulo.sacar(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);

       if(contaDaMarcela.transfere(300,contaDoPaulo)){
            System.out.println("Transferencia feita com sucesso");
        }else{
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);


    }


}
