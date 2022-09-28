package com.project.fleetmanagement.country;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(Long countryId) {
        return countryRepository.findById(countryId).orElseThrow(() -> new RuntimeException(String.format("Country with id %s not found", countryId)));
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountryById(Long countryId) {
        countryRepository.deleteById(countryId);
    }
}
