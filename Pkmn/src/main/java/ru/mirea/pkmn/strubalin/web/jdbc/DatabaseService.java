package ru.mirea.pkmn.strubalin.web.jdbc;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.mirea.pkmn.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import ru.mirea.pkmn.Card;
import ru.mirea.pkmn.Student;

import java.sql.SQLException;

public interface DatabaseService {
    Card getCardFromDatabase(String cardName) throws SQLException;

    Student getStudentFromDatabase(String studentName) throws SQLException;

    void saveCardToDatabase(Card card) throws SQLException;

    void createPokemonOwner(Student owner) throws SQLException;
}