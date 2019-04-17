package ac.za.cput.domain;

public class PickupLocation {

    private String companyName;
    private String packageLocation;


    public String getCompanyName(){

        return companyName;
    }

    public String getPackageLocation(){

        return packageLocation;
    }

    public PickupLocation(PickupLocation builder){

        this.companyName = builder.companyName;
        this.packageLocation = builder.packageLocation;




    }

    public static class Builder{

        private String companyName;
        private String packageLocation;


        public Builder companyName(String companyName){

            this.companyName = companyName;
            return this;

        }
        public Builder packageLocation(String packageLocation){

            this.packageLocation = packageLocation;
            return this;

        }

    }

    public PickupLocation build(){return new PickupLocation(this);}

    @Override
    public String toString() {
        return "Loaction{" +
                "Company: ='" + companyName + '\'' +
                ", Pick Up Location ='" + packageLocation + '\'' +
                '}';
    }
}
