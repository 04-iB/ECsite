<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>管理者作成</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">

<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>

	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>adminUserCreate</p>
		</div>
		<div>
			<s:if test="errorMessage !=''">
				<s:property value="errorMessage" escape="false" />
			</s:if>
			<table>
				<s:form action="AdminUserCreateConfirmAction">
					<tr>
						<td><label>ログインID:</label></td>
						<td><input type="text" name="loginUserId" value="" /></td>
					</tr>
					<tr>
						<td><label>ログインPASS:</label></td>
						<td><input type="text" name="loginPassword" value="" /></td>
					</tr>
					<tr>
						<td><label>ユーザー名:</label></td>
						<td><input type="text" name="userName" value="" /></td>
					</tr>
					<s:submit value="登録" />
				</s:form>
			</table>
			<div>
				<p>
					管理者画面に戻る場合は <a href='<s:url action="AdminAction"/>'>こちら</a>
				</p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>