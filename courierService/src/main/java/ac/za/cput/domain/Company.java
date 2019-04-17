package ac.za.cput.domain;

public class Company {

    private String location;


    public String getLocation(){

        return location;
    }

    public Company(Company builder){

        this.location = builder.location;
    }

    public static class Builder{

        private String location;

        public Builder location(String location){

            this.location = location;
            return this;

        }



    }

    public Company build(){return new Company(this);}

    @Override
    public String toString() {
        return "Company{" +
                "Location:='" + location + '\'' +
                '}';
    }
}
