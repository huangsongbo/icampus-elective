package com.irengine.campus.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ele_base_syllabus")
public class BaseSyllabus extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = -3942911070282190611L;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="base_syllabus_id")
	private List<ClassHourModule> classHourModules=new ArrayList<ClassHourModule>();

	public List<ClassHourModule> getClassHourModules() {
		return classHourModules;
	}

	public void setClassHourModules(List<ClassHourModule> classHourModules) {
		this.classHourModules = classHourModules;
	}
	
}
