package fr.diginamic.services;

import java.util.Scanner;
import fr.diginamic.dao.QuestionDao.QuestionDao;
import fr.diginamic.exceptions.StockageException;

public abstract class MenuService {
	
	public abstract void executeUC(Scanner scanner, QuestionDao dao) throws StockageException;

}
