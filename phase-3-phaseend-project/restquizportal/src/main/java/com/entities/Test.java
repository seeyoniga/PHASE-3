package com.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "uid")
	private User userid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quid")
	private Quiz quizid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private int testans1;
	private int testans2;
	private int testans3;
	private int testans4;
	private Question qid1;
	private Question qid2;
	private Question qid3;
	private Question qid4;
	public Question getQid1() {
		return qid1;
	}

	public void setQid1(Question qid1) {
		this.qid1 = qid1;
	}

	public Question getQid2() {
		return qid2;
	}

	public void setQid2(Question qid2) {
		this.qid2 = qid2;
	}

	public Question getQid3() {
		return qid3;
	}

	public void setQid3(Question qid3) {
		this.qid3 = qid3;
	}

	public Question getQid4() {
		return qid4;
	}

	public void setQid4(Question qid4) {
		this.qid4 = qid4;
	}
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public Quiz getQuizid() {
		return quizid;
	}

	public void setQuizid(Quiz quizid) {
		this.quizid = quizid;
	}


	public int getTestans1() {
		return testans1;
	}

	public void setTestans1(int testans1) {
		this.testans1 = testans1;
	}

	public int getTestans2() {
		return testans2;
	}

	public void setTestans2(int testans2) {
		this.testans2 = testans2;
	}

	public int getTestans3() {
		return testans3;
	}

	public void setTestans3(int testans3) {
		this.testans3 = testans3;
	}

	public int getTestans4() {
		return testans4;
	}

	public void setTestans4(int testans4) {
		this.testans4 = testans4;
	}

	@Override
	public String toString() {
		return "Test [tid=" + tid + ", userid=" + userid + ", quid=" + quizid + ", testans1=" + testans1 + ",testans2=" + testans2 + ",testans3=" + testans3 + ",testans4=" + testans4 + ", qid1=+ "+ qid1 + ", qid2=" + qid2 + ", qid3=" + qid3 + ", qid4=" + qid4 + "]";
	}
	
	

}
