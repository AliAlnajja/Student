/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Objects;

/**
 *
 * @author alinj
 */
class Address {
    private String aptNum;
    private String streetNum;
    private String streetName;
    private String city;
    private String province;
    private String zipcode;
    
    public Address (){
        this.aptNum = null;
        this.streetNum = null;
        this.streetNum = null;
        this.streetNum = null;
        this.streetNum = null;
        this.streetNum = null;
    }
    
    public Address(String aptNum, String streetNum, String streetName, 
            String city, String province, String zipcode) {
        this.aptNum = aptNum;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
    }

    
    public Address(Address address){
        this.aptNum = address.aptNum;
        this.streetNum = address.streetNum;
        this.streetNum = address.streetName;
        this.streetNum = address.city;
        this.streetNum = address.province;
        this.streetNum = address.zipcode;
}
    /**
     * To check if a zipcode is valid or not, template: A2A 2A2
     * @param zipcode the zipcode you want to check
     * @return if a zipcode is valid or not
     */
    public boolean isZipCodeValid(String zipcode) {
        if (zipcode.length() != 7)
            return false;
        for (int i = 0; i < zipcode.length(); i++) {
            if ((i == 0 || i == 2 || i == 5) && !Character.isLetter(zipcode.charAt(i)))
                return false;
            if ((i == 1 || i == 4 || i == 6) && !Character.isDigit(zipcode.charAt(i)))
                return false;       
        }
        return zipcode.charAt(3) != ' ';
    }
 
    public boolean equals(Address address) {
        return this.aptNum.equals(address.aptNum) &&
        this.aptNum.equals(address.streetNum) &&
        this.aptNum.equals(address.streetName) &&
        this.aptNum.equals(address.city) &&
        this.aptNum.equals(address.province) &&
        this.aptNum.equals(address.zipcode);
      
    }
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-12s%s, %s %s\n", "", aptNum, streetNum, streetName);
        str += String.format("%-12s %s, %s", "", city, province, zipcode);
        
        return str;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        if (isZipCodeValid(zipcode))
            this.zipcode = zipcode.toUpperCase();
        else 
            System.out.printf("%s is not a valid zipcode\n", zipcode);
    }
}
