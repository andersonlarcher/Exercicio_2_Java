
package contabanco;

public class ContaPoupança extends Contabanco
{
    int diadeRendimento;

    public int getDiadeRendimento() {
        return diadeRendimento;
    }

    public void setDiadeRendimento(int diadeRendimento) {
        this.diadeRendimento = diadeRendimento;
    }
    
    float calcularNovoSaldo( float taxa)
    {
        saldo = (taxa/100) * getSaldo();
        return saldo;
    }
}
