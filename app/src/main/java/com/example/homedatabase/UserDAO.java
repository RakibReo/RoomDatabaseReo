package com.example.homedatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;


@Dao
public interface UserDAO {


        @Insert
        void insertUser(User user);

        @Update
        void updateUser(User user);

        @Delete
        void deleteUser(User user);



}
