package JDBCpractice.JDBCpractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Demo {
public static void main(String[] args)  {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/demo","root","Pckandpal@71");
		Statement stmt=con.createStatement();
		String query = "SELECT t.id, t.name,t.course_name, s.id AS session_id, s.session_duration,s.session_name FROM trainer t INNER JOIN session s ON t.id = s.trainer_id";
 ResultSet rs = stmt.executeQuery(query);

 List<Trainer> trainers = new ArrayList<>();
 Trainer tr = null;

 while (rs.next()) {
     int trainerId = rs.getInt("id");
     String trainerName = rs.getString("name");
     String trainercourse=rs.getString("course_name");
     int sessionId = rs.getInt("session_id");
     String sessionName = rs.getString("session_name");
     String sessionduration=rs.getString("session_duration");
     if (tr == null || tr.getId() != trainerId) {
         // Create a new Trainer instance when encountering a new trainer
         tr = new Trainer();
         tr.setId(trainerId);
         tr.setName(trainerName);
         tr.setCoursename(trainercourse);
         tr.setSessions(new ArrayList<>());
         trainers.add(tr);
     }

     // Add session to the current trainer's list of sessions
     Session session = new Session();
     session.setId(sessionId);
     session.setSessionName(sessionName);
     session.setSession_duration(sessionduration);
     tr.getSessions().add(session);
 }

 // Output all trainers with their sessions
 for (Trainer trainer : trainers) {
     System.out.println(trainer);
 }

 con.close();
		}
	catch(SQLException e) {
		System.out.println(e);
	}
	catch( ClassNotFoundException e) {
		System.out.println(e);
	}
}
}
