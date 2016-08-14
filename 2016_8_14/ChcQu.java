package com.lzu.LzuOl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * <p>Title: ChcQu</p>
 * <p>Description: 选择题实体类</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-7-25 上午10:21:14
 * @version 1.0.0
 */

@Entity
public class ChcQu implements java.io.Serializable {

	// Fields

	/**
	 * private String paperId;  试卷编号
	 * private Integer questId; 问题编号
	 * private String question; 问题
	 * private String answer;   答案
	 * private String optA;     选择项A
	 * private String optB;     选择项B
	 * private String optC;     选择项C
	 * private String optD;     选择项D
	 * private String type;     类型
     * private String memo;     备注
	 */
	
	private String paperId;
	@Id
	@GeneratedValue
	private Integer questId;
	private String question;
	private String answer;
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	private String type;
	private String memo;

	// Constructors

	/** default constructor */
	public ChcQu() {
	}

	/** minimal constructor */
	public ChcQu(Integer questId, String question, String answer, String type) {
		this.questId = questId;
		this.question = question;
		this.answer = answer;
		this.type = type;
	}

	/** full constructor */
	public ChcQu(Integer questId, String question, String answer, String optA,
			String optB, String optC, String optD, String type, String memo) {
		this.questId = questId;
		this.question = question;
		this.answer = answer;
		this.optA = optA;
		this.optB = optB;
		this.optC = optC;
		this.optD = optD;
		this.type = type;
		this.memo = memo;
	}

	// Property accessors

	public String getPaperId() {
		return this.paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public Integer getQuestId() {
		return this.questId;
	}

	public void setQuestId(Integer questId) {
		this.questId = questId;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getOptA() {
		return this.optA;
	}

	public void setOptA(String optA) {
		this.optA = optA;
	}

	public String getOptB() {
		return this.optB;
	}

	public void setOptB(String optB) {
		this.optB = optB;
	}

	public String getOptC() {
		return this.optC;
	}

	public void setOptC(String optC) {
		this.optC = optC;
	}

	public String getOptD() {
		return this.optD;
	}

	public void setOptD(String optD) {
		this.optD = optD;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}