package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView mobile, email, address, award, skill, language, interest, fname, lname, profession, about_yourself, college, degree, about_college,company_name,post,about_company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        mobile = findViewById(R.id.mobile3);
        email = findViewById(R.id.email3);
        address = findViewById(R.id.address3);
        award = findViewById(R.id.awards3);
        skill = findViewById(R.id.skill3);
        language = findViewById(R.id.language3);
        interest = findViewById(R.id.interest3);
        fname = findViewById(R.id.fname3);
        lname = findViewById(R.id.lname3);
        profession = findViewById(R.id.profession3);
        about_yourself = findViewById(R.id.about_yourself3);
        college = findViewById(R.id.college3);
        degree = findViewById(R.id.degree3);
        about_college = findViewById(R.id.about_college3);
        company_name = findViewById(R.id.company_name3);
        post = findViewById(R.id.post3);
        about_company = findViewById(R.id.about_company3);


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
        mobile.setText("" + Contact);
        language.setText("" + Language);
        college.setText("" + College);
        degree.setText("" + Degree);
        interest.setText("" + Interest);
        skill.setText("" + Skill);
        about_yourself.setText("" + About_yourself);
        about_college.setText("" + About_college);
        company_name.setText("" + Company_name);
        post.setText("" + Post);
        about_company.setText("" + About_company);
        profession.setText("" + Profession);
        award.setText("" + Awards);


    }
}