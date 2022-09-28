package com.project.fleetmanagement.job_title;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobTitleService {

    private final JobTitleRepository jobTitleRepository;

    public List<JobTitle> getJobTitles() {
        return jobTitleRepository.findAll();
    }

    public JobTitle getJobTitleById(Long jobTitleId) {
        return jobTitleRepository.findById(jobTitleId).orElseThrow(() -> new RuntimeException(String.format("Job title with id %s not found", jobTitleId)));
    }

    public JobTitle saveJobTitle(JobTitle jobTitle) {
        return jobTitleRepository.save(jobTitle);
    }

    public void deleteJobTitleById(Long jobTitleId) {
        jobTitleRepository.deleteById(jobTitleId);
    }
}
