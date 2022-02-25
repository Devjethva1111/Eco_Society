package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class  ExceptedVisitor extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {


    EditText eText, eText1, name, mobilenumber, no_of_visitor, visiting_perpose;
    private int mYear, mMonth, mDay;
    Button button;
    String[] hours = { "1 hour", "2 hour", "4 hour", "8 hour", "12 hour","24 hour","48 hour"};
    boolean isNoofvisitor,isMobilenumberValid, isNameValid,isperpose;

    TimePickerDialog.OnTimeSetListener onTimeSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excepted_visitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        eText = findViewById(R.id.visiting_date);
        eText1 = findViewById(R.id.visiting_Time);

        name = findViewById(R.id.visitor_name);
        mobilenumber = findViewById(R.id.mobile_number);
        no_of_visitor = findViewById(R.id.no_of_visitor);
        visiting_perpose = findViewById(R.id.visiting_purpose);
        button = findViewById(R.id.guest_add);


        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,hours);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        eText1.setInputType(InputType.TYPE_NULL);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
            }

            private void SetValidation() {

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

                // Check for a noofvisitor.
                if (no_of_visitor.getText().toString().isEmpty()) {
                    no_of_visitor.setError(getResources().getString(R.string.no_of_visitor));
                    isNoofvisitor = false;
                } else  {
                    isNoofvisitor = true;
                }

                // Check for a perpose.
                if (visiting_perpose.getText().toString().isEmpty()) {
                    visiting_perpose.setError(getResources().getString(R.string.visitor_perpose));
                    isperpose = false;
                } else  {
                    isperpose = true;
                }

                if (isNameValid && isperpose && isNoofvisitor && isMobilenumberValid) {
                    Intent i = new Intent(ExceptedVisitor.this, VisitorsCardActivity.class);
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
                if (v == eText) {

                    // Get Current Date
                    final Calendar c = Calendar.getInstance();
                    mYear = c.get(Calendar.YEAR);
                    mMonth = c.get(Calendar.MONTH);
                    mDay = c.get(Calendar.DAY_OF_MONTH);


                    DatePickerDialog datePickerDialog = new DatePickerDialog(ExceptedVisitor.this,
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {

                                    eText.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                                }
                            }, mYear, mMonth, mDay);
                    datePickerDialog.show();
                }
            }
        });

        eText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(ExceptedVisitor.this,
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
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),hours[position] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}