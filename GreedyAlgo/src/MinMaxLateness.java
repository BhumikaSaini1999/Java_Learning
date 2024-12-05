import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Minimize the maximum Lateness
//We have given N jobs. T->Time taken to complete the job, D->Deadline to complete the job.
//We have to do all N jobs. We can do only 1 job at a time. Our target is to minimize the maximum lateness.
//Time->O(nlogn)
//Space->O(n)
class Job {
	int time;
	int deadline;

	public Job(int time, int deadline) {
		this.time = time;
		this.deadline = deadline;
	}
}
public class MinMaxLateness {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of jobs: ");
		int n = sc.nextInt();
		
		System.out.println("Enter time taken by "+n+" jobs: ");
		int time[] = new int[n];
		for(int i=0; i<n; i++) {
			time[i] = sc.nextInt();
		}
		
		System.out.println("Enter deadline for "+n+" jobs: ");
		int deadline[] = new int[n];
		for(int i=0; i<n; i++) {
			deadline[i] = sc.nextInt();
		}
		
		System.out.println(minMaxLateness(n,time,deadline));
		
		sc.close();
	}

	private static int minMaxLateness(int n, int[] time, int[] deadline) {
		ArrayList<Job> jobs = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			jobs.add(new Job(time[i], deadline[i]));
		}
		
		Collections.sort(jobs, (a,b)->a.deadline-b.deadline);

		int maxLateness=0, curStart=0;
		for(int i=0; i<n; i++) {
			int curTime = jobs.get(i).time;
			int curDeadline = jobs.get(i).deadline;
			
			int time_taken = curTime+curStart;
			int lateness=0;
			if(curDeadline>=time_taken) {
				lateness=0;
			}else {
				lateness=time_taken-curDeadline;
			}
			maxLateness=Math.max(maxLateness, lateness);
			curStart=time_taken;
		}
		return  maxLateness;
	}

}
