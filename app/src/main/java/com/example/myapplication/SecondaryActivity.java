package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView fname, lname, phone, email, address, skill, language, interest, college, degree, about_yourself, about_college, about_company, awards, profession;
    TextView company_name, post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.emailId);
        address = findViewById(R.id.addressTv);
        skill = findViewById(R.id.skills);
        degree = findViewById(R.id.degree_tv);
        language = findViewById(R.id.languages);
        interest = findViewById(R.id.interests);
        college = findViewById(R.id.university);
        profession = findViewById(R.id.profession_tv);
        awards = findViewById(R.id.awardsText);
        about_yourself = findViewById(R.id.tv_about_yourself);
        about_college = findViewById(R.id.about_college);
        company_name = findViewById(R.id.company_name);
        post = findViewById(R.id.post);
        about_company = findViewById(R.id.about_company);


        String Fname = getIntent().getStringExtra("Fname");
        String Lname = getIntent().getStringExtra("Lname");
        String Address = getIntent().getStringExtra("address");
        String Email = getIntent().getStringExtra("email");
        String Contact = getIntent().getStringExtra("contact");
        String Language = getIntent().getStringExtra("language");
        String College = getIntent().getStringExtra("college");
        String Degree = getIntent().getStringExtra("degree");
        String Interest = getIntent().getStringExtra("interest");
        String Skill = getIntent().getStringExtra("skill");
        String About_yourself = getIntent().getStringExtra("about_yourself");
        String About_college = getIntent().getStringExtra("about_college");
        String Company_name = getIntent().getStringExtra("company_name");
        String Post = getIntent().getStringExtra("post");
        String About_company = getIntent().getStringExtra("about_company");
        String Profession = getIntent().getStringExtra("profession");
        String Awards = getIntent().getStringExtra("awards");

        fname.setText("" + Fname);
        lname.setText("" + Lname);
        address.setText("" + Address);
        email.setText("" + Email);
        phone.setText("" + Contact);
        language.setText("" + Language);
        college.setText("" + College);
        degree.setText("" + Degree);
        interest.setText("" + Interest);
        skill.setText("" + Skill);
        profession.setText("" + Profession);
        awards.setText("" + Awards);
        about_yourself.setText("" + About_yourself);
        about_college.setText("" + About_college);
        company_name.setText("" + Company_name);
        post.setText("" + Post);
        about_company.setText("" + About_company);

    }
}