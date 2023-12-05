package pkg_aula_odbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
public class banco_de_dados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public banco_de_dados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String scod = request.getParameter("codigo");
		//int cod = Integer.parseInt(scod);
		//String nome = request.getParameter("nome");
		
		//--
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/soulcode";  //"soulcode" é o banco de dados no mysql"
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
			
			
			//--INSERT
			//String sql_i = "INSERT INTO usuarios (id, nome) VALUES (? , ?)";
			//PreparedStatement ps = conn.prepareStatement(sql_i);
			//ps.setInt(1, cod);
			//ps.setString(2, nome);
			//ps.execute();
			
			//--UPDATE
			String codigo_altera = request.getParameter("codigo_altera");
			int cod_altera = Integer.parseInt(codigo_altera);
			String nome_altera = request.getParameter("nome_altera");
					
			String sql_u = "UPDATE usuarios SET nome = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql_u);
			ps.setString(1, nome_altera);
			ps.setInt(2, cod_altera);
			
			HttpSession session = request.getSession();
			session.setAttribute("usuario_atualizado",nome_altera);
			session.setAttribute("atualizar", "Atualizar");
			
			int funciona = ps.executeUpdate();
			if (funciona > 0 ) {
				response.sendRedirect("http://localhost:8080/aula-406-primeira-pag-web/sucesso.jsp");
				out.println("<br><strong>Registro atualizado com sucesso!</strong><br>");
			} else {
				response.sendRedirect("http://localhost:8080/aula-406-primeira-pag-web/erro.jsp");
				out.println("<br>Ocorreu um erro  :( <br>");
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
