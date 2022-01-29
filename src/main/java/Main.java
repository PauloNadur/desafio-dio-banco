public class Main {

    public static void main(String[] args) {

        final String separator = "======================";

        Banco banco = new Banco();
        banco.setNome("Banco Local");
        banco.setNumero(15);

        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();

        cli1.setNome("Ruth");
        cli2.setNome("Douglas");

        Conta cc = new ContaCorrente(cli1);
        Conta cp = new ContaPoupanca(cli2);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(1500);
        cc.transferir(200, cp);

        cp.depositar(1200);

        System.out.println(separator);
        cc.imprimirExtrato();
        System.out.println(separator);
        cp.imprimirExtrato();

        System.out.println(separator);
        banco.listarContas();
        System.out.println(separator);
    }
}
