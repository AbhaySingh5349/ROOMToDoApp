package com.example.roomtodoapp.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "toDo_table")
public class ToDoModelClass {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "toDoList_column")
    private String toDo;

    public ToDoModelClass(@NonNull String toDo) {
        this.toDo = toDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public ToDoModelClass() {
    }
}
