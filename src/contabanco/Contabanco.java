
package contabanco;
public class Contabanco {
    private String cliente;
    private int num_conta;
    private int num_agencia;
    protected float saldo;
    
    public Contabanco(String cliente, int num_conta, int num_agencia, float saldo)
    {
    this.cliente = cliente;
    this.num_conta = num_conta;
    this.num_agencia = num_agencia;
    this.saldo = saldo;
    }
    public Contabanco()
    {
       
    }
    void sacar(float valor)
    {
        if (valor > saldo)
        {
           System.out.println("erro"); 
        }   
        else if (valor <= saldo)
        {
            saldo -= valor;
            System.out.println("ok");
        }
    }
//----------------------------------------------------------------
    void depositar(float valor)
    {
        saldo = saldo + valor;
    }
//----------------------------------------------------------------
    
    void exibir()
    {
    String dadosBanco;
    dadosBanco = "Cliente: " + cliente + "Numero da conta: " +  num_conta;
    dadosBanco = "Numero da agencia: " + num_agencia + "Saldo" + saldo;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(int num_agencia) {
        this.num_agencia = num_agencia;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        
    }
}
