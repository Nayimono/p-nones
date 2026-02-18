package com.pnones.flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowController {

    @GetMapping("/api/flows")
    public String flows() {
        return "P-NONES Flow API (initial)";
    }
}
