package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Task {
	
	@Id @GeneratedValue
	private Integer task_id;
	
	@OneToMany(mappedBy = "task")
	private List<Employee> employees = new ArrayList<>();
	
	@ManyToOne
	private Requirement requirement;
}
