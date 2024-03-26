package JDBCpractice.JDBCpractice;

public class Session {
public String getSession_duration() {
		return session_duration;
	}
	public void setSession_duration(String session_duration) {
		this.session_duration = session_duration;
	}
private int id;
private String sessionName;
private String session_duration;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSessionName() {
	return sessionName;
}
public void setSessionName(String sessionName) {
	this.sessionName = sessionName;
}
@Override
public String toString() {
    return "Session [id=" + id + ", sessionName=" + sessionName + " ,session duration ="+session_duration+"]";
}
}
