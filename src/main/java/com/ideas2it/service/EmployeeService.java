package com.ideas2it.service;

import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;

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
     * @param trainer is used to store trainer details
     * @return isIdInserted
     */
    public int insertTrainer(Trainer trainer);

    /**
     *
     * pass Trainee object insertTrainee method
     *
     * @param trainee is used to store trainee details
     * @return isIdInserted
     */
    public int insertTrainee(Trainee trainee);
    
    /**
     *
     * viewAllTrainer method print every profile in Trainer
     *
     * @return trainers
     */
    public List<Trainer> viewAllTrainer();

    /**
     *
     * viewAllTrainee method print every profile in Trainee
     *
     * @return trainees
     */
    public List<Trainee> viewAllTrainee();

    /**
     *
     * view trainee Detail method print every profile in Trainee
     *
     * @param name is used to search trainee by name
     * @return employeeDao.retrieve trainee Detail
     */
    public List<Trainee> SearchTraineeByName(String name);

    /**
     *
     * deleteTrainer method gets Trainer ID as input and search id Database,
     * identifies that id and delete id details
     *
     * @param id is used to delete trainer by id
     * @return void
     */
    public boolean deleteTrainerById(int id);

    /**
     *
     * deleteTrainee method gets Trainee ID as input and search Id in Database,
     * identifies that id and delete id details
     *
     * @param id is used to delete trainee by it
     * @return isIdExist
     */
    public boolean deleteTraineeById(int id);

    /**
     *
     * update Trainer
     *
     *
     * @param trainer used to update trainer
     * @return void
     */
    public void updateTrainerById(Trainer trainer);

    /**
     *
     * update trainee
     *
     *
     * @param trainee used to update trainee
     * @return void
     */
    public void updateTraineeById(Trainee trainee);

    /**
     *
     * Get Trainer detail by Id
     *
     * @param id used to get trainer by id
     * @return trainer
     */
    public Trainer getTrainerById(int id);

    /**
     *
     * Get Trainee detail by id
     *
     * @param id get trainee by id
     * @return trainee
     */
    public Trainee getTraineeById(int id);

    /**
     *
     * used to select gender
     *
     * @param option select gender
     * @return String
     */
    public String selectGender(int option);

    /**
     *
     * Calculate age
     *
     * @param date string date
     * @return age
     */
    public int calculateAge(String date);

    /**
     *
     * reverse date
     *
     * @param date reverse date(yyyy-mm-dd to dd-mm-yyyy)
     * @return reverseDate
     */
    public String reverseDate(String date);

    /**
     *
     * Validate name
     *
     * @param name validate name
     * @return status
     */
    public boolean isValidName(String name);

    /**
     *
     * Validate phone number
     *
     * @param phoneNumber validate phone number
     * @return status
     */
    public boolean isValidPhoneNumber(Long phoneNumber);

    /**
     *
     * Validate date
     *
     * @param date used to check date format
     * @return status
     */
    public boolean isValidDate(String date);

    /**
     *
     * Validate email
     *
     * @param eMail used to validate email
     * @return status
     */
    public boolean isValidEmail(String eMail);

    /**
     *
     * Validate age
     *
     * @param age validate age
     * @return status
     */
    public boolean isValidAge(int age);
}