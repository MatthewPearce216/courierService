package ac.za.cput.domain;

public class Customer {

    private String custID;
    private String numberOfDependencies;



    public String getCustID(){

        return custID;
    }

    public String getNumOfDependencies(){

        return numberOfDependencies;
    }

    public Customer(Customer builder){

        this.custID = builder.custID;
        this.numberOfDependencies = builder.numberOfDependencies;
    }

    public static class Builder{

        private String custID;
        private String numberOfDependencies;

        public Builder custID(String custID){

            this.custID = custID;
            return this;
        }

        public Builder numberOfDependencies(String numberOfDependencies){

            this.numberOfDependencies = numberOfDependencies;
            return this;
        }


    }

    public Customer build(){return new Customer(this);}

    public String toString() {
        return "customer{" +
                "custID='" + custID + '\'' +
                ", numberOfDependencies='" + numberOfDependencies + '\'' +

                '}';
    }
}
