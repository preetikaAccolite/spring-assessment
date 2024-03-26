package JDBCpractice.JDBCpractice;
import java.util.*;
public class Trainer {
private int id;
private String name;
private String coursename;
private List<Session> sessions;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Session> getSessions() {
	return sessions;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public void setSessions(List<Session> sessions) {
	this.sessions = sessions;
}
@Override
public String toString() {
    return "Trainer [id=" + id + ", name=" + name + ", sessions=" + sessions + " ,course name="+coursename+"]";
}
}
