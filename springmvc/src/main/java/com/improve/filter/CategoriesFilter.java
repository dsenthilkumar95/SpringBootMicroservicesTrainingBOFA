package com.improve.filter;

import com.improve.exception.JwtTokenMissingException;
import org.springframework.boot.ExitCodeGenerator;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class CategoriesFilter implements Filter, ExitCodeGenerator {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub

        //filter to check header

        HttpServletRequest httpRequest=(HttpServletRequest) request;
        HttpServletResponse httpResponse=(HttpServletResponse) response;
        String header = httpRequest.getHeader("Authorization");

        if (header == null || !header.startsWith("Bearer")) {
            throw new JwtTokenMissingException("No JWT token found in the "
                    + "request headers"+this.getExitCode());
        }

        chain.doFilter(httpRequest, httpResponse);

    }

    @Override
    public int getExitCode() {
        // TODO Auto-generated method stub
        return new Random().nextInt(100000);
    }
}
