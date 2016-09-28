
package banco;

public class Conta {
    
    protected float saldo;
    protected float taxa;
    

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

      protected void Taxa(float perc){
        
        this.taxa=(perc);
        }
      
    public void depositar(float grana){
        this.saldo =grana-((this.taxa/100)*grana);
      
    }
    
    public void sacar(double grana){
        this.saldo-=grana;
   }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
  
        public float getSaldo() {
        return saldo;
    }         
    }
   

