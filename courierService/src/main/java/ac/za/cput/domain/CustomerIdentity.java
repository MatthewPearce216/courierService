package ac.za.cput.domain;

public class CustomerIdentity {

    private String idValue;
    private String idType;

    public String getIdValue(){

        return idValue;
    }

    public String getIDType(){

        return idType;
    }


    public CustomerIdentity(CustomerIdentity builder){

        this.idValue = builder.idValue;
        this.idType = builder.idType;
    }


    public static class Builder{

        private String idValue;
        private String idType;

        public Builder idValue(String idValue){

            this.idValue = idValue;
            return this;
        }


        public Builder idType(String idType){

            this.idType = idType;
            return this;
        }

        /**
         *
         * @return
         */


    }

    public CustomerIdentity build(){return new CustomerIdentity(this);}

    public String toString() {
        return "customer{" +
                "idValue='" + idValue + '\'' +
                ", idType='" + idType + '\'' +
                '}';
    }
}
