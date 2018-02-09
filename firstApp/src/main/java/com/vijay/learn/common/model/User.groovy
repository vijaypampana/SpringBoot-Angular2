package com.vijay.learn.common.model

class User implements Serializable {

    private Long id
    private String firstName
    private String lastName
    private Date DOB
    private String userName
    private String password
    private boolean active

    User() {

    }

    User(Long id, String firstName, String lastName, Date DOB, String userName, String password, boolean active) {

        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.DOB = DOB
        this.userName = userName
        this.password = password
        this.active = active

    }

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    Date getDOB() {
        return DOB
    }

    void setDOB(Date DOB) {
        this.DOB = DOB
    }

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    boolean getActive() {
        return active
    }

    void setActive(boolean active) {
        this.active = active
    }


}
