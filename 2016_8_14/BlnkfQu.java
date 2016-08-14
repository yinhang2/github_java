package com.lzu.LzuOl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * <p>Title: BlnkfQu</p>
 * <p>Description: 填空题实体</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-7-24 下午8:15:48
 * @version 1.0.0
 */

@Entity
public class BlnkfQu implements java.io.Serializable {

	// Fields
	/**
	 * private String paperId;   试卷编号
	 * private Integer questId;  问题编号
	 * private String question;  问题
	 * private String answer;    答案
	 * private String type;      题目类型
	 * private String memo;      备注
	 */

	private String paperId;
	@Id
	@GeneratedValue
	private Integer questId;
	private String question;
	private String answer;
	private String type;
	private String memo;

	// Constructors

	/** default constructor */
	public BlnkfQu() {
	}

	/** minimal constructor */
	public BlnkfQu(Integer questId, String question, String answer, String type) {
		this.questId = questId;
		this.question = question;
		this.answer = answer;
		this.type = type;
	}

	/** full constructor */
	public BlnkfQu(Integer questId, String question, String answer,
			String type, String memo) {
		this.questId = questId;
		this.question = question;
		this.answer = answer;
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