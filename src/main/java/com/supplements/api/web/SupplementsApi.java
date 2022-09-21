package com.supplements.api.web;

import com.supplements.api.model.Supplement;
import com.supplements.api.service.SupplementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("supplement")
public class SupplementsApi {
    @GetMapping
    public ResponseEntity<List<Supplement>> getAll(){
        return ResponseEntity.ok(SupplementService.getAll());
    }
}
