package library;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class LibraryDAOImpl implements LibraryDAO {

	private CachedRowSet rowSet;

	public LibraryDAOImpl() throws Exception {
		rowSet = RowSetProvider.newFactory().createCachedRowSet();

		rowSet.setMetaData(new javax.sql.rowset.RowSetMetaDataImpl() {
			{
				setColumnCount(4);
				setColumnName(1, "id");
				setColumnName(2, "title");
				setColumnName(3, "author");
				setColumnName(4, "available");
				setColumnType(1, java.sql.Types.INTEGER);
				setColumnType(2, java.sql.Types.VARCHAR);
				setColumnType(3, java.sql.Types.VARCHAR);
				setColumnType(4, java.sql.Types.BOOLEAN);
			}
		});
	}

	@Override
	public CachedRowSet getBooks() {
		return rowSet;
	}
}
