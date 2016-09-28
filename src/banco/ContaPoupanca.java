
package banco;

public class ContaPoupanca extends Conta{
    
      public float Taxa(float perc){
        
       this.taxa=(((perc/100)*3)*saldo);
        
         return taxa;
        
        
    }
    public double depositar(double grana){
        this.saldo+=(grana-0.10-this.taxa);
        
        return saldo;
    }
}
