
package banco;

public class ContaCorrente extends Conta{
    
  
    public float Taxa(float perc){
        
       this.taxa=(((perc/100)*2)*saldo);
        
         return taxa;
    }
    
      
    public double depositar(double grana){
        this.saldo+=(grana-0.10-this.taxa);
        
        return saldo;
    }
    
    
}
