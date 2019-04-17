package ac.za.cput.domain;

public class PackageReports {

    private String reports;


    public String getReports(){

        return reports;
    }

    public PackageReports(PackageReports builder){

        this.reports = builder.reports;

    }

    public static class Builder{

        private String reports;

        public Builder packageReports(String reports){

            this.reports = reports;
            return this;

        }

    }

    public PackageReports build(){return new PackageReports(this);}

    @Override
    public String toString() {
        return "Reports{" +
                "Reports ='" + reports + '\'' +
                '}';
    }

}
