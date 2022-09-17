package com.project.fleetmanagement.country;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/countries")
@RequiredArgsConstructor
@Slf4j
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public String getCountries(Model model) {
        model.addAttribute("countries", countryService.getCountries());
        return "country";
    }

    @RequestMapping("/findById/{countryId}")
    @ResponseBody
    public Country getCountryById(@PathVariable Long countryId) {
        log.info("countryId: {}", countryId);
        return countryService.getCountryById(countryId);
    }

    @PostMapping("/save-country")
    public String saveCountryForm(@ModelAttribute Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/update-country", method = {RequestMethod.PUT, RequestMethod.GET})
    public String saveUpdateForm(@ModelAttribute Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }
}
