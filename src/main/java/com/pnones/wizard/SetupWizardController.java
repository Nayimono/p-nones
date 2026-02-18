package com.pnones.wizard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SetupWizardController {

    @GetMapping("/")
    public String wizard() {
        return "wizard";
    }
}
