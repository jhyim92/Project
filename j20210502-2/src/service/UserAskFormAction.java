package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PostDao;

public class UserAskFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			int board_num = Integer.parseInt(request.getParameter("board_num"));
			PostDao pd = PostDao.getInstance();
			int post_num = pd.check(board_num);
			
//			if (post_num >0) {
//				request.getSession().setAttribute("sessionPost_num", post_num);
//			}
			
			
			request.setAttribute("post_num",post_num);
			request.setAttribute("board_num", request.getParameter("board_num"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "userAskForm.jsp";
	}

}
