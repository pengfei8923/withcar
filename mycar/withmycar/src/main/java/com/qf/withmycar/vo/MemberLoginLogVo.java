package com.qf.withmycar.vo;

public class MemberLoginLogVo {
    private Integer id;
    private String namea;
    private String nameb;
    private String phone;
    private String namec;
    private String email;
    private String dept;

    public MemberLoginLogVo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MemberLoginLogVo(Integer id, String namea, String nameb, String phone, String namec, String email, String dept) {
        this.id = id;
        this.namea = namea;
        this.nameb = nameb;
        this.phone = phone;
        this.namec = namec;
        this.email = email;
        this.dept = dept;
    }

    public MemberLoginLogVo(String namea, String nameb, String phone, String namec, String email, String dept) {
        this.namea = namea;
        this.nameb = nameb;
        this.phone = phone;
        this.namec = namec;
        this.email = email;
        this.dept = dept;
    }

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNamec() {
        return namec;
    }

    public void setNamec(String namec) {
        this.namec = namec;
    }

    public String getEamil() {
        return email;
    }

    public void setEamil(String eamil) {
        this.email = eamil;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "MemberLoginLogVo{" +
                "id=" + id +
                ", namea='" + namea + '\'' +
                ", nameb='" + nameb + '\'' +
                ", phone='" + phone + '\'' +
                ", namec='" + namec + '\'' +
                ", eamil='" + email + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
