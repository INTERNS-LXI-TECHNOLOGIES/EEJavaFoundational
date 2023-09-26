package com.lxisoft.yasirhussain.amazon.company.model;

public class CompanyModel implements Comparable<CompanyModel>{
    private String companyName;
    private String industry;
    private String ceoName;
    private int companyId;
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public CompanyModel(String company, String industry, String ceoName, int companyId) {
        this.companyName = companyName;
        this.industry = industry;
        this.ceoName = ceoName;
        this.companyId = companyId;
    }

    public CompanyModel() {
    }

    @Override
    public String toString() {
        return "" + companyName + "" + industry + "" + ceoName + "" + companyId + "";
    }

    @Override
    public int compareTo(CompanyModel o) {
        return ((Integer) this.companyId).compareTo(o.getCompanyId());
    }
}