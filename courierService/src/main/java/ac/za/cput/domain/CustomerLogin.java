package ac.za.cput.domain;

public class CustomerLogin {

    private String username;
    private String password;


    public String getUsername(){

        return username;
    }

    public String getPassword(){

        return password;
    }

    public CustomerLogin(CustomerLogin builder){

        this.username = builder.username;
        this.password = builder.password;
    }

    public static class Builder{

        private String username;
        private String password;

        public Builder Username(String username){

            this.username = username;
            return this;
        }

        public Builder Password(String password){

            this.password = password;
            return this;
        }




    }

    public CustomerLogin build(){return new CustomerLogin(this);}


    public String toString() {
        return "Login Details{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
