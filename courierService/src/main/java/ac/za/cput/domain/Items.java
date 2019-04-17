package ac.za.cput.domain;

public class Items {

    private int amountOfItems;


    public int getAmountOfItems(){

        return amountOfItems;
    }

    public Items(Items builder){

        this.amountOfItems = builder.amountOfItems;

    }

    public static class Builder{

        private int amountOfItems;

        public Builder amountOfItems(int amountOfItems){

            this.amountOfItems = amountOfItems;
            return this;

        }

    }

    public Items build(){return new Items(this);}

    @Override
    public String toString() {
        return "Company{" +
                "Amount Of Items ='" + amountOfItems + '\'' +
                '}';
    }
}
