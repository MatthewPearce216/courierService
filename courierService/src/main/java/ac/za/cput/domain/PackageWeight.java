package ac.za.cput.domain;

public class PackageWeight {


    private String weight;


    public String getWeight(){

        return weight;
    }

    public PackageWeight(PackageWeight builder){

        this.weight = builder.weight;

    }

    public static class Builder{

        private String weight;

        public Builder packageWeight(String weight){

            this.weight = weight;
            return this;

        }

    }

    public PackageWeight build(){return new PackageWeight(this);}

    @Override
    public String toString() {
        return "Package{" +
                "Weight ='" + weight + '\'' +
                '}';
    }
}
