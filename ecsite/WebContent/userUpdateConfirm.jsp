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
<title>ユーザー更新確認画面</title>
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
			<p>userUpdateConfirm</p>
		</div>
		<div>
			<h3>
				パスワードを変更します。<br> ログインIDとパスワードと新しいパスワードを入力してください。
			</h3>
			<s:form action="UserDeleteCompleteAction">
				<tr>
					<td><label>ログインID:</label></td>
					<td><input type="text" name="login_id" value="" /></td>
				</tr>
				<tr>
					<td><label>パスワード:</label></td>
					<td><input type="password" name="oldlogin_pass" value="" /></td>
				</tr>
				<tr>
					<td><label>新しいパスワード</label></td>
					<td><input type="password" name="newlogin_pass" value="" /></td>
				<tr>
					<td><input type="button" value="キャンセル"
						onclick="submitAction('MyPageAction')" /></td>
					<td><input type="button" value="ＯＫ"
						onclick="submitAction('UserUpdateCompleteAction')" /></td>
				</tr>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>