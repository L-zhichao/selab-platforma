package tyut.selab.userservice.controller;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: UserController
 * @author: lizhichao
 * @description: TODO
 * @date: 2024/5/5 23:31
 * @version: 1.0
 */
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private Result<> queryByUserId(HttpServletRequest request,HttpServletResponse response){
        return null;
    }

    private Result<> queryByGroupId(HttpServletRequest request,HttpServletResponse response){
        return null;
    }
    private Result<> save(HttpServletRequest request,HttpServletResponse response){return null;}
    private Result<> update(HttpServletRequest request,HttpServletResponse response){return null;}
}
