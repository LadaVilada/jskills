package com.google.code.jskills.dal.entities;

// Generated 25.06.2013 17:52:09 by Hibernate Tools 3.6.0

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LevelEntity generated by hbm2java
 */
@Entity
@Table(name = "LEVEL_", schema = "PUBLIC", catalog = "PUBLIC")
public class LevelEntity implements java.io.Serializable {

	private Integer id;
	private CompetencesEntity competencesEntity;
	private String description;
	private int levelType;

	public LevelEntity() {
	}

	public LevelEntity(int levelType) {
		this.levelType = levelType;
	}

	public LevelEntity(CompetencesEntity competencesEntity, String description,
			int levelType) {
		this.competencesEntity = competencesEntity;
		this.description = description;
		this.levelType = levelType;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPETENCES_ID")
	public CompetencesEntity getCompetencesEntity() {
		return this.competencesEntity;
	}

	public void setCompetencesEntity(CompetencesEntity competencesEntity) {
		this.competencesEntity = competencesEntity;
	}

	@Column(name = "DESCRIPTION", length = 512)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "LEVEL_TYPE", nullable = false)
	public int getLevelType() {
		return this.levelType;
	}

	public void setLevelType(int levelType) {
		this.levelType = levelType;
	}

}
