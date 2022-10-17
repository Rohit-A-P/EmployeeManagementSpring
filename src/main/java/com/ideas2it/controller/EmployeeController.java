package com.ideas2it.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ideas2it.model.Skill;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import com.ideas2it.service.impl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
    private Logger logger = LogManager.getLogger(EmployeeController.class);  

    /**
     * 
     * it is used to get request and response
     * 
     * @param request, response
     * @return void
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * 
     * it is used to send response
     * 
     * @param request, response
     * @return void
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("flag");

        switch (action) {
        case "insertTrainer":
            insertTrainer(request, response);
            break;
        case "viewTrainers":
            viewTrainers(request, response);
            break;
        case "updateTrainer":
            updateTrainer(request, response);
            break;            
        case "deleteTrainer":
            deleteTrainer(request, response);
            break;
        case "getTrainerById":
            getTrainerById(request, response);
            break;
        case "insertTrainee":
            insertTrainee(request, response);
            break;
        case "viewTrainees":
            viewAllTrainee(request, response);
            break;
        case "updateTrainee":
            updateTraineeById(request, response);
            break;
        case "deleteTrainee":
            deleteTrainee(request, response);
            break;
        case "getTraineeById":
            getTraineeById(request, response);
            break; 
        }
    }

    /**
     * 
     * add trainer details to trainer object
     * 
     * @param request, response
     * @return void
     */
    public void insertTrainer(HttpServletRequest request, HttpServletResponse response) {

        int id = 0;

        String name = request.getParameter("name");
        String bloodGroup = request.getParameter("bloodGroup");

        String date = request.getParameter("dateOfBirth");
        Date dateOfBirth = Date.valueOf(date);

        String designation = request.getParameter("desgination");

        String gender = request.getParameter("gender");

        String number = request.getParameter("phoneNumber");
        long phoneNumber = Long.parseLong(number);

        String email = request.getParameter("email");

        String trainerId = "0";

        String year = request.getParameter("trainingSince");
        int trainingSince = Integer.parseInt(year);

        Trainer trainer = new Trainer(id, name, bloodGroup, designation,
                dateOfBirth, gender, phoneNumber, email, trainerId, trainingSince);

        id = employeeServiceImpl.insertTrainer(trainer);
        viewTrainers(request, response);
    }

    /**
     * 
     * shows all trainers
     * 
     * @param request, response
     * @return void
     */
    public void viewTrainers(HttpServletRequest request, HttpServletResponse response) {
        List<Trainer> trainers = employeeServiceImpl.viewAllTrainer();
        request.setAttribute("trainerList", trainers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewTrainers.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    
    /**
     * 
     * update trainer 
     * 
     * @param request, response
     * @return void
     */
    public void updateTrainer(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("name");
        String bloodGroup = request.getParameter("bloodGroup");

        String date = request.getParameter("dateOfBirth");
        Date dateOfBirth = Date.valueOf(date);

        String designation = request.getParameter("designation");

        String gender = request.getParameter("gender");

        String number = request.getParameter("phoneNumber");
        long phoneNumber = Long.parseLong(number);

        String email = request.getParameter("email");

        String trainerId = "0";

        String year = request.getParameter("trainingSince");
        int trainingSince = Integer.parseInt(year);

        Trainer trainer = new Trainer(id, name, bloodGroup, designation,
                dateOfBirth, gender, phoneNumber, email, trainerId, trainingSince);

       employeeServiceImpl.updateTrainerById(trainer);
       
       try {
           response.sendRedirect("http://localhost:8080/EmployeeManagement/TrainerController?flag=viewTrainers");
       } catch (IOException e) {
           e.printStackTrace();
       }  
    }

    /**
     * 
     * delete trainer
     * 
     * @param request, response
     * @return void
     */
    public void deleteTrainer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean isIdExist = employeeServiceImpl.deleteTrainerById(id);
        try {
            response.sendRedirect("http://localhost:8080/EmployeeManagement/TrainerController?flag=viewTrainers");
        } catch (IOException e) {
            e.printStackTrace();
        }  
   }

    /**
     * 
     * get trainer by id
     * 
     * @param request, response
     * @return void
     */
    public void getTrainerById(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));
        Trainer trainer = employeeServiceImpl.getTrainerById(id);
        request.setAttribute("trainer", trainer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateTrainer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } 
    }
    
    /**
     * 
     * add trainee details to trainee object
     * 
     * @param request, response
     * @return void
     */
    public void insertTrainee(HttpServletRequest request, HttpServletResponse response) {

        int id = 0;

        String name = request.getParameter("name");
        String bloodGroup = request.getParameter("bloodGroup");

        String date = request.getParameter("dateOfBirth");
        Date dateOfBirth = Date.valueOf(date);

        String designation = request.getParameter("designation");

        String gender = request.getParameter("gender");

        String number = request.getParameter("phoneNumber");
        long phoneNumber = Long.parseLong(number);

        String email = request.getParameter("email");

        String traineeId = "0";

        date = request.getParameter("dateOfJoining");
        Date dateOfJoining = Date.valueOf(date);

        Set<Skill> skills = new HashSet<Skill>();

        Skill skillOne = new Skill();
        
        skillOne.setTraineeId(traineeId);

        skillOne.setSkillName(request.getParameter("skillName1"));

        String expirenece = request.getParameter("skillExperience1");
        skillOne.setSkillExperience(Float.valueOf(expirenece));

        skillOne.setSkillVersion(request.getParameter("skillVersion1"));

        skillOne.setSkillCertification(request.getParameter("skillCertification1"));

        skills.add(skillOne);
        
        Skill skillTwo = new Skill();

        skillTwo.setTraineeId(traineeId);

        skillTwo.setSkillName(request.getParameter("skillName2"));

        expirenece = request.getParameter("skillExperience2");
        skillTwo.setSkillExperience(Float.valueOf(expirenece));

        skillTwo.setSkillVersion(request.getParameter("skillVersion2"));

        skillTwo.setSkillCertification(request.getParameter("skillCertification2"));

        skills.add(skillTwo);

        Trainee trainee = new Trainee(id, name, bloodGroup, designation, dateOfBirth,
                gender, phoneNumber, email, traineeId, dateOfJoining, skills);

        id = employeeServiceImpl.insertTrainee(trainee);
        
        viewAllTrainee(request, response);
    }

    /**
     * 
     * shows all trainee
     * 
     * @param request, response
     * @return void
     */
    public void viewAllTrainee(HttpServletRequest request, HttpServletResponse response) {
        List<Trainee> trainees = employeeServiceImpl.viewAllTrainee();
        request.setAttribute("traineeList", trainees);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewTrainees.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    
    /**
     * 
     * update trainee by id
     * 
     * @param request, response
     * @return void
     */
    public void updateTraineeById(HttpServletRequest request, HttpServletResponse response) {

        String stringId = request.getParameter("id");
        int id = Integer.parseInt(stringId);

        String name = request.getParameter("name");
        String bloodGroup = request.getParameter("bloodGroup");

        String date = request.getParameter("dateOfBirth");
        Date dateOfBirth = Date.valueOf(date);

        String designation = request.getParameter("designation");

        String gender = request.getParameter("gender");

        String number = request.getParameter("phoneNumber");
        long phoneNumber = Long.parseLong(number);

        String email = request.getParameter("email");

        String traineeId = "0";

        date = request.getParameter("dateOfJoining");
        Date dateOfJoining = Date.valueOf(date);

        Set<Skill> skills = new HashSet<Skill>();

        Skill skillOne = new Skill();
        
        skillOne.setTraineeId(traineeId);

        skillOne.setSkillName(request.getParameter("skillName1"));

        String expirenece = request.getParameter("skillExperience1");
        skillOne.setSkillExperience(Float.valueOf(expirenece));

        skillOne.setSkillVersion(request.getParameter("skillVersion1"));

        skillOne.setSkillCertification(request.getParameter("skillCertification1"));

        skills.add(skillOne);
        
        Skill skillTwo = new Skill();

        skillTwo.setTraineeId(traineeId);

        skillTwo.setSkillName(request.getParameter("skillName2"));

        expirenece = request.getParameter("skillExperience2");
        skillTwo.setSkillExperience(Float.valueOf(expirenece));

        skillTwo.setSkillVersion(request.getParameter("skillVersion2"));

        skillTwo.setSkillCertification(request.getParameter("skillCertification2"));

        skills.add(skillTwo);

        Trainee trainee = new Trainee(id, name, bloodGroup, designation, dateOfBirth,
                gender, phoneNumber, email, traineeId, dateOfJoining, skills);
        
        employeeServiceImpl.updateTraineeById(trainee);
        
        try {
            response.sendRedirect("http://localhost:8080/EmployeeManagement/TraineeController?flag=viewTrainees");
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }

    /**
     * 
     * delete trainee
     * 
     * @param request, response
     * @return void
     */
    public void deleteTrainee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean isIdExist = employeeServiceImpl.deleteTraineeById(id);
        try {
            response.sendRedirect("http://localhost:8080/EmployeeManagement/TraineeController?flag=viewTrainees");
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    /**
     * 
     * get trainee by id
     * 
     * @param request, response
     * @return void
     */
    public void getTraineeById(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));
        Trainee trainee = employeeServiceImpl.getTraineeById(id);
        request.setAttribute("trainee", trainee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateTrainee.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } 
    }

}