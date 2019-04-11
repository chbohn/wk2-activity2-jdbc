package wk2.activity2.jdbc.core;

import wk2.activity2.jdbc.BasicService;
import wk2.activity2.jdbc.logger.ServiceLogger;
import wk2.activity2.jdbc.models.GetStudentRequestModel;
import wk2.activity2.jdbc.models.GetStudentResponseModel;
import wk2.activity2.jdbc.models.InsertStudentRequestModel;
import wk2.activity2.jdbc.models.StudentModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentRecords {
    public static GetStudentResponseModel retrieveStudentsFromDB(String name) {
        GetStudentResponseModel responseModel;

        try {
            throw new SQLException();
            // Construct the query

            // Create the prepared statement

            // Set the arguments

            // Save the query result to a Result Set so records may be retrieved

            // Retrieve the students from the Result Set

            // Got the students. Builds the response model
        } catch (SQLException e) {
            // Error retrieving students
            e.printStackTrace();
        }
        // No students were retrieved. Build response model with null arraylist.
        return null;
    }

    public static boolean insertStudentsToDb(InsertStudentRequestModel requestModel) {
        try {
            throw new SQLException();
            // Construct the query

            // Create the prepared statement

            // Set the paremeters

            // Execute query
        } catch (SQLException e) {
            ServiceLogger.LOGGER.warning("Unable to insert student " + requestModel.getEmail());
            e.printStackTrace();
        }
        return false;
    }
}


