package com.google.code.jskills.dal.entities;

// Generated 25.06.2013 17:52:09 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TestEntity generated by hbm2java
 */
@Entity
@Table(name = "TEST", schema = "PUBLIC", catalog = "PUBLIC", uniqueConstraints = @UniqueConstraint(columnNames = "NAME"))
public class TestEntity implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private Set<Test2questionEntity> test2questionEntities = new HashSet<Test2questionEntity>(
			0);

	public TestEntity() {
	}

	public TestEntity(String name) {
		this.name = name;
	}

	public TestEntity(String name, String description,
			Set<Test2questionEntity> test2questionEntities) {
		this.name = name;
		this.description = description;
		this.test2questionEntities = test2questionEntities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME", unique = true, nullable = false, length = 256)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION", length = 1024)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testEntity")
	public Set<Test2questionEntity> getTest2questionEntities() {
		return this.test2questionEntities;
	}

	public void setTest2questionEntities(
			Set<Test2questionEntity> test2questionEntities) {
		this.test2questionEntities = test2questionEntities;
	}

}
