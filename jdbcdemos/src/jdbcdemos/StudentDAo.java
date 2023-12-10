
package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO { // DAO is Java class communicate with DB

	Connection conn = dbutil.getDBConnection();

	public int insertstudent(student stu ) {

		String insertQuery = "insert into student values(?,?,?)";
		// ? positional parameters

		int count = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, stu.getrollnumber());
			pstmt.setString(2, stu.getsname());
			pstmt.setString(3, stu.getbranch());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert query

		return count;

	}

	public int updatestudent(student stu) {

		// update query
		int count = 0;

		String updateQuery = "update employee set dname = ? , branch = ?  where rollnumber = ?";

		try {

			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1,stu.getsname());
			pstmt.setString(2, stu.getbranch());
			pstmt.setInt(3, stu.getrollnumber());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deletestudent(int rollnumber) {

		String deleteQuery = "delete from student where rollnumber = ?";
		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, rollnumber);
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public student getsrudentById(int rollnumber) {

		String selectOne = "select * from student where rollnumber= ?";

		student student = null;

		try {

			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, rollnumber);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int rollnumber = rs.getInt("rollnumber");
				String sname = rs.getString("sname");
				String branch = rs.getString("branch");

				employee = new student(rollnumber, sname, branch);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;
	}

	public List<student> getAllstudent() {

		List<student> list = new ArrayList<student>();

		String selectAll = "select * from student";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectAll);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int rillnumber= rs.getInt("rollnumber");
				String sname = rs.getString("sname");
				String branch = rs.getString("branch");

				Student student = new student(rollnumber, sname, branch);

				list.add(student);

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		return list;
	}

}
