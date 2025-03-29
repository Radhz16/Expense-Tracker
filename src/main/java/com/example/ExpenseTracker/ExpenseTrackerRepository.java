package com.example.ExpenseTracker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseTrackerRepository extends JpaRepository<ExpenseTracker,Long> {
}
