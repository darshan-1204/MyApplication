package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    EditText edt_Fname, edt_Lname, edt_dob, edt_address, edt_email, edt_contact,edt_profession, edt_language, edt_interest,edt_about_yourself,edt_about_college;
    EditText edt_college, edt_degree, edt_skill, edt_other,edt_awards;
    EditText edt_company_name,edt_post,edt_about_company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Fname = findViewById(R.id.edt_Fname);
        edt_Lname = findViewById(R.id.edt_Lname);
        edt_dob = findViewById(R.id.edt_dob);
        edt_address = findViewById(R.id.edt_address);
        edt_email = findViewById(R.id.edt_email);
        edt_contact = findViewById(R.id.edt_contact);
        edt_language = findViewById(R.id.edt_language);
        edt_interest = findViewById(R.id.edt_interest);
        edt_college = findViewById(R.id.edt_college);
        edt_degree = findViewById(R.id.edt_degree);
        edt_skill = findViewById(R.id.edt_skill);
        edt_profession = findViewById(R.id.designation);
        edt_about_yourself = findViewById(R.id.about);
        edt_about_college = findViewById(R.id.edt_about_college);
        edt_awards = findViewById(R.id.edt_awards);
        edt_company_name = findViewById(R.id.edt_company_name);
        edt_post = findViewById(R.id.edt_post);
        edt_about_company = findViewById(R.id.edt_about_company);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Fname = edt_Fname.getText().toString();
                String Lname = edt_Lname.getText().toString();
                String dob = edt_dob.getText().toString();
                String Address = edt_address.getText().toString();
                String Email = edt_email.getText().toString();
                String Contact = edt_contact.getText().toString();
                String Language = edt_language.getText().toString();
                String Interest = edt_interest.getText().toString();
                String College = edt_college.getText().toString();
                String Degree = edt_degree.getText().toString();
                String Skill = edt_skill.getText().toString();
                String about_yourself = edt_about_yourself.getText().toString();
                String about_college = edt_about_college.getText().toString();
                String awards = edt_awards.getText().toString();
                String Profession = edt_profession.getText().toString();
                String Company_name = edt_company_name.getText().toString();
                String Post = edt_post.getText().toString();
                String About_company = edt_about_company.getText().toString();


                Intent intent = new Intent(MainActivity.this, Template.class);
                intent.putExtra("Fname", Fname);
                intent.putExtra("Lname", Lname);
                intent.putExtra("dob", dob);
                intent.putExtra("address", Address);
                intent.putExtra("email", Email);
                intent.putExtra("contact", Contact);
                intent.putExtra("language", Language);
                intent.putExtra("interest", Interest);
                intent.putExtra("college", College);
                intent.putExtra("degree", Degree);
                intent.putExtra("skill", Skill);
                intent.putExtra("about_yourself", about_yourself);
                intent.putExtra("about_college", about_college);
                intent.putExtra("awards",awards);
                intent.putExtra("profession", Profession);
                intent.putExtra("company_name", Company_name);
                intent.putExtra("post", Post);
                intent.putExtra("about_company", About_company);
                startActivity(intent);
            }
        });
    }
}