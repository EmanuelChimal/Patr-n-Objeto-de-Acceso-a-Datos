package folder;
/**
 *
 * @author Alan DoubleEight4
 */
import java.sql.SQLException;
import java.util.List;

public interface Dao {
    public void insert(Entidad entidad) throws SQLException;
    public void update(Entidad entidad) throws SQLException;
    public void delete(Integer id) throws SQLException;
    public Entidad read(Integer id) throws SQLException;
    public List<Entidad> readAll() throws SQLException;
    
}
