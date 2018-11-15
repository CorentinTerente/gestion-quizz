package fr.diginamic.dao.QuestionDao;
import java.util.List;

import fr.diginamic.model.Question.*;

public interface QuestionDao {
	List<Question> findAll();
	void save(Question question);
	void delete(Question question);
}
