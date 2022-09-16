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
}
