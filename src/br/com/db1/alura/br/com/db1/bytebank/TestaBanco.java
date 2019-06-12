package br.com.db1.alura.br.com.db1.bytebank;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente paulo = new Cliente();

        paulo.nome = "paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.depositar(100);

        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);
    }
}
