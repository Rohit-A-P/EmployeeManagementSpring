package com.ideas2it.model;

import java.util.Set;

/**
 *
 * Trainee class is used to get Trainee details
 *
 * @version 11.0 01-09-2022
 *
 * @Author Rohit A P
 *
 */
public class Trainee extends Employee {

    private String traineeId;
    private String dateOfJoining;
    private Set<Skill> skills;

    public Trainee() {
    }

    public Trainee(Integer id, String name, String bloodGroup, String designation,
                   String dateOfBirth, String gender, Long phoneNumber, String email, String traineeId,
                   String dateOfJoining, Set<Skill> skills) {

        super(id, name, bloodGroup, designation, dateOfBirth, gender, phoneNumber, email);
        this.traineeId = traineeId;
        this.dateOfJoining = dateOfJoining;
        this.skills = skills;
    }

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public String toString() {
        return (super.toString() + "\nDate Of Joining      : " + this.dateOfJoining);
    }
}