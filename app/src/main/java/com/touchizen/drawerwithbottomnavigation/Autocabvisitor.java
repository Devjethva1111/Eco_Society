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

public class Autocabvisitor extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{


    EditText eText, eText1,name, mobilenumber, vehicleno, selectvisitor;
    private int mYear, mMonth, mDay;
    Button button;
    boolean isSelectvisitorValid,isMobilenumberValid, isNameValid,isVehicalNo;
    String[] hours = { "1 hour", "2 hour", "4 hour", "8 hour", "12 hour","24 hour","48 hour"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocabvisitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        name = findViewById(R.id.cab_driver_name);
        mobilenumber = findViewById(R.id.mobile_number);
        vehicleno = findViewById(R.id.vehicle_no);
        selectvisitor = findViewById(R.id.company_name);
        button= findViewById(R.id.Add_data);

        eText = findViewById(R.id.date);
        eText1 = findViewById(R.id.Time);

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
                    Intent i = new Intent(Autocabvisitor.this, VisitorsCardActivity.class);
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


                    DatePickerDialog datePickerDialog = new DatePickerDialog(Autocabvisitor.this,
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
                TimePickerDialog timePickerDialog = new TimePickerDialog(Autocabvisitor.this,
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