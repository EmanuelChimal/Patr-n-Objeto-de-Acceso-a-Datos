package folder;
/**
 *
 * @author Alan DoubleEiht4
 */
public class Entidad implements java.io.Serializable {
    
    private int idEntidad;
    private String nombreEntidad;
    
    public Entidad (){}
    
    public Entidad(int idEntidad, String nombreEntidad) {
        this.idEntidad = idEntidad;
        this.nombreEntidad = nombreEntidad;
        }
    public int getIdentidad() {
        return idEntidad;
        }
    public String getNombreEntidad() {
        return nombreEntidad;
        }
    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
        }
    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
        }
    }
