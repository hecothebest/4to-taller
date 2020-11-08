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
public class BusinessAccount {
//Contantes para definer los limites de las transacciones
public static final double MIN_BALANCE = 2000.00;
public static final double OVERDRAW_LIMIT = -1000.00;
public static final double TRANS_FEE_NORMAL = 2.00;
public static final double TRANS_FEE_OVERDRAW = 5.00;
public static final String ERR_OVERDRAW_LIMIT_EXCEED = "Error: Transactioncannot be processed. "
+ "Overdraw limit exceeded.";
//Atributos
private State objState;
private String accountNumber;
private double balance;
public BusinessAccount(String accountNum) {
accountNumber = accountNum;
objState = State.InitialState(this);
}
public void setState(State newState) {
objState = newState; 
}
public State getState() {
return objState;
}
public String getAccountNumber() {
return accountNumber;
}
public boolean deposit(double amount) {
return getState().deposit(amount);
}
/**
 * Retiro
 * @param amount
 * @return
 */
public boolean withdraw(double amount) {
return getState().withdraw(amount);
}
public double getBalance() {
return balance;
}
public void setBalance(double newBalance) {
balance = newBalance;
}
}
