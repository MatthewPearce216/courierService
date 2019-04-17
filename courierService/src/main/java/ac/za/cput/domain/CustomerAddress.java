package ac.za.cput.domain;

public class CustomerAddress {

    private String physicalAddress;
    private String postalAddress;
    private String postalCode;


    public String getPhysicalAddress(){

        return physicalAddress;

    }

    public String getPostalAddress(){

        return postalAddress;
    }

    public String getPostalCode(){

        return postalCode;
    }

    public CustomerAddress(CustomerAddress builder){

        this.physicalAddress = builder.physicalAddress;
        this.postalAddress = builder.postalAddress;
        this.postalCode = builder.postalCode;




    }

    public static class Builder{

        private String physicalAddress;
        private String postalAddress;
        private String postalCode;


        public Builder physicalAddress(String physicalAddress){

            this.physicalAddress = physicalAddress;
            return this;

        }
        public Builder postalAddress(String postalAddress){

            this.postalAddress = postalAddress;
            return this;

        }
        public Builder postalCode(String postalCode){

            this.postalCode = postalCode;
            return this;

        }


    }

    public CustomerAddress build(){return new CustomerAddress(this);}

    @Override
    public String toString() {
        return "Customer Address{" +
                "physicalAddress='" + physicalAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

}
