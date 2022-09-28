package com.project.fleetmanagement.state;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StateService {

    private final StateRepository stateRepository;

    public List<State> getStates() {
        return stateRepository.findAll();
    }

    public State getStateById(Long stateId) {
        return stateRepository.findById(stateId).orElseThrow(() -> new RuntimeException(String.format("Country with id %s not found", stateId)));
    }

    public State saveState(State state) {
        return stateRepository.save(state);
    }

    public void deleteStateById(Long stateId) {
        stateRepository.deleteById(stateId);
    }
}
