package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.touchizen.drawerwithbottomnavigation.ui.home.HomeFragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DailyVisitorPage extends AppCompatActivity implements View.OnClickListener{


    EditText eText, eText1, eText2, name, mobilenumber, validdate, intime,outtime,vehicleno,
            selectvisitor;
    private int mYear, mMonth, mDay;
    Button addbutton;

    boolean isSelectvisitorValid,isMobilenumberValid, isNameValid,isVehicalNo;

    TimePickerDialog.OnTimeSetListener onTimeSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_visitor_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addbutton = findViewById(R.id.Add_button);

        name = findViewById(R.id.Name_visitor);
        mobilenumber = findViewById(R.id.mobile_number);
        validdate = findViewById(R.id.validdate);
        intime = findViewById(R.id.selectintime);
        outtime = findViewById(R.id.selectouttime);
        vehicleno = findViewById(R.id.vehicle_no);
        selectvisitor = findViewById(R.id.selectvisitor);

        eText=(EditText) findViewById(R.id.selectintime);
        eText1 = findViewById(R.id.selectouttime);
        eText1.setInputType(InputType.TYPE_NULL);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setFocusableInTouchMode(true);
        eText1.setFocusableInTouchMode(true);

        eText2 = findViewById(R.id.validdate);
        eText2.setOnClickListener(this);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
            }

            private void SetValidation() {

                // Check for a valid name.
                if (name.getText().toString().isEmpty()) {
                    name.setError(getResources().getString(R.string.name_error));
                    isNameValid = false;
                } else  {
                    isNameValid = true;
                }

                // Check for a valid phone number.
                if (mobilenumber.getText().toString().isEmpty()) {
                    mobilenumber.setError(getResources().getString(R.string.phone_error));
                    isMobilenumberValid = false;
                } else  {
                    isMobilenumberValid = true;
                }

                // Check for a selectvisitor.
                if (selectvisitor.getText().toString().isEmpty()) {
                    selectvisitor.setError(getResources().getString(R.string.company_visitor));
                    isSelectvisitorValid = false;
                } else  {
                    isSelectvisitorValid = true;
                }

                if (vehicleno.getText().toString().isEmpty()) {
                    vehicleno.setError(getResources().getString(R.string.vehicle_no));
                    isVehicalNo = false;
                } else  {
                    isVehicalNo = true;
                }

                if (isNameValid && isSelectvisitorValid && isVehicalNo && isMobilenumberValid) {
                    Intent i = new Intent(DailyVisitorPage.this, VisitorsCardActivity.class);
                    startActivity(i);
                    finish();
                }else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Details", Toast.LENGTH_SHORT).show();
                }

            }
        });


        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(DailyVisitorPage.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                eText.setText(sHour + ":" + sMinute);
                            }
                        }, hour, minutes, true);
                timePickerDialog.show();
            }
        });
        eText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(DailyVisitorPage.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                eText1.setText(sHour + ":" + sMinute);
                            }
                        }, hour, minutes, true);
                timePickerDialog.show();
            }
        });


    }

    @Override
    public void onClick(View v) {

        if (v == eText2) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            eText2.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}