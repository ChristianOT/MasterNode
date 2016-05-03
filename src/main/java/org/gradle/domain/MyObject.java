package org.gradle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="MYOBJECT")
@XmlRootElement
public class MyObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@XmlElement(name="Id")
	@Column(name="Id")
	private Long id;

	@Lob
	@Column(name="Content",length = 100000)
	private String content;
	
	public MyObject() {
	}

	public MyObject(String content) {
		this.content = content;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
