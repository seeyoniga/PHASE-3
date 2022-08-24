package com.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue
    private int userid;
@NotBlank
    private String username;
@NotBlank
    private String useremail;
@NotBlank
    private String userfeedback;
public Feedback(){
        super();
    }
public Feedback(int userid, String username, String useremail, String userfeedback) {
        super();
        this.userid = userid;
        this.username = username;
        this.useremail = useremail;
        this.userfeedback = userfeedback;
    }
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public String getUserfeedback() {
	return userfeedback;
}
public void setUserfeedback(String userfeedback) {
	this.userfeedback = userfeedback;
}

}