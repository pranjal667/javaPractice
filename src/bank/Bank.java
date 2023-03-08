package bank;

class Account{
    public String name;
    protected String email;
    private String password;//use getters and setters to use it outside 

    //getters and setters
    public String getPassword(){
        return this.password;
    
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "KU";
        account1.email="pranjalghimire667@gmail.com";
        account1.setPassword("123");
        System.out.println(account1.getPassword());



    }   
}

