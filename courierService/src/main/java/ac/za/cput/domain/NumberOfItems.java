package ac.za.cput.domain;

public class NumberOfItems {

    private int numberOfItems;


    public int getNumberOfItems(){

        return numberOfItems;
    }

    public NumberOfItems(NumberOfItems builder){

        this.numberOfItems = builder.numberOfItems;

    }

    public static class Builder{

        private int numberOfItems;

        public Builder numberOfItems(int numberOfItems){

            this.numberOfItems = numberOfItems;
            return this;

        }

    }

    public NumberOfItems build(){return new NumberOfItems(this);}

    @Override
    public String toString() {
        return "Package{" +
                "Number Of Items ='" + numberOfItems + '\'' +
                '}';
    }
}
