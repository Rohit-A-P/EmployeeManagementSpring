package com.ideas2it.controller;

import com.ideas2it.model.Skill;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import com.ideas2it.service.EmployeeService;

/**
 * EmployeeController manage EmployeeService, Employee, Trainer and Trainee Class
 *
 * @version 1.0 05-09-2022
 *
 * @author Rohit A P
 */
@Controller
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private Logger logger = LogManager.getLogger(EmployeeController.class);

    /**
     * directs to index page
     *
     * @param
     * @return index
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * directs to TraineeMenu
     *
     * @param
     * @return TraineeMenu
     */
    @RequestMapping("/TraineeMenu")
    public String traineeMenu() {
        return "TraineeMenu";
    }

    /**
     * directs to trainee form
     *
     * @param model used to create trainee object
     * @return SaveTrainee
     */
    @RequestMapping("/SaveTrainee")
    public String TraineeForm(Model model) {
        model.addAttribute("trainee", new Trainee());
        return ("SaveTrainee");
    }

    /**
     * add trainee details to trainee object
     *
     * @param trainee used to store in database
     * @return redirect:/viewTrainees
     */
    @RequestMapping(value = "/insertTrainee")
    public ModelAndView insertTrainee(@ModelAttribute("trainee") Trainee trainee) {
        int id = employeeService.insertTrainee(trainee);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("skill", new Skill());
        modelAndView.addObject("id", id);
        modelAndView.setViewName("/AddSkill");
        return modelAndView;
    }

    /**
     * add trainee skill to skill object
     *
     * @param skill used to add skill in trainee object
     * @param id used to get trainee by id
     * @return redirect:/viewTrainees
     */
    @RequestMapping(value = "/SaveSkill")
    public String addSkill(@ModelAttribute("skill") Skill skill, int id) {

        Trainee trainee = employeeService.getTraineeById(id);
        String name = trainee.getName();
        String bloodGroup = trainee.getBloodGroup();
        String dateOfBirth = trainee.getDateOfBirth();
        String designation = trainee.getDesignation();
        String gender = trainee.getGender();
        Long phoneNumber = trainee.getPhoneNumber();
        String email = trainee.getEmail();
        String traineeId = trainee.getTraineeId();
        String dateOfJoining = trainee.getDateOfJoining();
        Set<Skill> skills = new HashSet<Skill>();
        skills.add(skill);
        Trainee updateTrainee = new Trainee(id, name, bloodGroup, designation, dateOfBirth,
                gender, phoneNumber, email, traineeId, dateOfJoining, skills);
        employeeService.updateTraineeById(updateTrainee);
        return ("redirect:/viewTrainees");
    }

    /**
     * shows all trainers
     *
     * @param model to store list in model
     * @return ViewTrainees
     */
    @RequestMapping("/ViewTrainees")
    public String viewTrainees(Model model) {
        List<Trainee> trainees = employeeService.viewAllTrainee();
        model.addAttribute("traineeList", trainees);
        return ("ViewTrainees");
    }

    /**
     * update trainee by id
     *
     * @param trainee passing trainee object to update
     * @return redirect:/ViewTrainees
     */
    @RequestMapping("/updateTraineeById")
    public String updateTraineeById(@ModelAttribute("trainee") Trainee trainee) {
        employeeService.updateTraineeById(trainee);
        return ("redirect:/ViewTrainees");
    }

    /**
     * delete trainee by id
     *
     * @param id delete trainee by id
     * @return redirect:/viewTrainees
     */
    @RequestMapping("/deleteTraineeById")
    public String deleteTraineeById(@RequestParam int id) {
        boolean isIdExist = employeeService.deleteTraineeById(id);
        return ("redirect:/ViewTrainees");
    }

    /**
     * get trainee by id
     *
     * @param id get trainee by id
     * @param model is used to store trainee object
     * @return UpdateTrainee
     */
    @RequestMapping(value = "/getTraineeById")
    public String getTraineeById(@RequestParam int id, Model model) {
        Trainee trainee = employeeService.getTraineeById(id);
        model.addAttribute("trainee", trainee);
        return ("UpdateTrainee");
    }

    /**
     * directs to TrainerMenu
     *
     * @param
     * @return TrainerMenu
     */
    @RequestMapping("/TrainerMenu")
    public String trainerMenu() {
        return "TrainerMenu";
    }

    /**
     * directs to trainer form
     *
     * @param
     * @return trainerForm
     */
    @RequestMapping("/SaveTrainer")
    public ModelAndView TrainerForm() {
        System.out.print("hi");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("trainer", new Trainer());
        modelAndView.addObject("action", "insertTrainer");
        modelAndView.setViewName("SaveTrainer");
        return modelAndView;
    }

    /**
     * add trainer details to trainer object
     *
     * @param trainer used to store trainer data in database
     * @return redirect:/viewTrainers
     */
    @RequestMapping("/insertTrainer")
    public String insertTrainer(@ModelAttribute("trainer") Trainer trainer) {
        int id = employeeService.insertTrainer(trainer);
        return ("redirect:/ViewTrainers");
    }

    /**
     * shows all trainers
     *
     * @param
     * @return viewTrainers
     */
    @RequestMapping ("/ViewTrainers")
    public ModelAndView viewTrainee() {
        List<Trainer> trainers = employeeService.viewAllTrainer();
        ModelAndView modelAndView = new ModelAndView("ViewTrainers");
        modelAndView.addObject("trainerList", trainers);
        return modelAndView;
    }
    /**
     * update trainer
     *
     * @param trainer used to update trainer details
     * @return redirect:/viewTrainers
     */
    @RequestMapping("/UpdateTrainerById")
    public String updateTrainerById(@ModelAttribute("trainer") Trainer trainer) {
        System.out.print(trainer);
        employeeService.updateTrainerById(trainer);
        return ("redirect:/viewTrainers");
    }

    /**
     * delete trainer
     *
     * @param id used to delete trainer by id
     * @return redirect:/viewTrainers
     */
    @RequestMapping("/deleteTrainerById")
    public String deleteTrainerById(@RequestParam int id) {
        boolean isIdExist = employeeService.deleteTrainerById(id);
        return("redirect:/ViewTrainers");
    }

    /**
     * get trainer by id
     *
     * @param id used to get trainee by id
     * @return modelAndView
     */
    @RequestMapping(value = "/getTrainerById")
    public ModelAndView getTrainerById(@RequestParam int id) {
        Trainer trainer = employeeService.getTrainerById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("trainer", trainer);
        modelAndView.setViewName("UpdateTrainer");
        System.out.print(trainer);
        return modelAndView;
    }
}
