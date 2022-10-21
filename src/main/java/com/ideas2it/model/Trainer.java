package com.ideas2it.model;

import java.time.LocalDate;

import com.ideas2it.model.Employee;

/**
 *
 * Trainer class is used to get Trainer details
 *
 * @version 11.0 01-09-2022
 *
 * @Author Rohit A P
 *
 */
public class Trainer extends Employee {

    private String  trainerId;
    private Integer trainingSince;

    public Trainer() {
    }

    public Trainer(Integer id, String name, String bloodGroup, String designation,
                   String dateOfBirth, String gender, Long phoneNumber, String email,
                   String trainerId, Integer trainingSince) {

        super(id, name, bloodGroup, designation, dateOfBirth, gender, phoneNumber, email);
        this.trainerId = trainerId;
        this.trainingSince = trainingSince;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public Integer getTrainingSince() {
        return trainingSince;
    }

    public void setTrainingSince(Integer trainingSince) {
        this.trainingSince = trainingSince;
    }

    public String toString() {
        return (super.toString() + "\nTraining Since       : " + this.trainingSince);
    }
}