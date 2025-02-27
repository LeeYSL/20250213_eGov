/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.sample.service;

import java.util.Date;

/**
 * @Class Name : SampleVO.java
 * @Description : SampleVO Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */
public class SampleVO extends SampleDefaultVO {

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

	private static final long serialVersionUID = 1L;

	/** 아이디 */
	private String id;

	/** 이름 */
	private String name;

	/** 내용 */
	private String description;

	/** 사용여부 */
	private String useYn;

	/** 등록자 */
	private String regUser;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getRegUser() {
		return regUser;
	}

	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}

}
