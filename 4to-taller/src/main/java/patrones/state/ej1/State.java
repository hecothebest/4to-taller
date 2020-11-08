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
public class State {
private BusinessAccount context;
public State(BusinessAccount account) {
setContext(account);
}
public BusinessAccount getContext() {
return context;
}
public void setContext(BusinessAccount newAccount) {
context = newAccount;
}
public State transitionState() {
return null;
}
public State(State source) {
setContext(source.getContext());
}
public static State InitialState(BusinessAccount account) {
return new NoTransactionFeeState(account);
}
//deposito
public boolean deposit(double amount) {
double balance = getContext().getBalance();
getContext().setBalance(balance + amount);
transitionState();
System.out.println("An amount " + amount + " is deposited ");
return true;
}
//Retiro
public boolean withdraw(double amount) {
double balance = getContext().getBalance();
getContext().setBalance(balance - amount);
transitionState();
System.out.println("An amount " + amount + " is withdrawn ");
return true;
    }
}
