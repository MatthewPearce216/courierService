package ac.za.cput.domain;

public class Courier {

    private boolean status;


    public boolean getStatus(){

        return status;
    }

    public Courier(Courier builder){

        this.status = builder.status;

    }

    public static class Builder{

        private boolean status;


        public Builder status(boolean status){

            this.status = status;
            return this;

        }


    }

    public Courier build(){return new Courier(this);}

    @Override
    public String toString() {
        return "Courier{" +
                "Status='" + status + '\'' +

                '}';
    }
}
