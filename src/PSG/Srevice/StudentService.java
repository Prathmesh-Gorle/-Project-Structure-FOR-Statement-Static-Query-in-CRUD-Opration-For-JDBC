package PSG.Srevice;

import PSG.DAO.StudentDAO;

public class StudentService {
	public void all() throws Exception {
		StudentDAO sd = new StudentDAO();
		sd.select();
		sd.insert();
		sd.update();
		sd.delete();
	}

}
