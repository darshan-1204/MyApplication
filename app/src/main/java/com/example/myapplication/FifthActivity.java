package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    TextView mobile, email, address, award, skill, language, interest, fname, lname, profession,  college, degree, about_college,company_name,post,about_company;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        mobile = findViewById(R.id.mobile4);
        email = findViewById(R.id.email4);
        address = findViewById(R.id.address4);
        award = findViewById(R.id.awards4);
        skill = findViewById(R.id.skill4);
        language = findViewById(R.id.languages4);
        interest = findViewById(R.id.interest4);
        fname = findViewById(R.id.fname4);
        lname = findViewById(R.id.lname4);
        profession = findViewById(R.id.profession4);
        college = findViewById(R.id.college4);
        degree = findViewById(R.id.degree4);
        about_college = findViewById(R.id.about_college4);
        company_name = findViewById(R.id.company_name4);
        post = findViewById(R.id.post4);
        about_company = findViewById(R.id.about_company4);


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
        mobile.setText("" + Contact);
        language.setText("" + Language);
        college.setText("" + College);
        degree.setText("" + Degree);
        interest.setText("" + Interest);
        skill.setText("" + Skill);
        about_college.setText("" + About_college);
        company_name.setText("" + Company_name);
        post.setText("" + Post);
        about_company.setText("" + About_company);
        profession.setText("" + Profession);
        award.setText("" + Awards);


    }
}