
package banco;


public class Banco {

   
    public static void main(String[] args) {
      //Tem algo errado nessa merda!  
      Conta c =new Conta();
      Conta cc = new ContaCorrente();
      Conta cp =  new ContaPoupanca();
      
      c.depositar(100);
      c.Taxa(10);
      
      cc.depositar(100);
      cc.Taxa(10);
      
      cp.depositar(100);
      cp.Taxa(10);
      
      
        System.out.println(c.getSaldo());
        
        System.out.println(cc.getSaldo());
        
        System.out.println(cp.getSaldo());
        
        System.out.println(c.getTaxa());
    }
    
}
