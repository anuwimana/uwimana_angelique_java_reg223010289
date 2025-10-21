package com.hms;

public class GuestModel {
    private int guestID;
    private String username;
    private String passwordHash;
    private String email;
    private String fullName;
    private String role;

    public GuestModel(int guestID, String username, String passwordHash, String email, String fullName, String role) {
        this.guestID = guestID;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.fullName = fullName;
        this.role = role;
    }

    // Getters & Setters
    public int getGuestID() { return guestID; }
    public void setGuestID(int guestID) { this.guestID = guestID; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}