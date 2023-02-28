package com.example.homedatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.homedatabase.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        UserDatabase db = Room.databaseBuilder(
                        getApplicationContext(),
                        UserDatabase.class, "KR_database").allowMainThreadQueries()           //it's use for don't crush
                .build();


        User user=new User();
        user.setName("SuRa");
        user.setMobile("01738074130");
        user.setAge("47");
        user.setGender("FM");

        //db.getDao().insertUser(user);


        binding.submitBtn.setOnClickListener(v -> {



            db.getDao().insertUser(user);



        });




    }
}