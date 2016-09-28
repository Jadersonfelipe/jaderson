
package banco;

public class ContaCorrente extends Conta{
    
  
    public void Taxa(float perc){
        
       this.taxa=perc*2;
       
    }
    
      
    public double depositar(double grana){
        this.saldo+=grana-(0.10)-((taxa/100)*grana);
        
        return saldo;
    }
    
    
}
