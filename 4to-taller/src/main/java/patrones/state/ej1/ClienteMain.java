/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.state.ej1;

/**
 *
 * @author SONY-VAIO
 */
public class ClienteMain {
public static void main(String[] args) {
BusinessAccount ba = new BusinessAccount("454001");
ba.deposit(10000);
System.out.println("Balance:" + ba.getBalance());
ba.withdraw(9000);
System.out.println("Balance:" + ba.getBalance());
ba.withdraw(1500);
System.out.println("Balance:" + ba.getBalance());
ba.withdraw(50000);
System.out.println("Balance:" + ba.getBalance());
 }
}


