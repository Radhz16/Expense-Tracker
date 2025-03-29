package com.example.ExpenseTracker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/exp")
public class ExpenseTrackerController {

    @Autowired
    private ExpenseTrackerService expenseTrackerService;

    @GetMapping
    public List<ExpenseTracker> getAll(){
        return expenseTrackerService.getAll();
    }

    @GetMapping("/{user}")
    public Optional<ExpenseTracker> getByid(@PathVariable Long user){
        return expenseTrackerService.getById(user);
    }
    @PostMapping
    public ExpenseTracker create(@RequestBody ExpenseTracker expenseTracker){
        return expenseTrackerService.create(expenseTracker);
    }
    @PutMapping("/{user}")
    public ExpenseTracker update(@PathVariable Long user,@RequestBody ExpenseTracker expenseTracker){
        return  expenseTrackerService.update(user,expenseTracker);

    }
    @DeleteMapping("/{user}")
    public void  delete(@PathVariable  Long user){
        expenseTrackerService.delete(user);
    }
}
