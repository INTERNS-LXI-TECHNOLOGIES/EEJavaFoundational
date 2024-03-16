package com.lxisoft.app;
import java.io.InputStream;
public class Contact {
  private   String name;
  private String phoneNo;
    private InputStream profilePhoto;


        public InputStream getProfilePhoto() {
            return profilePhoto;
        }

        public void setProfilePhoto(InputStream profilePhoto) {
            this.profilePhoto = profilePhoto;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }


    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}