package com.retoree.term_project.Bean;
// 하나의 데이터를 관리하고 처리할 수 있는 기법을 jsp에서 구현하는 것 -> Java Beans
public class Member {

    private int usersUid;
    private String phone;
    private String name;
    private String email;
    private String id;
    private String pwd;

    // 기본 생성자, 매개변수 생성자, setter/getter, toString
    public Member(int userUid, String phone, String name, String email, String id, String pwd) {
        super();
        this.usersUid = userUid;
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.id = id;
        this.pwd = pwd;
    }

    public int getUsersUid() {
        return this.usersUid;
    }

    public void setUsersUid(int usersUid) {
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

    @Override
    public String toString() { // console창 띄울 때 모든 필드에 있는 값을 주소값 아닌 String으로 반환
        return "{" +
                " usersUid='" + getUsersUid() + "'" +
                ", phone='" + getPhone() + "'" +
                ", name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", id='" + getId() + "'" +
                ", pwd='" + getPwd() + "'" +
                "}";
    }
}
