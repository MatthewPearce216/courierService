package ac.za.cput.domain;

public class ForgotDetails {


    private String newUsername;
    private String newPassword;


    public String getNewUsername(){

        return newUsername;
    }

    public String getNewPassword(){

        return newPassword;
    }

    public ForgotDetails(ForgotDetails builder){

        this.newUsername = builder.newUsername;
        this.newPassword = builder.newPassword;
    }

    public static class Builder{

        private String newUsername;
        private String newPassword;

        public Builder newUsername(String newUsername){

            this.newUsername = newUsername;
            return this;
        }

        public Builder newPassword(String newPassword){

            this.newPassword = newPassword;
            return this;
        }

    }

    public ForgotDetails build(){return new ForgotDetails(this);}

    public String toString() {
        return "New Details:{" +
                "newUsername='" + newUsername + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';

    }
}
