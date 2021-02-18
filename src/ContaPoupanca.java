public class ContaPoupanca extends Conta {

    //atributos
    private double juros;
    private double saldoAtual;

    //construtor
    public ContaPoupanca(String numero, Cliente cliente){
        super(numero,cliente);
    }

    //metodo que rende juros na conta poupança
    public void renderJuros (double taxa){
        saldoAtual = getSaldo();
        juros = saldoAtual * taxa;
        creditar(juros);
    }    
}
