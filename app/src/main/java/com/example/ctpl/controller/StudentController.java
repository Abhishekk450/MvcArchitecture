package com.example.ctpl.controller;

import com.example.ctpl.model.StudentModel;
import com.example.ctpl.view.MainActivity;

import java.sql.SQLTransactionRollbackException;

public class StudentController {

    private StudentModel studentModel;
    private MainActivity mainActivity;

    public StudentController(StudentModel model, MainActivity view) {
        this.studentModel = model;
        this.mainActivity = view;
    }

   public void setStudentName(String name) {
        studentModel.setName(name);
   }

    public String getName() {
        return studentModel.getName();
    }

   public void setStudentRollNo(String rollNo) {
        studentModel.setRollNo(rollNo);
   }

   public String getStudentRollNo() {
       return studentModel.getRollNo();
   }

    public void updateView() {
        mainActivity.printStudentDetails(studentModel.getName(),studentModel.getRollNo());
    }
}
