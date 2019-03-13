package ahmed.co.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputNames, inputEmails, inputPassword, inputDob, inputPhone;
    RadioButton radioMale, radioFemale;
    CheckBox checkBoxTerms;
    Button buttonSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNames = findViewById(R.id.inputName);
        inputEmails = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputDob = findViewById(R.id.inputDob);
        inputPhone = findViewById(R.id.inputPhone);
        radioFemale = findViewById(R.id.radioFemale);
        radioMale = findViewById(R.id.radioMale);
        checkBoxTerms = findViewById(R.id.checkBoxTerms);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setEnabled(false);

        //listener
        checkBoxTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    buttonSubmit.setEnabled(true);
                } else {
                    buttonSubmit.setEnabled(false);
                }
            }

        });
    }







    public void register(View view) {
        String names = inputNames.getText().toString().trim();
        String email = inputEmails.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();
        String Dob = inputDob.getText().toString().trim();
        String Phone = inputPhone.getText().toString().trim();

        String gender = radioFemale.isChecked() ? "female" : "male";

        String data = names +" "+email +" "+gender +" "+password;

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();


    }
}
