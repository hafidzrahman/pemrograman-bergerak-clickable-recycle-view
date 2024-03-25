package com.example.recyclerview.appDesign;

public class appDesign {

    int profileImage;

    String profileName, profileNIM;
    public appDesign(int profileImage, String profileName, String profileNIM) {
        this.profileImage = profileImage;
        this.profileName = profileName;
        this.profileNIM = profileNIM;

    }

    public int getProfileImage() {
        return this.profileImage;
    }
    public String getProfileName() {
        return this.profileName;
    }

    public String getProfileNIM() {
        return this.profileNIM;
    }

}
