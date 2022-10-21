package com.ideas2it.service;

import com.ideas2it.model.Skill;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;

import java.sql.Date;
import java.util.List;

/**
 *
 * EmployeeService class have business logics
 * this class is interface of EmployeeServiceImpl class
 * @version 1.0 01-09-2022
 *
 * @author Rohit A P
 *
 */
public interface EmployeeService {

    /**
     *
     * pass Trainer Details insertTrainer method
     *
     * @param trainer
     * @return isIdInserted
     */
    public int insertTrainer(Trainer trainer);

    /**
     *
     * pass Trainee object insertTrainee method
     *
     * @param trainee
     * @return isIdInserted
     */
    public int insertTrainee(Trainee trainee);
    
    /**
     *
     * viewAllTrainer method print every profile in Trainer
     *
     * @param
     * @return trainers
     */
    public List<Trainer> viewAllTrainer();

    /**
     *
     * viewAllTrainee method print every profile in Trainee
     *
     * @param
     * @return trainees
     */
    public List<Trainee> viewAllTrainee();

    /**
     *
     * viewtraineeDetail method print every profile in Trainee
     *
     * @param
     * @return employeeDao.retrivetraineeDetail()
     */
    public List<Trainee> SearchTraineeByName(String name);

    /**
     *
     * deleteTrainer method gets Trainer ID as input and search Id Database,
     * identifies that Id and delete Id details
     *
     * @param id
     * @return void
     */
    public boolean deleteTrainerById(int id);

    /**
     *
     * deleteTrainee method gets Trainee ID as input and search Id in Database,
     * identifies that Id and delete Id details
     *
     * @param id
     * @return isIdExist
     */
    public boolean deleteTraineeById(int id);

    /**
     *
     * update Trainer
     *
     *
     * @param trainer
     * @return void
     */
    public void updateTrainerById(Trainer trainer);

    /**
     *
     * update trainee
     *
     *
     * @param trainee
     * @return void
     */
    public void updateTraineeById(Trainee trainee);

    /**
     *
     * Get Trainer detail by Id
     *
     * @param id
     * @return trainer
     */
    public Trainer getTrainerById(int id);

    /**
     *
     * Get Trainer detail by Id
     *
     * @param id
     * @return trainee
     */
    public Trainee getTraineeById(int id);

    /**
     *
     * used to select gender
     *
     * @param option
     * @return String
     */
    public String selectGender(int option);

    /**
     *
     * Calculate age
     *
     * @param
     * @return age
     */
    public int calculateAge(Date date);

    /**
     *
     * reverse date
     *
     * @param date
     * @return reverseDate
     */
    public String reverseDate(String date);

    /**
     *
     * Validate name
     *
     * @param name
     * @return status
     */
    public boolean isValidName(String name);

    /**
     *
     * Validate phone number
     *
     * @param phoneNumber
     * @return status
     */
    public boolean isValidPhoneNumber(Long phoneNumber);

    /**
     *
     * Validate date
     *
     * @param date
     * @return status
     */
    public boolean isValidDate(String date);

    /**
     *
     * Validate email
     *
     * @param eMail
     * @return status
     */
    public boolean isValidEmail(String eMail);

    /**
     *
     * Validate age
     *
     * @param age
     * @return status
     */
    public boolean isValidAge(int age);
}