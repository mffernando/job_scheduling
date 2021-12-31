package br.com.fernando.job_scheduling;

import java.util.ArrayList;
import java.util.Date;

public class CreateJobs {

	public static void main(String[] args) {

		// job description
		// 1, "Importação de arquivos de fundos", "2019/11/10 12:00:00", "2 horas"
		// 2, "Importação de dados da Base Legada", "2019/11/11 12:00:00", "4 horas"
		// 3, "Importação de dados de integração", "2019/11/11 08:00:00", "6 horas"

		// jobs array
		ArrayList<Job> jobs = new ArrayList<Job>();

		// add job
		// int id, String description, String jobEndTime, String JobEstimatedExecution
		jobs.add(new Job(1, "Importação de arquivos de fundos", "2019/11/10 12:00:00", "2 horas"));
		jobs.add(new Job(2, "Importação de dados da Base Legada", "2019/11/11 12:00:00", "4 horas"));
		jobs.add(new Job(3, "Importação de dados de integração", "2019/11/11 08:00:00", "6 horas"));

	}
}
