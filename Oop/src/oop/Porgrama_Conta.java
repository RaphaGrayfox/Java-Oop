
package oop;

import javax.swing.JOptionPane;

public class Porgrama_Conta {
    
    public static void main(String[]args){
        
        int vAcao;
        double vQuantidade;
        double saldo;
        Class_Conta minhaConta;
        minhaConta = new Class_Conta();
        minhaConta.cliente = JOptionPane.showInputDialog("Digite o seu Nome :");
       
       minhaConta.saldo = 5000.00;
       
       vAcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer ? \n\n 1- Sacar \n 2- Depositar \n 3- Estrato \n\n Seu saldo é de "+  minhaConta.saldo));
       
       switch(vAcao){
           
           case 1:
              vQuantidade = Double.parseDouble(JOptionPane.showInputDialog("Qunto você deseja sacar ? "));     
              minhaConta.saca(vQuantidade);
              JOptionPane.showMessageDialog(null, "Você saccou : " + vQuantidade + " agora seu saldo é " + minhaConta.saldo);
           break;
               
           case 2:
              vQuantidade = Double.parseDouble(JOptionPane.showInputDialog("Qunto você deseja sacar ? "));     
              minhaConta.deposita(vQuantidade);
              JOptionPane.showMessageDialog(null,"Você depositou : " + vQuantidade + " agora seu saldo é " + minhaConta.saldo);
           break;
               
           case 3:
               JOptionPane.showMessageDialog(null,"Meu saldo total é : " + minhaConta.saldo);
           break;
           
       }
        
    }
}
