package com.example.roomtodoapp.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomtodoapp.model.ToDoModelClass;

import java.util.List;

@Dao
public interface ToDoDaoDataInterface {
    // performing CRUD operations

    @Insert
    void insertData (ToDoModelClass toDoModelClass);

    @Query("DELETE FROM toDo_table")
    void deleteAll();

    @Query("DELETE FROM toDo_table WHERE id= :id")
    int deleteAToDo(int id);

    @Query("UPDATE toDo_table SET toDoList_column = :toDoItem WHERE id= :id")
    int updateList(int id, String toDoItem);

    @Query("SELECT * FROM toDo_table ORDER BY id DESC")
    List<ToDoModelClass> toDoList();
}
