package com.project.fleetmanagement.job_title;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/job-titles")
@RequiredArgsConstructor
public class JobTitleController {

    private final JobTitleService jobTitleService;

    @GetMapping
    public String getJobTitles() {
        return "entity/job-title";
    }
}
