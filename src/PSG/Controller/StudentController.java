package PSG.Controller;

import PSG.DAO.StudentDAO;
import PSG.Srevice.StudentService;

public class StudentController {
	public static void main(String[] args) throws Exception {
		StudentService sd = new StudentService();
		sd.all();
	}
}
