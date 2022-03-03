package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.jwt.util.JwtUtil;

public class CompanyFilter implements Filter {

	private JwtUtil jwtUtil;

	public CompanyFilter (JwtUtil jwtUtil) {
		super();
		this.jwtUtil = jwtUtil;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		cast the req/reso to http
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.addHeader("Access-Control-Allow-Origin", "*");
		resp.addHeader("Access-Control-Allow-Headers", "*");
		resp.addHeader("Access-Control-Allow-Methods", "*");
//		System.out.println("==================================");

		String token = req.getHeader("token");
		if (token == null && req.getMethod().equals("OPTIONS")) {
			System.out.println("this is preflight request: " + req.getMethod());
			chain.doFilter(request, response);
			return;
		}

		if (token != null) {
			try {
				if (jwtUtil.extractClient(token).clientType.name() != "COMPANY") {
					resp.sendError(HttpStatus.UNAUTHORIZED.value(), "you cannot do this action");
					return;
//			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "you cannot do this action");
				}
				if (!jwtUtil.isTokenExpired(token)) {
					System.out.println(">>>>> filter - valid token");
//				check token validity
//				if valid - forward the request to the end point 
					chain.doFilter(request, response);
					return;
				}
			} catch (Exception e) {
				resp.sendError(HttpStatus.UNAUTHORIZED.value(), "invalid token");
				System.out.println(">>>>> filter - invalid token");
				return;
			}
//				if NOT valid
			resp.sendError(HttpStatus.UNAUTHORIZED.value(), "not logged in");
			System.out.println(">>>>> filter - invalid token");
		}
	}
}
