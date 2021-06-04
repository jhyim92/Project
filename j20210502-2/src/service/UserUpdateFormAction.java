package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Member;
import dao.MemberDao;

public class UserUpdateFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String user_id = request.getParameter("user_id");
			MemberDao md = MemberDao.getInstance();
			Member member = md.select(user_id);
			request.setAttribute("member", member);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "userUpdateForm.jsp";
	}

}
