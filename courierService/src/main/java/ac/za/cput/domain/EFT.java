package ac.za.cput.domain;

public class EFT {

    private int totalAmount;
    private String accountNumber;
    private String branchCode;


    public int getTotalAmount(){

        return totalAmount;
    }

    public String getAccountNumber(){

        return accountNumber;
    }

    public String getBranchCode(){

        return branchCode;
    }

    public EFT(EFT builder){

        this.totalAmount = builder.totalAmount;
        this.accountNumber = builder.accountNumber;
        this.branchCode = builder.branchCode;



    }

    public static class Builder{

        private int totalAmount;
        private String accountNumber;
        private String branchCode;

        public Builder totalAmount(int totalAmount){

            this.totalAmount = totalAmount;
            return this;

        }
        public Builder accountNumber(String accountNumber){

            this.accountNumber = accountNumber;
            return this;

        }
        public Builder branchCode(String branchCode){

            this.branchCode = branchCode;
            return this;

        }

    }

    public EFT build(){return new EFT(this);}

    @Override
    public String toString() {
        return "EFT Payment{" +
                "TotalAmount='" + totalAmount + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", branchCode='" + branchCode + '\'' +
                '}';
    }
}
