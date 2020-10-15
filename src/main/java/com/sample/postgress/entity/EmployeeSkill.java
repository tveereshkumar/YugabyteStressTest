package com.sample.postgress.entity;

public class EmployeeSkill {

    String employeeId;
    String skillName;
    int experience;
    String description;

    public EmployeeSkill() {

    }

    public EmployeeSkill(String employeeId, String skillName,
                         int experience, String description) {
        this.employeeId = employeeId;
        this.skillName = skillName;
        this.experience = experience;
        this.description = description;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
