package ac.za.cput.domain;

public class CooporateClients {

    private String cooprateName;


    public String cooprateName(){

        return cooprateName;
    }

    public CooporateClients(CooporateClients builder){

        this.cooprateName = builder.cooprateName;

    }

    public static class Builder{

        private String cooprateName;


        public Builder cooprateName(String cooprateName){

            this.cooprateName = cooprateName;
            return this;

        }

    }

    public CooporateClients build(){return new CooporateClients(this);}

    @Override
    public String toString() {
        return "Cooprate Clients:{" +
                "cooprateName: ='" + cooprateName + '\'' +

                '}';
    }
}
