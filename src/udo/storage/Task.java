package udo.storage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task {
	//class defines Task objects
	private String taskType;
	private String content;
	private GregorianCalendar start;
	private GregorianCalendar end;
	private GregorianCalendar reminder;
	private String label;
	private boolean priority;
	private boolean done;
	
	//constructor
	public Task(String taskType, String content, GregorianCalendar start, GregorianCalendar end, 
			GregorianCalendar reminder, String label, boolean priority){
		this.taskType = taskType;
		this.content = content;
		this.start = start;
		this.end = end;
		this.reminder = reminder;
		this.label = label;
		this.priority = priority;
		this.done = false;
	}
	
	public String getTaskType(){
		return taskType;
	}
	
	public String getContent(){
		return content;
	}

	public GregorianCalendar getStart(){
		return start;
	}

	public GregorianCalendar getEnd(){
		return end;
	}
	
	public GregorianCalendar getReminder(){
		return reminder;
	}
	
	public String getLabel(){
		return label;
	}

	public boolean isPriority(){
		return priority;
	}
	
	public boolean isDone(){
		return done;
	}

	public void setTaskType(String type){
		this.taskType = type;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public void setStart(GregorianCalendar start){
		this.start = start;
	}
	
	public void setEnd(GregorianCalendar end){
		this.end = end;
	}
	
	public void setReminder(GregorianCalendar reminder){
		this.reminder = reminder;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	
	public void setPriority(){
		this.priority = !(this.priority);
	}
	
	public void setDone(){
		this.done = !(this.done);
	}
	
	public String toString(){
		String finalString = "";
		String startDate = start.get(Calendar.DAY_OF_MONTH) + "/" + start.get(Calendar.MONTH) + "/" + start.get(Calendar.YEAR);
		String endDate = end.get(Calendar.DAY_OF_MONTH) + "/" + end.get(Calendar.MONTH) + "/" + end.get(Calendar.YEAR);
		String reminderDate = reminder.get(Calendar.DAY_OF_MONTH) + "/" + reminder.get(Calendar.MONTH) + "/" + reminder.get(Calendar.YEAR);
		finalString += taskType + "     " + content + "      " + startDate + "     " + endDate + "    " + reminderDate + "     " + label 
				+ "     ";
		return finalString;
	}
}

