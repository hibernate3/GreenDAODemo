package com.example.greendaodemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.greendaodemo.R;
import com.example.greendaodemo.entity.User;
import com.example.greendaodemo.manager.DBManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBManager dbManager = DBManager.getInstance(this);
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId((long) i);
            user.setAge(i * 3);
            user.setName("第" + i + "人");
            dbManager.insertUser(user);
        }
        List<User> userList = dbManager.queryUserList();
        for (User user : userList) {
            Log.e("TAG", "queryUserList--before-->" + user.getId() + "--" + user.getName() +"--"+user.getAge());
            if (user.getId() == 0) {
                dbManager.deleteUser(user);
            }
            if (user.getId() == 3) {
                user.setAge(10);
                dbManager.updateUser(user);
            }
        }
        userList = dbManager.queryUserList();
        for (User user : userList) {
            Log.e("TAG", "queryUserList--after--->" + user.getId() + "---" + user.getName()+"--"+user.getAge());
        }
    }
}
