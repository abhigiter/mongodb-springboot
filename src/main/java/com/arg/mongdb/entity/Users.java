package com.arg.mongdb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	

    @Id
    private Integer id;
    private String name;
    private String teamName;
    private Long salary;
    private UserContactInformation userContactInformation;

    public Users(Integer id, String name, String teamName, Long salary, UserContactInformation userContactInformation) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
        this.userContactInformation = userContactInformation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

	public UserContactInformation getUserContactInformation() {
		return userContactInformation;
	}

	public void setUserContactInformation(UserContactInformation userContactInformation) {
		this.userContactInformation = userContactInformation;
	}
    
    

}
