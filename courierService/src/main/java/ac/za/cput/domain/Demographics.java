package ac.za.cput.domain;

public class Demographics {

    private String gender;
    private String race;


    public String getGender(){

        return gender;
    }

    public String getRace(){

        return race;
    }

    public Demographics(Demographics builder){

        this.gender = builder.gender;
        this.race = builder.race;




    }

    public static class Builder{

        private String gender;
        private String race;


        public Builder gender(String gender){

            this.gender = gender;
            return this;

        }
        public Builder race(String race){

            this.race = race;
            return this;

        }



    }

    public Demographics build(){return new Demographics(this);}

    @Override
    public String toString() {
        return "Customer Demographics:{" +
                "gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
