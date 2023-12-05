package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.conexaobd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class controller
 */
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		conexaobd bd = new conexaobd();
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		conexaobd bd = new conexaobd();
		String formulario = request.getParameter("formulario");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(formulario);
		
		if (formulario.equals("login")) {
			out.println("entrando al login...");
			
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			String sql = "SELECT login, senha FROM usuarios_web WHERE login = ? AND senha = ?";
			try {
				PreparedStatement ps = bd.conexao.prepareStatement(sql);
				ps.setString(1, login);
				ps.setString(2, senha);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("nome_usuario",login);
					response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/principal.jsp");
					
				} else {
					response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/erro_login.jsp");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if (formulario.equals("cadastro")) {
			String nome_produto = request.getParameter("nome_produto");
			String qtd_estoque = request.getParameter("qtd_estoque");
			String valor_produto = request.getParameter("valor_produto");
			String sql = "INSERT INTO produtos_web(nome_produto,qtd_estoque,valor_produto) VALUES (?,?,?)";
			try {
				PreparedStatement ps = bd.conexao.prepareStatement(sql);
				ps.setString(1, nome_produto);
				ps.setString(2, qtd_estoque);
				ps.setString(3, valor_produto);
				int insere_ok = ps.executeUpdate();
				if (insere_ok > 0) {
					response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/cadastro_ok.jsp");
				} else {
					response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/erro_cadastro_produto.jsp");
				}
			} catch (SQLException e) {
				response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/erro_cadastro_produto.jsp");
				e.printStackTrace();
			}
			
		} else if (formulario.equals("excluir")) {
			String nome_produto = request.getParameter("nome_excluir");
			String sql = "DELETE FROM produtos_web WHERE nome_produto = ?";
			try {
				PreparedStatement ps = bd.conexao.prepareStatement(sql);
				ps.setString(1, nome_produto);
				int deleta_ok = ps.executeUpdate();
				if (deleta_ok > 0) {
					response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/excluir_ok.jsp");
				}
			} catch (SQLException e) {
				response.sendRedirect("http://localhost:8080/aula-439-448-Projeto-Final-Java-Web/erro_deleta_produto.jsp");
				e.printStackTrace();
			}
		}
		
	}

}
