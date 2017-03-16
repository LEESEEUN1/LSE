	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<% 
	
	
	String _x=request.getParameter("x");
	String _y=request.getParameter("y");
	
	//x와y가 필수 입력 값이라면
	//int x=Integer.parseInt(_x);
	//int y=Integer.parseInt(_y);
	
	//x y가 필수가 아닌 옵션 값이라면 > 기본값을 넣어줘야 함(값을 넣지 않을 수도 있기 때문에)
	int x = 0;
	int y = 0;
	
	//x가 전달된 것이 있다면
	if(_x!=null&&!_x.equals(""))
		x=Integer.parseInt(_x);
	
	if(_y!=null&&!_y.equals(""))
		y=Integer.parseInt(_y);

	
	//쿼리 스트링이 전달되는 방식 3가지
	//calc			>x=null
	//calc?x=&y=	>x=""
	//calc?x=1&y=2	>		
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>안녕? Jasper</title>
</head>
<body>
	<form action="calc" method="get">
		<p>
			<label>x:</label><input name="x" id="txt-x" /> 
			<label>y:</label><input name="y" id="txt-y" />
			<%-- <input name="y" id="txt-y" value="y의 값은: <%=y%>"/> --%>
		</p>
		<p>
			sum = <input id="txt-sum" value="<%out.print(3+5);%>"/>
		</p>
		<p>
			<input id="btn-sum" type="submit" value="결과" />
		</p>
	</form>
</body>
</html>

<!--브라우저에서 내가 jsp를 요청하게 되면 서버에서 제스퍼를 불러서 jsp파일을  받아서 서블릿(서블릿 코드)(java파일)을 만들어줌 -->
<!--서블릿 코드를 받아서 컴파일을 해서 실행해서 응답함 -->

