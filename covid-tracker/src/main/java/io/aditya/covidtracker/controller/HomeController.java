package io.aditya.covidtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.aditya.covidtracker.model.LocationStats;
import io.aditya.covidtracker.service.CovidCasesService;

@Controller
public class HomeController {

    @Autowired
    CovidCasesService covidCasesService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> stats = covidCasesService.getAllList();
        
        model.addAttribute("locationStats", stats);

        long totalCases = stats.stream().mapToLong(stat->stat.getLatestTotalCases()).sum();
        long totalNewCases = stats.stream().mapToLong(stat->stat.getDiffFromPrevDay()).sum();
        model.addAttribute("totalCases", totalCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "index";
    }
    
}
