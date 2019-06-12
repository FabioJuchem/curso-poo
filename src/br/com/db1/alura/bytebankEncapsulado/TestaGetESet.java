package br.com.db1.alura.bytebankEncapsulado;

public class TestaGetESet {

    public static void main(String[] args) {


        Conta conta = new Conta(20,1337);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("paulo silveira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());

    }
}
