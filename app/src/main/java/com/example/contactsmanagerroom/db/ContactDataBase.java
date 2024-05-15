package com.example.contactsmanagerroom.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactDataBase extends RoomDatabase  {

    //link the DAO with DB
    public abstract ContactDAO getContactDAO();

}
