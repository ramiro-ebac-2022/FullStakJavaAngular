package pkg_aula_odbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class banco_de_dados
 */
public class bd_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bd_delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/soulcode"; 
			String user = "root";
			String senha = "root";
			
			//--
			Connection conn;
			conn =  DriverManager.getConnection(url,user,senha);
			
			//--Cabeçalho
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Soulcode - Java Servlet</title></head>");
			out.println("<body>");
			
			//--DELETE
			String codigo_deleta = request.getParameter("codigo_altera");
			int cod_deleta = Integer.parseInt(codigo_deleta);
					
			String sql_d = "DELETE FROM usuarios WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql_d);
			ps.setInt(1, cod_deleta);
			
			int funciona = ps.executeUpdate();
			if (funciona > 0 ) {
				out.println("<br><strong>Registro deletado com sucesso!</strong><br>");
			} else {
				out.println("<br>Ocorreu um erro ao deletar... <br>");
			}
			
			//--SELECT
			String sql_s = "SELECT id, nome FROM usuarios";
			PreparedStatement ps_s = conn.prepareStatement(sql_s);
			ResultSet rs = ps_s.executeQuery();
			while(rs.next()) {
				int cod_banco = rs.getInt(1);
				String nome_banco = rs.getString("nome"); //outra forma
				out.println("<br>Código : " + cod_banco + " , nome : " + nome_banco);
			}
			
			//--
			out.println("</body></html>");
			out.flush();
			out.close();
			//--
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//--
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
