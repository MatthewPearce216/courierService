package ac.za.cput.domain;

public class Payment {

    private String proofOfPayment;


    public String getProofOfPayment(){

        return proofOfPayment;
    }

    public Payment(Payment builder){

        this.proofOfPayment = builder.proofOfPayment;




    }

    public static class Builder{

        private String proofOfPayment;

        public Builder proofOfPayment(String proofOfPayment){

            this.proofOfPayment = proofOfPayment;
            return this;

        }

    }

    public Payment build(){return new Payment(this);}

    @Override
    public String toString() {
        return "Payment:{" +
                "Proof Of Paymennt: ='" + proofOfPayment + '\'' +

                '}';
    }

}
