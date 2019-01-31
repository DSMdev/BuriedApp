package Model;

public class TaskModel {
	
	//Paramters
	private String taskType;
	private 	int lifeCycle;
	private int age;
	private int cycleCount;
	private boolean completed;


	//Default NoArg Constructor
	TaskModel(){		
	}
	
	//Constructor that takes in paramters
	TaskModel(String a, int b, int c, int d){
		taskType = a;
		lifeCycle = b;
		age = c;
		cycleCount = d;
		completed = false;		
	}



	//Methods
	public void createNewTaskType() {
				
	}

	
	//Getters and Setters
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public int getLifeCycle() {
		return lifeCycle;
	}
	public void setLifeCycle(int lifeCycle) {
		this.lifeCycle = lifeCycle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCycleCount() {
		return cycleCount;
	}
	public void setCycleCount(int cycle) {
		this.cycleCount = cycle;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
		
	
}
