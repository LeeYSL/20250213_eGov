package egovframework.example.sample.service;

import java.util.Date;

public class writeVO {
	
	private static final long serialVersionUID = 1L;
	
	private String meeting_id;
	private String title;
	private String writer;
	private String emp_id;
	private Date meeting_date;
	private String location;
	private String attendees;
	private String content;
	private String meeting_issue;
	private String action_note;
	private Date action_date;
	private String action_person;	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMeeting_id() {
		return meeting_id;
	}

	public void setMeeting_id(String id) {
		this.meeting_id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getMeeting_date() {
		return meeting_date;
	}

	public void setMeeting_date(Date meeting_date) {
		this.meeting_date = meeting_date;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAttendees() {
		return attendees;
	}

	public void setAttendees(String attendees) {
		this.attendees = attendees;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMeeting_issue() {
		return meeting_issue;
	}

	public void setMeeting_issue(String meeting_issue) {
		this.meeting_issue = meeting_issue;
	}

	public String getAction_note() {
		return action_note;
	}

	public void setAction_note(String action_note) {
		this.action_note = action_note;
	}

	public Date getAction_date() {
		return action_date;
	}

	public void setAction_date(Date action_date) {
		this.action_date = action_date;
	}

	public String getAction_person() {
		return action_person;
	}

	public void setAction_person(String action_person) {
		this.action_person = action_person;
	}

	public String toString() { // 객체 정보를 더 직관적으로 표시되게
	    return "WriteVO{" +
	           "meeting_id=" + meeting_id +
	           ", title='" + title + '\'' +
	           ", writer='" + writer + '\'' +
	           ", meeting_date=" + meeting_date +
	           ", location='" + location + '\'' +
	           ", attendees='" + attendees + '\'' +
	           ", content='" + content + '\'' +
	           ", meeting_issue='" + meeting_issue + '\'' +
	           ", action_note='" + action_note + '\'' +
	           ", action_date=" + action_date +
	           ", action_person='" + action_person + '\'' +
	           '}';
	}
}
