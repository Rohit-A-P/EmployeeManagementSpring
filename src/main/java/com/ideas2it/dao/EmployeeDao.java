package com.ideas2it.dao;

import java.util.List;

import com.ideas2it.customexception.DatabaseNotFound;
import com.ideas2it.model.Trainer;
import com.ideas2it.model.Trainee;

/**
 * EmployeeDao manage insert, retrieve, delete and update operation
 * this class is interface of EmployeeDaoImpl class
 *
 * @version 1.0 01-09-2022
 *
 * @author Rohit A P
 */
public interface EmployeeDao {

    /**
     * 
     * add trainer details to database
     * 
     * @param trainer
     * @return void
     */
    public int insertTrainer(Trainer trainer) throws DatabaseNotFound;

    /**
     * 
     * add trainee details to database
     * 
     * @param Trainee trainee
     * @return void
     */
    public int insertTrainee(Trainee trainee) throws DatabaseNotFound;

    /**
     * 
     * shows every trainer detail
     * 
     * @param
     * @return trainers
     */
    public List<Trainer> viewAllTrainer() throws DatabaseNotFound;

    /**
     * 
     * shows every trainee detail
     * 
     * @param
     * @return trainees
     */
    public List<Trainee> viewAllTrainee() throws DatabaseNotFound;

    /**
     * 
     * shows every trainee detail with given name
     * 
     * @param name
     * @return trainees
     */
    public List<Trainee> SearchTraineeByName(String name) throws DatabaseNotFound;

    /**
     * 
     * delete trainer detail
     * 
     * @param id
     * @return isIdExist
     */
    public boolean deleteTrainerById(int id) throws DatabaseNotFound;

    /**
     * 
     * delete trainee detail
     * 
     * @param id
     * @return isIdExist
     */
    public boolean deleteTraineeById(int id) throws DatabaseNotFound;

    /**
     * 
     * update Employee
     * 
     * @param employee
     * @return void
     */
    public void updateTrainerById(Trainer trainer) throws DatabaseNotFound;

    /**
     * 
     * update Trainee
     * 
     * @param trainee
     * @return void
     */
    public void updateTraineeById(Trainee trainee) throws DatabaseNotFound;

    /**
     * 
     * gets trainer profile by getting trainer id
     * 
     * @param id
     * @return trainer
     */
    public Trainer getTrainerById(int id) throws DatabaseNotFound;

    /**
     * 
     * gets trainee profile by getting trainee id
     * 
     * @param id
     * @return trainee
     */
    public Trainee getTraineeById(int id) throws DatabaseNotFound;

}