package com.example.ctpl.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.ctpl.controller.StudentController;
import com.example.ctpl.model.StudentModel;
import com.example.ctpl.mvcarch.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Mvclog";

    public StudentController studentController;
    TextView tvName, tvRollNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentModel studentModel = retriveData();

        MainActivity mainActivity = new MainActivity();

        studentController = new StudentController(studentModel, mainActivity);
        studentController.updateView();

        tvName = findViewById(R.id.tv_name);
        tvRollNo = findViewById(R.id.tv_roll);

        tvName.setText(studentModel.getName());
        tvRollNo.setText(studentModel.getRollNo());
    }

    private StudentModel retriveData() {
        StudentModel model = new StudentModel();
        model.setName("William");
        model.setRollNo("20");
        return model;
    }

    public void printStudentDetails(String studentName, String studentRollNo){
        Log.d(TAG, "printStudentDetails: "+"Name: " + studentName);
        Log.d(TAG, "printStudentDetails: "+"Roll No: " + studentRollNo);
    }

    public void updateUI(View view) {

        // update model data
        studentController.setStudentName("Rusho");
        studentController.setStudentRollNo("23");
        studentController.updateView();
    }
}
