package com.retoree.term_project.bean;

// 하나의 데이터를 관리하고 처리할 수 있는 기법을 jsp에서 구현하는 것 -> Java Beans
public class Member {

    private String usersUid;
    private String phone;
    private String name;
    private String email;
    private String id;
    private String pwd;
    private String surveyCheck;

    // 기본 생성자, 매개변수 생성자, setter/getter, toString
    public Member(String usersUid, String phone, String name, String email, String id, String pwd, String surveyCheck) {
        super();
        this.usersUid = usersUid;
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.id = id;
        this.pwd = pwd;
        this.surveyCheck = surveyCheck;
    }

    public String getUsersUid() {
        return this.usersUid;
    }

    public void setUsersUid(String usersUid) {
        this.usersUid = usersUid;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getSurveyCheck() {
        return this.surveyCheck;
    }

    public void setSurveyCheck(String surveyCheck) {
        this.surveyCheck = surveyCheck;
    }

    @Override
    public String toString() { // console창 띄울 때 모든 필드에 있는 값을 주소값 아닌 String으로 반환
        return "{" +
                " usersUid='" + getUsersUid() + "'" +
                ", phone='" + getPhone() + "'" +
                ", name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", id='" + getId() + "'" +
                ", pwd='" + getPwd() + "'" +
                ", surveyCheck='" + getSurveyCheck() + "'" +
                "}";
    }
}
