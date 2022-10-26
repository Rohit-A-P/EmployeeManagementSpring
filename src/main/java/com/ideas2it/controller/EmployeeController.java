package com.ideas2it.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ideas2it.model.Skill;
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
        Set<Skill> skills = new HashSet<Skill>();
        skills.add(skill);
        trainee.setSkills(skills);
        employeeService.updateTraineeById(trainee);
        return ("redirect:/ViewTrainees");
    }

    /**
     * shows all trainers
     *
     * @return ViewTrainees
     */
    @RequestMapping("/ViewTrainees")
    public ModelAndView viewTrainees() {
        List<Trainee> trainees = employeeService.viewAllTrainee();
        List<Integer> ageList = new ArrayList<Integer>();
        for(Trainee trainee : trainees) {
            ageList.add(employeeService.calculateAge(trainee.getDateOfBirth()));
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("traineeList", trainees);
        modelAndView.addObject("ageList", ageList);
        modelAndView.setViewName("ViewTrainees");
        return modelAndView;
    }

    /**
     * update trainee by id
     *
     * @param trainee passing trainee object to update
     * @return redirect:/ViewTrainees
     */
    @RequestMapping("/UpdateTraineeById")
    public String updateTraineeById(@ModelAttribute("trainee") Trainee trainee) {
        Trainee traineeOld = employeeService.getTraineeById(trainee.getId());
        Set<Skill> skills = traineeOld.getSkills();
        trainee.setSkills(skills);
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
     * @return UpdateTrainee
     */
    @RequestMapping(value = "/getTraineeById")
    public ModelAndView getTraineeById(@RequestParam int id) {
        Trainee trainee = employeeService.getTraineeById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("trainee", trainee);
        modelAndView.setViewName("UpdateTrainee");
        return modelAndView;
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
    public ModelAndView viewTrainers() {
        List<Trainer> trainers = employeeService.viewAllTrainer();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("trainerList", trainers);
        List<Integer> ageList = new ArrayList<Integer>();
        for(Trainer trainer : trainers) {
            ageList.add(employeeService.calculateAge(trainer.getDateOfBirth()));
        }
        modelAndView.addObject("ageList", ageList);
        modelAndView.setViewName("ViewTrainers");
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
        employeeService.updateTrainerById(trainer);
        return ("redirect:/ViewTrainers");
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
        return modelAndView;
    }
}