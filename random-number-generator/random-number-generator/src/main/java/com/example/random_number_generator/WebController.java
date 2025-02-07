package com.example.random_number_generator;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {

  @GetMapping("/")
  public String showForm(RandomNumber randomNumber) {
    return "form";
  }

  @PostMapping("/")
  public String generateRandomNumber(@Valid RandomNumber randomNumber, BindingResult bindingResults, Model model) {
    if (bindingResults.hasErrors()) {
      return "form";
    }

    if (randomNumber.getMin() > randomNumber.getMax()) {
      bindingResults.rejectValue("min", "error.min", "Min must be less than max");
      return "form";
    }
    Random random = new Random();
    int randomNum = random.nextInt(randomNumber.getMax() - randomNumber.getMin() + 1) + randomNumber.getMin();

    model.addAttribute("randomNum", randomNum);

    return "form";

  }
}
