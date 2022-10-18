package com.ideas2it.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import com.ideas2it.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    private Logger logger = LogManager.getLogger(EmployeeController.class);

    public void EmployeeServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String Test() {
        return "SaveTrainee";
    }
    /**
     * 
     * directs to trainee form
     * 
     * @param model
     * @return SaveTrainee
     */
    @RequestMapping("/SaveTrainee")
    public String TraineeForm(Model model) {
        model.addAttribute("command", new Trainee());
        return ("SaveTrainee");
    }

    /**
     * 
     * add trainee details to trainee object
     * 
     * @param trainee
     * @return redirect:/viewTrainees
     */
    @RequestMapping(value = "/insertTrainee", method = RequestMethod.POST)
    public String insertTrainer(@ModelAttribute("trainee") Trainee trainee) {

        int id = employeeService.insertTrainee(trainee);
        return ("redirect:/viewTrainees");
    }

    /**
     * 
     * shows all trainers
     * 
     * @param model
     * @return viewTrainees
     */
    @RequestMapping("/viewTrainees")
    public String viewTrainees(Model model) {
        List<Trainee> trainees = employeeService.viewAllTrainee();
        model.addAttribute("traineeList", trainees);
        return ("viewTrainees");
    }

    /**
     * 
     * update trainee by id
     * 
     * @param trainee
     * @return redirect:/viewTrainees
     */
    @RequestMapping(value = "/updateTraineeById/{id}", method = RequestMethod.POST)
    public String updateTraineeById(@ModelAttribute("trainee") Trainee trainee) {
        employeeService.updateTraineeById(trainee);
        return ("redirect:/viewTrainees");
    }

    /**
     * 
     * delete trainee by id
     * 
     * @param id
     * @return redirect:/viewTrainees
     */
    @RequestMapping("/deleteTraineeById/{id}")
    public String deleteTraineeById(@PathVariable int id) {
        boolean isIdExist = employeeService.deleteTraineeById(id);
        return ("redirect:/viewTrainees");
    }

    /**
     * 
     * get trainee by id
     * 
     * @param id, model
     * @return UpdateTrainee
     */
    @RequestMapping(value = "/getTraineeById/{id}")
    public String getTraineeById(@PathVariable int id, Model model) {
        Trainee trainee = employeeService.getTraineeById(id);
        model.addAttribute("command", trainee);
        return ("UpdateTrainee");
    }

    /**
     * 
     * directs to trainer form
     * 
     * @param model
     * @return trainerForm
     */
    @RequestMapping("/SaveTrainer")
    public String TrainerForm(Model model) {
        model.addAttribute("command", new Trainer());
        return ("SaveTrainer");
    }

    /**
     * 
     * add trainer details to trainer object
     * 
     * @param trainer
     * @return redirect:/viewTrainers
     */
    @RequestMapping(value = "/insertTrainer", method = RequestMethod.POST)
    public String insertTrainer(@ModelAttribute("trainer") Trainer trainer) {

        int id = employeeService.insertTrainer(trainer);
        return ("redirect:/viewTrainers");
    }

    /**
     * 
     * shows all trainers
     * 
     * @param model
     * @return viewTrainers
     */
    @RequestMapping("/viewTrainers")
    public String viewTrainers(Model model) {
        List<Trainer> trainers = employeeService.viewAllTrainer();
        model.addAttribute("trainerList", trainers);
        return ("viewTrainers");
    }

    /**
     * 
     * update trainer
     * 
     * @param trainer
     * @return redirect:/viewTrainers
     */
    @RequestMapping(value = "/updateTrainerById/{id}", method = RequestMethod.POST)
    public String updateTrainerById(@ModelAttribute("trainer") Trainer trainer) {
        employeeService.updateTrainerById(trainer);
        return ("redirect:/viewTrainers");
    }

    /**
     * 
     * delete trainer
     * 
     * @param id
     * @return redirect:/viewTrainers
     */
    @RequestMapping("/deleteTrainerById/{id}")
    public String deleteTrainerById(@PathVariable int id) {
        boolean isIdExist = employeeService.deleteTrainerById(id);
        return ("redirect:/viewTrainers");
    }

    /**
     * 
     * get trainer by id
     * 
     * @param id, model
     * @return UpdateTrainer
     */
    @RequestMapping(value = "/getTrainerById/{id}")
    public String getTrainerById(@PathVariable int id, Model model) {
        Trainer trainer = employeeService.getTrainerById(id);
        model.addAttribute("command", trainer);
        return ("UpdateTrainer");
    }
}
