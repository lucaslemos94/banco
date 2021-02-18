public class ContaBonificada extends Conta {

    //atributos
    private double bonus;

    //construtor
    public ContaBonificada(String numero, Cliente cliente){
        super(numero,cliente);
    }

    //incrementando o bonus a cada credito na conta bonificada
    public void creditar(double valor){

        bonus = bonus + (valor * 0.01);
        
        super.creditar(valor);
    }

    //lanca o bonus acumulado no saldo da conta bonificada
    public void renderBonus(){
        super.creditar(bonus);
        bonus = 0;
    }

    public double getBonus(){
        return bonus;
    }
}
