package ac.za.cput.domain;

public class CustomerName {

    private String firstName;
    private String lastName;

    public String getfirstName(){

        return firstName;
    }

    public String getlastName(){

        return lastName;
    }

    public CustomerName(CustomerName builder){

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder{

        private String firstName;
        private String lastName;

        public Builder firstName(String firstName){

            this.firstName = firstName;
            return this;

        }
        public Builder lastName(String lastName){

            this.lastName = lastName;
            return this;

        }
    }

    public CustomerName build(){return new CustomerName(this);}

    public String toString() {
        return "customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';


    }
}
