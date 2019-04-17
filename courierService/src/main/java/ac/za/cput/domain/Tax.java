package ac.za.cput.domain;

public class Tax {

    private String year;


    public String getYear(){

        return year;
    }

    public Tax(Tax builder){

        this.year = builder.year;

    }

    public static class Builder{

        private String year;


        public Builder year(String year){

            this.year = year;
            return this;

        }

    }

    public Tax build(){return new Tax(this);}

    @Override
    public String toString() {
        return "Tax Year:{" +
                "Year='" + year + '\'' +
                '}';
    }

}
