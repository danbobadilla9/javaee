package Models.Dao;

import Models.Dao.Interface.CrudObjects;
import Models.Entity.Participa;
import Models.Utilities.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ParticipaDAOImp implements CrudObjects<Participa> {

    private final DB CON;
    private PreparedStatement ps;
    private ResultSet rs;

    public ParticipaDAOImp() {
        CON = DB.getInstance();
    }

    @Override
    public boolean insertObject(Participa objeto) {
        boolean resp = false;
        try {
            ps = CON.getConnection().prepareStatement("INSERT INTO participa (idParticipa, idAplicacion, idPrueba, nombreResponsablePrueba, correoResponsablePrueba, telefonoResponsablePrueba, nombreContactoTecnico, correoContactoTecnico, telefonoContactoTecnico, nombreContactoOperativo, correoContactoOperativo, telefonoContactoOperativo, fechaCertificacion, fechaFinEvaluacion, fechaFirmaSSSPIM, fechaFirmaGCCSSPIM, fechaEnvioInformeInstitucion, fechaImplementacionProduccion, detallesPruebaReporteRemedy, duracionEvaluacion, duracionRevisionSSSPIM, duracionRevisionGCCSSPIM, duracionTotalProcesoPrueba, duracionTotalProceso, fechaEntregaCedulaResultados, comentarios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setLong(1, objeto.getIdParticipa());
            ps.setInt(2, objeto.getIdAplicacion());
            ps.setInt(3, objeto.getIdPrueba());
            ps.setString(4, objeto.getNombreResponsablePrueba());
            ps.setString(5, objeto.getCorreoResponsablePrueba());
            ps.setString(6, objeto.getTelefonoResponsablePrueba());
            ps.setString(7, objeto.getNombreContactoTecnico());
            ps.setString(8, objeto.getCorreoContactoTecnico());
            ps.setString(9, objeto.getTelefonoContactoTecnico());
            ps.setString(10, objeto.getNombreContactoOperativo());
            ps.setString(11, objeto.getCorreoContactoOperativo());
            ps.setString(12, objeto.getTelefonoContactoOperativo());
            ps.setTimestamp(13, objeto.getFechaCertificacion());
            ps.setTimestamp(14, objeto.getFechaFinEvaluacion());
            ps.setTimestamp(15, objeto.getFechaFirmaSSSPIM());
            ps.setTimestamp(16, objeto.getFechaFirmaGCCSSPIM());
            ps.setTimestamp(17, objeto.getFechaEnvioInformeInstitucion());
            ps.setTimestamp(18, objeto.getFechaImplementacionProduccion());
            ps.setInt(19, objeto.getDetallesPruebaReporteRemedy());
            ps.setString(20, objeto.getDuracionEvaluacion());
            ps.setString(21, objeto.getDuracionRevisionSSSPIM());
            ps.setString(22, objeto.getDuracionRevisionGCCSSPIM());
            ps.setString(23, objeto.getDuracionTotalProcesoPrueba());
            ps.setString(24, objeto.getDuracionTotalProceso());
            ps.setTimestamp(25, objeto.getFechaEntregaCedulaResultados());
            ps.setString(26, objeto.getComentarios());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se creó el Participa " + e.getMessage());
        } finally {
            CON.closeConnection();
        }
        return resp;
    }

    @Override
    public boolean updateObject(Participa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteObject(Participa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Participa> listObjects(String objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
public List<Participa> listObjects() {
    List<Participa> participas = new ArrayList<>();
    try {
        Statement stmt = CON.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM participa");
        while (rs.next()) {
            Participa participa = new Participa();
            participa.setIdParticipa(rs.getLong("idParticipa"));
            participa.setIdAplicacion(rs.getInt("idAplicacion"));
            participa.setIdPrueba(rs.getInt("idPrueba"));
            participa.setNombreResponsablePrueba(rs.getString("nombreResponsablePrueba"));
            participa.setCorreoResponsablePrueba(rs.getString("correoResponsablePrueba"));
            participa.setTelefonoResponsablePrueba(rs.getString("telefonoResponsablePrueba"));
            participa.setNombreContactoTecnico(rs.getString("nombreContactoTecnico"));
            participa.setCorreoContactoTecnico(rs.getString("correoContactoTecnico"));
            participa.setTelefonoContactoTecnico(rs.getString("telefonoContactoTecnico"));
            participa.setNombreContactoOperativo(rs.getString("nombreContactoOperativo"));
            participa.setCorreoContactoOperativo(rs.getString("correoContactoOperativo"));
            participa.setTelefonoContactoOperativo(rs.getString("telefonoContactoOperativo"));
            participa.setFechaCertificacion(rs.getTimestamp("fechaCertificacion"));
            participa.setFechaFinEvaluacion(rs.getTimestamp("fechaFinEvaluacion"));
            participa.setFechaFirmaSSSPIM(rs.getTimestamp("fechaFirmaSSSPIM"));
            participa.setFechaFirmaGCCSSPIM(rs.getTimestamp("fechaFirmaGCCSSPIM"));
            participa.setFechaEnvioInformeInstitucion(rs.getTimestamp("fechaEnvioInformeInstitucion"));
            participa.setFechaImplementacionProduccion(rs.getTimestamp("fechaImplementacionProduccion"));
            participa.setDetallesPruebaReporteRemedy(rs.getInt("detallesPruebaReporteRemedy"));
            participa.setDuracionEvaluacion(rs.getString("duracionEvaluacion"));
            participa.setDuracionRevisionSSSPIM(rs.getString("duracionRevisionSSSPIM"));
            participa.setDuracionRevisionGCCSSPIM(rs.getString("duracionRevisionGCCSSPIM"));
            participa.setDuracionTotalProcesoPrueba(rs.getString("duracionTotalProcesoPrueba"));
            participa.setDuracionTotalProceso(rs.getString("duracionTotalProceso"));
            participa.setFechaEntregaCedulaResultados(rs.getTimestamp("fechaEntregaCedulaResultados"));
            participa.setComentarios(rs.getString("comentarios"));
            participas.add(participa);
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener la lista de Participa: " + e.getMessage());
        e.printStackTrace();
    } finally {
        CON.closeConnection();
    }
    return participas;
}


    @Override
    public Participa getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Participa getObject(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}