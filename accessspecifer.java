class Account{
    public String name;
    protected String email;
    private String password;

    // getter & setter

    public String getPassword(){
        return password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class accessspecifer {

    public static void main(String[] args) {
        Account account = new Account();
        account.name = "abhiraj";
        System.out.println("Account name set: " + account.name);
        account.email = "abhiraj@example.com";
        System.out.println("Email set: " + account.email);
        account.setPassword("mySecretPassword");
        System.out.println("Password set: " + account.getPassword());
    }
}