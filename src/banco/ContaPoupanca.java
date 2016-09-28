
package banco;

public class ContaPoupanca extends Conta{
    
      public void Taxa(float perc){
        
       this.taxa=perc*3;
     }
    public void depositar(double grana){
        this.saldo+=grana-(0.10)-((this.taxa/100)*grana);
       
    }
}
