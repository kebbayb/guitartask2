package query;


import java.util.List;
import model.guitar;


public interface guitardao {
	public List<guitar> guitars();

	public List<guitar> search(String price);
}
