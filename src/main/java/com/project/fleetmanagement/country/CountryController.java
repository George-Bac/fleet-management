package com.project.fleetmanagement.country;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public String getCountries(Model model) {
        model.addAttribute("countries", countryService.getCountries());
        return "country";
    }

    @PostMapping("/save-country")
    public String saveCountryForm(@ModelAttribute Country country) {
        countryService.saveCountry(country);
        return "redirect:/countries";
    }
}
