package com.siva.expensetrackerapi.service;

import java.util.List;

import com.siva.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	
	public List<Expense> getAllExpenses();
	
	public Expense getExpenseById(Long id);
}