package ac.za.cput.domain;

public class Cash {

    private int totalAmount;


    public int getTotalAmount(){

        return totalAmount;
    }

    public Cash(Cash builder){

        this.totalAmount = builder.totalAmount;



    }

    public static class Builder{

        private int totalAmount;


        public Builder totalAmount(int totalAmount){

            this.totalAmount = totalAmount;
            return this;

        }

    }

    public Cash build(){return new Cash(this);}

    @Override
    public String toString() {
        return "Total Amount:{" +
                "TotalAmount='" + totalAmount + '\'' +

                '}';
    }
}
