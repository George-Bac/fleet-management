package com.project.fleetmanagement.state;

import com.project.fleetmanagement.country.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/states")
@RequiredArgsConstructor
public class StateController {

    private final StateService stateService;
    private final CountryService countryService;

    @GetMapping
    public String getStates(Model model) {
        model.addAttribute("states", stateService.getStates());
        model.addAttribute("countries", countryService.getCountries());
        return "entity/state";
    }

    @RequestMapping("/{stateId}")
    @ResponseBody
    public State getStateById(@PathVariable Long stateId) {
        return stateService.getStateById(stateId);
    }

    @PostMapping("/save-state")
    public String saveCountryForm(@ModelAttribute State state) {
        stateService.saveState(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/update-state", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateStateForm(@ModelAttribute State state) {
        stateService.saveState(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/delete-state/{stateId}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String confirmDeleteModal(@PathVariable Long stateId) {
        stateService.deleteStateById(stateId);
        return "redirect:/states";
    }
}
