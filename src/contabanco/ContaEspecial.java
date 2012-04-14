package contabanco;

public class ContaEspecial extends Contabanco
{
   int limitedeCheque;

    public int getLimitedeCheque() {
        return limitedeCheque;
    }

    public void setLimitedeCheque(int limitedeCheque) {
        this.limitedeCheque = limitedeCheque;
    }

    @Override
    void sacar(float valor) 
    {
        super.sacar(valor);
        if (valor < saldo)
        System.out.println("Permitido sacar");
    }
    

}
