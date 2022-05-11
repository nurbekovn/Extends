package com.company;

public class Programmer extends Person{

    private String CompanyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.CompanyName=companyName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }


    public void coding(){
        System.out.println("can coding");
    }

    @Override
    public String toString() {
        return "Programmer: {" +
                "CompanyName='" + CompanyName + '\'' +
                "} ";
    }
}
