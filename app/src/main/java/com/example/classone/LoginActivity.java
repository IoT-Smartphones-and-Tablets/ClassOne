package com.example.classone;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.classone.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button btn1 = findViewById(R.id.buttonLogin);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void btnPressed(View view){
        Log.d("info","button pressed!!!");

        String usernametxt = binding.username.getText().toString();
        Log.d("info","username entered: " + usernametxt);

        EditText passVal = findViewById(R.id.password);
        String passwordtxt = passVal.getText().toString();

        if (usernametxt.equals("stuardo") && passwordtxt.equals("123")){
            Log.d("info","correct!");
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Username or password incorrect", Toast.LENGTH_SHORT).show();
        }

    }

}