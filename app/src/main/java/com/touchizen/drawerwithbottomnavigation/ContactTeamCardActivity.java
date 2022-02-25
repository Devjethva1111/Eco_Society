package com.touchizen.drawerwithbottomnavigation;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.HashMap;

public class ContactTeamCardActivity extends AppCompatActivity {

    TextView Tecket_Attach;
    Uri URI = null;
    Button sbmitbutton;
    private static final int PICK_FROM_GALLERY = 101;
    private Toolbar toolbar;
    CardView first_card, second_card,third_card, shareapp, setting;
    boolean isNameValid,isDescriptionValid,isAttachmentValid;
    EditText eText, eText2,eText3;

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
//    private DatabaseReference root = db.getReference().push().child("Contact Team");
    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().push().child("contact");


    @SuppressLint("WrongViewCast")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_team_card);
        toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sbmitbutton = findViewById(R.id.sbmitbutton);
        setting = findViewById(R.id.setting_app);
        eText =findViewById(R.id.subject);
        eText2 = findViewById(R.id.addtext);
        first_card =findViewById(R.id.first_card);
        second_card =findViewById(R.id.second_card);
        third_card =findViewById(R.id.third_card);
        shareapp = findViewById(R.id.share_app);
        Tecket_Attach = (TextView)findViewById(R.id.Feedback_Attach);

//        databaseReference = FirebaseDatabase.getInstance().getReference().child("user01");

        shareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                String app_url = " https://play.google.com/store/apps/details?id=my.example.javatpoint";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactTeamCardActivity.this , SettingActivity.class);
                startActivity(i);

            }
        });

        sbmitbutton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                SetValidation();

                if (eText.getText().toString().isEmpty()) {
                    eText.setError(getResources().getString(R.string.name_error));
                    isNameValid = false;
                } else  {
                    isNameValid = true;
                }

                if (eText2.getText().toString().isEmpty()) {
                    eText2.setError(getResources().getString(R.string.description_name_error));
                    isDescriptionValid = false;
                } else  {
                    isDescriptionValid = true;
                }

                if (Tecket_Attach.getText().toString().isEmpty()) {
                    Tecket_Attach.setError(getResources().getString(R.string.attach_ment));
                    isAttachmentValid = false;
                } else  {
                    isAttachmentValid = true;
                }
                if (isNameValid && isDescriptionValid && isAttachmentValid) {
                    // for store subject and description
                    String desc = eText2.getText().toString();
                    String subject = eText.getText().toString();
                    String url = Tecket_Attach.getText().toString();
                    HashMap<String, String> usermap = new HashMap<>();
                    usermap.put("Subject", subject);
                    usermap.put("Description", desc);
                    databaseReference.push().setValue(usermap);


                    Intent i = new Intent(ContactTeamCardActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Details", Toast.LENGTH_SHORT).show();
                }




            }


            private void SetValidation() {

//                if (eText.getText().toString().isEmpty()) {
//                    eText.setError(getResources().getString(R.string.name_error));
//                    isNameValid = false;
//                } else  {
//                    isNameValid = true;
//                }
//
//                if (eText2.getText().toString().isEmpty()) {
//                    eText2.setError(getResources().getString(R.string.description_name_error));
//                    isDescriptionValid = false;
//                } else  {
//                    isDescriptionValid = true;
//                }
//
//                if (Tecket_Attach.getText().toString().isEmpty()) {
//                    Tecket_Attach.setError(getResources().getString(R.string.attach_ment));
//                    isAttachmentValid = false;
//                } else  {
//                    isAttachmentValid = true;
//                }
//                if (isNameValid && isDescriptionValid && isAttachmentValid) {
//                    Intent i = new Intent(ContactTeamCardActivity.this, MainActivity.class);
//                    startActivity(i);
//                    finish();
//                }else
//                {
//                    Toast.makeText(getApplicationContext(), "Invalid Details", Toast.LENGTH_SHORT).show();
//                }
            }
        });

        first_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91 8849768307"));
                startActivity(intent);
            }
        });

        second_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91 7096345713"));
                startActivity(intent);
            }
        });

        third_card.setOnClickListener(new View.OnClickListener() {
            private String storyPubDate;

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "infofincasys2022@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                startActivity(intent);

            }
        });


        Tecket_Attach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for store files on firebase
                Intent submitintent = new Intent(Intent.ACTION_GET_CONTENT);
                submitintent.setType("*/*");
                startActivityForResult(submitintent, PICK_FROM_GALLERY);

            }



        });
    }

    @Override   // for upload file on firebase
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_FROM_GALLERY){
            if (resultCode == RESULT_OK){


                Uri FileUri = data.getData();
                StorageReference folder = FirebaseStorage.getInstance().getReference().child("Contact Attachment");
                StorageReference file_name = folder.child("Contact Attachment"+ FileUri.getLastPathSegment());
                file_name.putFile(FileUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        file_name.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {

                                HashMap<String, String> hashMap = new HashMap<>();
                                hashMap.put("filelink", String.valueOf(uri));
                                databaseReference.push().setValue(hashMap);
                                Toast.makeText(ContactTeamCardActivity.this, "File Uploaded", Toast.LENGTH_SHORT).show();

                            }
                        });

                    }
                });

            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}