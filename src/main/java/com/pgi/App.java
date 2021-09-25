package com.pgi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);
    }

}
