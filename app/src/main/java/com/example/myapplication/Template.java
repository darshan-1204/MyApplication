package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Template extends AppCompatActivity {

    ImageView template1, template2, template3, template4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        template1 = findViewById(R.id.t1);
        template2 = findViewById(R.id.t2);
        template3 = findViewById(R.id.t3);
        template4 = findViewById(R.id.t4);


        String fname = getIntent().getStringExtra("Fname");
        String lname = getIntent().getStringExtra("Lname");
        String dob = getIntent().getStringExtra("dob");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String contact = getIntent().getStringExtra("contact");
        String nation = getIntent().getStringExtra("nation");
        String language = getIntent().getStringExtra("language");
        String college = getIntent().getStringExtra("college");
        String degree = getIntent().getStringExtra("degree");
        String interest = getIntent().getStringExtra("interest");
        String skill = getIntent().getStringExtra("skill");
        String others = getIntent().getStringExtra("other");
        String about_yourself = getIntent().getStringExtra("about_yourself");
        String Company_name = getIntent().getStringExtra("company_name");
        String Post = getIntent().getStringExtra("post");
        String About_company = getIntent().getStringExtra("about_company");
        String About_college = getIntent().getStringExtra("about_college");
        String Awards = getIntent().getStringExtra("awards");
        String Profession = getIntent().getStringExtra("profession");


        template1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Template.this, SecondaryActivity.class);
                intent.putExtra("Fname", fname);
                intent.putExtra("Lname", lname);
                intent.putExtra("dob", dob);
                intent.putExtra("address", address);
                intent.putExtra("email", email);
                intent.putExtra("contact", contact);
                intent.putExtra("language", language);
                intent.putExtra("interest", interest);
                intent.putExtra("college", college);
                intent.putExtra("degree", degree);
                intent.putExtra("skill", skill);
                intent.putExtra("post", Post);
                intent.putExtra("company_name", Company_name);
                intent.putExtra("about_yourself", about_yourself);
                intent.putExtra("about_college", About_college);
                intent.putExtra("about_company", About_company);
                intent.putExtra("awards", Awards);
                intent.putExtra("profession", Profession);
                startActivity(intent);
            }
        });

        template2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Template.this, ThirdActivity.class);
                intent.putExtra("Fname", fname);
                intent.putExtra("Lname", lname);
                intent.putExtra("dob", dob);
                intent.putExtra("address", address);
                intent.putExtra("email", email);
                intent.putExtra("contact", contact);
                intent.putExtra("nation", nation);
                intent.putExtra("language", language);
                intent.putExtra("interest", interest);
                intent.putExtra("college", college);
                intent.putExtra("degree", degree);
                intent.putExtra("skill", skill);
                intent.putExtra("other", others);
                intent.putExtra("company_name", Company_name);
                intent.putExtra("about_yourself", about_yourself);
                intent.putExtra("about_college", About_college);
                intent.putExtra("about_company", About_company);
                intent.putExtra("post", Post);
                intent.putExtra("awards", Awards);
                intent.putExtra("profession", Profession);
                startActivity(intent);
            }
        });
        template3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Template.this, FourthActivity.class);
                intent.putExtra("Fname", fname);
                intent.putExtra("Lname", lname);
                intent.putExtra("dob", dob);
                intent.putExtra("address", address);
                intent.putExtra("email", email);
                intent.putExtra("contact", contact);
                intent.putExtra("nation", nation);
                intent.putExtra("language", language);
                intent.putExtra("interest", interest);
                intent.putExtra("college", college);
                intent.putExtra("degree", degree);
                intent.putExtra("skill", skill);
                intent.putExtra("other", others);
                intent.putExtra("company_name", Company_name);
                intent.putExtra("post", Post);
                intent.putExtra("about_yourself", about_yourself);
                intent.putExtra("about_college", About_college);
                intent.putExtra("about_company", About_company);
                intent.putExtra("awards", Awards);
                intent.putExtra("profession", Profession);
                startActivity(intent);
            }
        });
        template4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Template.this, FifthActivity.class);
                intent.putExtra("Fname", fname);
                intent.putExtra("Lname", lname);
                intent.putExtra("dob", dob);
                intent.putExtra("address", address);
                intent.putExtra("email", email);
                intent.putExtra("contact", contact);
                intent.putExtra("nation", nation);
                intent.putExtra("language", language);
                intent.putExtra("interest", interest);
                intent.putExtra("college", college);
                intent.putExtra("degree", degree);
                intent.putExtra("skill", skill);
                intent.putExtra("other", others);
                intent.putExtra("company_name", Company_name);
                intent.putExtra("post", Post);
                intent.putExtra("about_yourself", about_yourself);
                intent.putExtra("about_college", About_college);
                intent.putExtra("about_company", About_company);
                intent.putExtra("awards", Awards);
                intent.putExtra("profession", Profession);
                startActivity(intent);
            }
        });
    }
}