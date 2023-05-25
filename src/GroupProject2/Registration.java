package GroupProject2;

public class Registration {
   private String email;
   private String userName;
    private String password;

    public void setEmail (String email){
        this.email = email;
        if (email.contains("yahoo")){
            System.out.println(email);
        } else{
            System.out.println("Email is not valid");
        }


    }
    public void setUserName (String userName){
        this.userName = userName;
        if (!userName.isEmpty() && userName.length()>6){
            System.out.println(userName);
        } else {
            System.out.println("Username is not valid");
        }
    }
    public void setPassword(String password){
        this.password = password;

        if (password.contains(userName.toLowerCase())  || password.isEmpty()){
            System.out.println("Password can not contain username or can not be empty");
        } else {
            System.out.println(password);
        }
    }
}
class RegistrationTester {
    public static void main(String[] args) {
        Registration obj = new Registration();
        obj.setEmail("alinashania@yahoo.com");
        obj.setUserName("alinashania");
        obj.setPassword("alinashania123");
    }
}
