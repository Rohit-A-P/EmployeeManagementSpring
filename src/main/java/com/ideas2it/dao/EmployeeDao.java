package com.ideas2it.dao;

import com.ideas2it.customexception.DatabaseNotFound;
import com.ideas2it.model.Skill;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;

import java.util.List;

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
     * @param trainer it contains Trainer object
     * @return isIdInserted
     */
    public int insertTrainer(Trainer trainer) throws DatabaseNotFound;

    /**
     *
     * add trainee details to database
     *
     * @param trainee it contains
     * @return isIdInserted
     */
    public int insertTrainee(Trainee trainee) throws DatabaseNotFound;

    /**
     *
     * shows every trainer detail
     *
     * @return trainers
     */
    public List<Trainer> viewAllTrainer() throws DatabaseNotFound;

    /**
     *
     * shows every trainee detail
     * <p>
     *
     * @return trainees
     */
    public List<Trainee> viewAllTrainee() throws DatabaseNotFound;

    /**
     *
     * shows every trainee detail with given name
     *
     * @param name search trainee by name
     * @return trainees
     */
    public List<Trainee> SearchTraineeByName(String name) throws DatabaseNotFound;

    /**
     *
     * delete trainer detail
     *
     * @param id delete trainer by id
     * @return isIdExist
     */
    public boolean deleteTrainerById(int id) throws DatabaseNotFound;

    /**
     *
     * delete trainee detail
     *
     * @param id delete trainee by id
     * @return isIdExist
     */
    public boolean deleteTraineeById(int id) throws DatabaseNotFound;

    /**
     *
     * update trainer
     *
     * @param trainer used to update trainer object
     * @return void
     */
    public void updateTrainerById(Trainer trainer) throws DatabaseNotFound;

    /**
     *
     * update Trainee
     *
     * @param trainee used to update trainee object
     * @return void
     */
    public void updateTraineeById(Trainee trainee) throws DatabaseNotFound;

    /**
     *
     * gets trainer profile by getting trainer id
     *
     * @param id used to get trainer object by id
     * @return trainer
     */
    public Trainer getTrainerById(int id) throws DatabaseNotFound;

    /**
     *
     * gets trainee profile by getting trainee id
     *
     * @param id used to get trainee object by id
     * @return trainee
     */
    public Trainee getTraineeById(int id) throws DatabaseNotFound;
}