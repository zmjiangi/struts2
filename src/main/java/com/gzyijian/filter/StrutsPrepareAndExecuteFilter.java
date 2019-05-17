package com.gzyijian.filter;

import com.gzyijian.model.Product;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义Filter作为MVC控制器
 *
 * @author zmjiangi
 * @date 2019-5-17
 */
public class StrutsPrepareAndExecuteFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String servletPath = req.getServletPath();

        String inputServletPath = "/product/input.action";
        if (inputServletPath.equals(servletPath)) {
            req.getRequestDispatcher("/WEB-INF/pages/product/input.jsp").forward(request, response);
            return;
        }

        String saveServletPath = "/product/input.action";
        if (saveServletPath.equals(servletPath)) {
            String name = request.getParameter("name");
            String desc = request.getParameter("desc");
            String price = request.getParameter("price");
            Product product = new Product(1, name, desc, Double.parseDouble(price));
            System.out.println("product = " + product);

            req.setAttribute("product", product);
            req.getRequestDispatcher("/WEB-INF/pages/product/details.jsp").forward(request, response);
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
