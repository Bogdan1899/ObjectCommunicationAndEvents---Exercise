package objectCommunicationsAndEvents.workForce;

import objectCommunicationsAndEvents.workForce.interfaces.Employee;
import objectCommunicationsAndEvents.workForce.interfaces.Job;
import objectCommunicationsAndEvents.workForce.models.employees.PartTimeEmployee;
import objectCommunicationsAndEvents.workForce.models.employees.StandartEmployee;
import objectCommunicationsAndEvents.workForce.models.jobs.JobImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<Employee> employees = new ArrayList<>();
        Server server = new Server();

        String[] inputArgs = bfr.readLine().split(" ");

        while (!inputArgs[0].equalsIgnoreCase("end")){
            switch (inputArgs[0].toLowerCase()){
                case "standartemployee":
                    employees.add(new StandartEmployee(inputArgs[1]));
                    break;
                case "parttimeemployee":
                    employees.add(new PartTimeEmployee(inputArgs[1]));
                    break;
                case "job":
                    for (Employee employee : employees) {
                        if (employee.getName().equalsIgnoreCase(inputArgs[3])){
                            Job job = new JobImpl(inputArgs[1], employee, Integer.parseInt(inputArgs[2]));
                            server.addJob(job);
                            break;
                        }
                    }
                    break;
                case "pass":
                    server.passWeek();
                    break;
                case "status":
                    System.out.print(server.toString());
                    break;
            }

            inputArgs = bfr.readLine().split(" ");
        }
    }
}
