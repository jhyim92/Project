package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Post;
import dao.PostDao;

public class UserAskProAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("UserAskProAction start..");
			request.setCharacterEncoding("utf-8");
//			int board_num = Integer.parseInt(request.getParameter("board_num"));
//			int post_num = Integer.parseInt(request.getParameter("post_num"));
			Post post = new Post();
			System.out.println("UserAskProAction board_num->"+request.getParameter("board_num"));
			post.setBoard_num(Integer.parseInt(request.getParameter("board_num")));
			System.out.println("UserAskProAction post_num->"+request.getParameter("post_num"));
			post.setPost_num(Integer.parseInt(request.getParameter("post_num").trim()));
			System.out.println("UserAskProAction user_id->"+request.getParameter("user_id"));
			post.setUser_id(request.getParameter("user_id"));
			System.out.println("UserAskProAction post_name->"+request.getParameter("post_name"));
			post.setPost_name(request.getParameter("post_name"));
			System.out.println("UserAskProAction post_cont->"+request.getParameter("post_cont"));
			post.setPost_cont(request.getParameter("post_cont"));
	
			PostDao pd = PostDao.getInstance();

			int result = pd.insert(post);
			System.out.println("UserAskProAction result->"+result);

			request.setAttribute("result", result);

		} catch (Exception e) {
			System.out.println("UserAskProAction Exception->"+e.getMessage());
		}
		return "userAskPro.jsp";
	}

}
