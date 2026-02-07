package library;

import javax.sql.rowset.CachedRowSet;

public interface LibraryDAO {
	CachedRowSet getBooks();
}
