package ac.za.cput.domain;

public class Package {

    private String packageBarcode;


    public String getPackageBarcode(){

        return packageBarcode;
    }

    public Package(Package builder){

        this.packageBarcode = builder.packageBarcode;

    }

    public static class Builder{

        private String packageBarcode;

        public Builder packageBarcode(String packageBarcode){

            this.packageBarcode = packageBarcode;
            return this;

        }

    }

    public Package build(){return new Package(this);}

    @Override
    public String toString() {
        return "Package{" +
                "packageBarcode ='" + packageBarcode + '\'' +
                '}';
    }
}
