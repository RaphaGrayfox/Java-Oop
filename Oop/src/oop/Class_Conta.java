
package oop;
public class Class_Conta {
    
    int numero;
    String cliente;
    double saldo;
    double limite;
    
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    
    void deposita(double quantidade){
        this.saldo += quantidade;        
    }
  
}
