package br.com.fernando.job_scheduling;

public class Job {

	// attributes
	private int id;
	private String description;
	private String jobEndTime;
	private String JobEstimatedExecution;

	private static String initialTime = "2019/11/10 09:00:00";
	private static String endTime = "2019/11/11 12:00:00";

	// constructor
	public Job(int id, String description, String jobEndTime, String JobEstimatedExecution) {

		this.id = id;
		this.description = description;
		this.jobEndTime = jobEndTime;
		this.JobEstimatedExecution = JobEstimatedExecution;

		System.out.println("Job successfully added -  id: " + this.id + " description: " + this.description
				+ " Job End Time: " + this.jobEndTime + " Job Estimated Execution: " + this.JobEstimatedExecution);

		// System.out.println("start: " + initialTime + " end: " + endTime);

	}

	// getters

	public int getId() {
		return this.id;
	}

	public String getJobEndTime() {
		return this.jobEndTime;
	}

	public static String getInitialTime() {
		return Job.initialTime;
	}

	public static String getEndTime() {
		return Job.endTime;
	}

}
