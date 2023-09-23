package com.lxi.yadhu.wktwo.company.model;

public class Company implements Comparable<Company>{

    private String companyName; 
    private String industry; 
    private String employeeCount;
    private String foundedDate;
    private String revenue;
    private String location; 
    private String ceoName; 
    private String phoneNumber; 
    private String stockSymbol; 
    private String customerCount; 
    private int companyId;
    
    public Company(String companyName, String industry, String employeeCount, String foundedDate, String revenue,
            String location, String ceoName, String phoneNumber, String stockSymbol, String customerCount,
            int companyId) {
        this.companyName = companyName;
        this.industry = industry;
        this.employeeCount = employeeCount;
        this.foundedDate = foundedDate;
        this.revenue = revenue;
        this.location = location;
        this.ceoName = ceoName;
        this.phoneNumber = phoneNumber;
        this.stockSymbol = stockSymbol;
        this.customerCount = customerCount;
        this.companyId = companyId;
    }
    public Company() {
    }
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
    public String getEmployeeCount() {
        return employeeCount;
    }
    public void setEmployeeCount(String employeeCount) {
        this.employeeCount = employeeCount;
    }
    public String getFoundedDate() {
        return foundedDate;
    }
    public void setFoundedDate(String foundedDate) {
        this.foundedDate = foundedDate;
    }
    public String getRevenue() {
        return revenue;
    }
    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCeoName() {
        return ceoName;
    }
    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getStockSymbol() {
        return stockSymbol;
    }
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
    public String getCustomerCount() {
        return customerCount;
    }
    public void setCustomerCount(String customerCount) {
        this.customerCount = customerCount;
    }
    public int getCompanyId() {
        return companyId;
    }
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    @Override
    public String toString() {
        return " " + companyName + " " + industry + " " + employeeCount
                + " " + foundedDate + " " + revenue + " " + location + " "
                + ceoName + " " + phoneNumber + " " + stockSymbol + " "
                + customerCount + " " + companyId + " ";
    }
    @Override
    public int compareTo(Company o) {
        // TODO Auto-generated method stub
        return ((Integer)this.companyId).compareTo(o.getCompanyId());
    }
    
}