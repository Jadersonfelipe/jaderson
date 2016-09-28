
package banco;

public class Conta {
    
    protected float saldo;
    protected float taxa;
    

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }
   
      protected float Taxa(float perc){
        
        this.taxa=((perc/100)*saldo);
        
         return taxa;
      }
      
    public double depositar(double grana){
        this.saldo+=(grana-taxa);
        
        return saldo;
    }
    
    public double sacar(double grana){
        this.saldo-=grana;
        
        return saldo;
        
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
  
                
    }
   

