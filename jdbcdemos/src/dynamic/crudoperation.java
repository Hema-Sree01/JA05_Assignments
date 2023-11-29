
package dynamic;

import java.util.List;
import java.util.Scanner;

import jdbcdemos.student;
import jdbcdemos.StudentDAO;

public class crudoperation{ // UI or Presentation Layer

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAO();

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to SCHOOL");
			System.out.println("1. INSERT student");
			System.out.println("2. UPDATE student");
			System.out.println("3. DELETE BY  student rollnumber");
			System.out.println("4. GET student BY rollnumber");
			System.out.println("5. GET ALL students ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter rollnumber");
				int eid = scanner.nextInt();
				System.out.println("Enter sname");
				scanner.nextLine(); // to handle enter key
				String ename = scanner.nextLine();
				System.out.println("Enter branch");
				String salary = scanner.nextDouble();

				student stu = new student(stu, sname, branch);

				int count = dao.insertstudent(stu);

				System.out.println(count + "record affected");

				break;

			case 2:

				System.out.println("Enter rollnumber");
				int eid1 = scanner.nextInt();
				System.out.println("Enter sname");
				scanner.nextLine(); // to handle enter key
				String ename1 = scanner.nextLine();
				System.out.println("Enter branch");
				double salary1 = scanner.nextDouble();

			student stu1 = new student(rollnumber1, sname1, branch1);

				int count1 = dao.updateEmployee(emp1);

				System.out.println(count1 + "  record affected");

				break;

			case 3:

				System.out.println("Enter rollnumber to Delete Record");
				int eid2 = scanner.nextInt();
				int count2 = dao.deletestudent(rn);

				System.out.println(count2 + "  record affected");

				break;

			case 4:
				System.out.println("Enter rollnumber to Search studentRecord");
				int rollnumber3 = scanner.nextInt();

				Object jdbc;
				student student =	jdbc.getstudentByrollnumber(rn);

				System.out.println(student);

				break;

			case 5:
				  List<student>  list =   dao.getAllstudent();

				  	for (student stuObj : list) {
				  		System.out.println(stuObj);

					}

				  break;

			case 0:

				flag = false;

				break;

			default:

				System.err.println("Invalid Input");

				break;
			}

		}

	}

}