package com.tandem.assignment.githubTests;

/**
 * Hello world!
 *
 */
public class Issue 
{
	String title;
	String body;
	String  assignee;
	String [] labels = new String [1];
	int milestone;
	String filter;
	String state;
	String labelNqmes;
	String sort;
	String direction;
	String since;
	
public Issue(String filter, String state, String labelNames, String sort, String direction, String since) {
	this.filter=filter;
	this.state=state;
	this.sort=sort;
	this.direction=direction;
	this.since=since;
}
public Issue(String title, String body ,int milestone, String [] labels,String assignee) {
	this.title=title;
	this.assignee= assignee;
	this.body=body;
	this.labels=labels;
	this.milestone=milestone;	
}

public String getTitle() {
	return this.title;
}
public void setTitle(String newTitle) {
	this.title=newTitle;
}
public int getMilestone() {
	return this.milestone;
}
public void setMilestone(int newMilestone) {
	this.milestone=newMilestone;
}
public String  getAssignee() {
	return this.assignee;
}
public void setAssignee(String  newAssignee) {
	this.assignee = newAssignee;
}
public String getBody() {
	return this.body;
}
public void setBody(String newBody) {
	this.body=newBody;
}
public String [] getLabels() {
	return this.labels;
}
public void setLabels(String[] newLabels) {
	this.labels= newLabels;
}

}
