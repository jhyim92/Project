package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

public class UserEmailCheckProAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			String user_email = request.getParameter("user_email");
			
			MemberDao md = MemberDao.getInstance();
			int result = md.IdDupl(user_email);	// 없으면 0, 있으면 1
			request.setAttribute("result",result);
			System.out.println("duplication user_id->"+user_email);
			System.out.println("duplication result->"+result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "emailDuplicationCheckPro.jsp";
	}

}
