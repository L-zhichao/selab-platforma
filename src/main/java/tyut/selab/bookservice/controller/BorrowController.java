package tyut.selab.bookservice.controller;

import tyut.selab.bookservice.utils.Result;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: BorrowController
 * @author: lizhichao
 * @description: TODO
 * @date: 2024/5/4 11:40
 * @version: 1.0
 */
@WebServlet(name = "BorrowController",urlPatterns = {})
public class BorrowController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    /**
     *  借阅书籍
     *  param: BorrowBookDto对象
     * @return
     */
    private Result borrowingBook(HttpServletRequest request,HttpServletResponse response){
        return null;
    }

    /**
     *  归还书籍
     *  param: bookId
     * @return
     */
    private Result returnBook(HttpServletRequest request,HttpServletResponse response){
        return null;
    }
    private Result queryOne(HttpServletRequest request,HttpServletResponse response){
        return null;
    }
    private Result queryAll(HttpServletRequest request,HttpServletResponse response){
        return null;
    }
}
