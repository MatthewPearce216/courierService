package ac.za.cput.domain;

public class InternationalCompany {

    private String intCompanyName;


    public String getIntCompanyName(){

        return intCompanyName;
    }

    public InternationalCompany(InternationalCompany builder){

        this.intCompanyName = builder.intCompanyName;
    }

    public static class Builder{

        private String intCompanyName;

        public Builder intCompanyName(String intCompanyName){

            this.intCompanyName = intCompanyName;
            return this;

        }



    }

    public InternationalCompany build(){return new InternationalCompany(this);}

    @Override
    public String toString() {
        return "International Company{" +
                "Company Name:='" + intCompanyName + '\'' +
                '}';
    }
}
