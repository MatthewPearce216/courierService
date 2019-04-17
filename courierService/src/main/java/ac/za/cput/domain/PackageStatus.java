package ac.za.cput.domain;

public class PackageStatus {

    private boolean packageStatus;


    public boolean getPackageStatus(){

        return packageStatus;
    }

    public PackageStatus(PackageStatus builder){

        this.packageStatus = builder.packageStatus;

    }

    public static class Builder{

        private boolean packageStatus;

        public Builder packageStatus(boolean packageStatus){

            this.packageStatus = packageStatus;
            return this;

        }

    }

    public PackageStatus build(){return new PackageStatus(this);}

    @Override
    public String toString() {
        return "Package{" +
                "packageSatus ='" + packageStatus + '\'' +
                '}';
    }
}
