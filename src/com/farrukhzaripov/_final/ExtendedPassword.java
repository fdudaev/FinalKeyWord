package com.farrukhzaripov._final;

public class ExtendedPassword extends Password {

    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }
// unable to override this method as method is final in Password class
/*    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }*/
}