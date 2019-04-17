package ac.za.cput.domain;

public class Cheque {

    private int totalAmount;
    private String chequeNumber;


    public int getTotalAmount(){

        return totalAmount;
    }

    public String getChequeNumber(){

        return chequeNumber;
    }

    public Cheque(Cheque builder){

        this.totalAmount = builder.totalAmount;
        this.chequeNumber = builder.chequeNumber;



    }

    public static class Builder{

        private int totalAmount;
        private String chequeNumber;

        public Builder totalAmount(int totalAmount){

            this.totalAmount = totalAmount;
            return this;

        }
        public Builder chequeNumber(String chequeNumber){

            this.chequeNumber = chequeNumber;
            return this;

        }

    }

    public Cheque build(){return new Cheque(this);}

    @Override
    public String toString() {
        return "Cheque:{" +
                "totalAmount='" + totalAmount + '\'' +
                ", chequeNumber='" + chequeNumber + '\'' +
                '}';
    }
}
