package ac.za.cput.domain;

public class CompanyName {

    private String companyName;


    public String getCompanyName(){

        return companyName;
    }

    public CompanyName(CompanyName builder){

        this.companyName = builder.companyName;
    }

    public static class Builder{

        private String companyName;

        public Builder companyName(String companyName){

            this.companyName = companyName;
            return this;

        }



    }

    public CompanyName build(){return new CompanyName(this);}

    @Override
    public String toString() {
        return "Company{" +
                "Company Name:='" + companyName + '\'' +
                '}';
    }
}
