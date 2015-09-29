package disease;

import java.util.List;

import org.junit.Test;

import com.ufu.disease.dao.DermatologyDAO;
import com.ufu.disease.to.Chromossomo;

public class DermatologyDAOTest {

	//private static DermatologyDAO demDAO = new DermatologyDAO();

	@Test
	public void searchTeste() {

		DermatologyDAO demDAO = new DermatologyDAO();
		List<Chromossomo> list = demDAO.searchDermtology(0, 0);

		org.junit.Assert.assertNotNull(list);

	}

}
