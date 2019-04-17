package ac.za.cput.domain;

public class RegisterCustomer {

    private String createUsername;
    private String createPassword;

    public String getcreateUsername(){

        return createUsername;
    }

    public String createPassword(){

        return createPassword;
    }

    public RegisterCustomer(RegisterCustomer builder){

        this.createUsername = builder.createUsername;
        this.createPassword = builder.createPassword;
    }

    public static class Builder{

        private String createUsername;
        private String createPassword;

        public Builder createUsername(String createUsername){

            this.createUsername = createUsername;
            return this;
        }

        public Builder createPassword(String createPassword){

            this.createPassword = createPassword;
            return this;
        }

    }

    public RegisterCustomer build(){return new RegisterCustomer(this);}

    public String toString() {
        return "New Customer:{" +
                "createUsername='" + createUsername + '\'' +
                ", createPassword='" + createPassword + '\'' +
                '}';

    }
}
