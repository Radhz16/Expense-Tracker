package com.example.ExpenseTracker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseTrackerService {

    @Autowired
    private ExpenseTrackerRepository expenseTrackerRepository;

    public List<ExpenseTracker> getAll(){
        return expenseTrackerRepository.findAll();
    }

    public Optional<ExpenseTracker> getById(Long user){
        return expenseTrackerRepository.findById(user);
    }

    public ExpenseTracker create(ExpenseTracker expenseTracker){
        return expenseTrackerRepository.save(expenseTracker);
    }

    public ExpenseTracker update(Long id,ExpenseTracker expenseTracker){
        if(expenseTrackerRepository.existsById(id)){
            expenseTracker.setUser(id);
            return expenseTrackerRepository.save(expenseTracker);

        }
        return null;
    }

    public void delete(Long user){
        System.out.println("The user is deleted");
        expenseTrackerRepository.deleteById(user);
    }




}
