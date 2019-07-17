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
<title>管理者画面</title>
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
			<p>admin</p>
		</div>
		<div>
			<s:form action="AdminAction">
				<table>
					<tr>
						<td>商品:</td>
						<td><input type="button" value="新規登録"
							onclick="submitAction('ItemCreateAction')" /></td>
						<td><input type="button" value="一覧"
							onclick="submitAction('ItemListAction')" /></td>
					</tr>
					<tr>
						<td>ユーザー:</td>
						<td><input type="button" value="管理者新規登録"
							onclick="submitAction('AdminUserCreateAction')" /></td>
						<td><input type="button" value="一覧"
							onclick="submitAction('UserListAction')" /></td>
					</tr>
					<tr>
						<td>お問い合わせ</td>
						<td><input type="button" value="一覧"
							onclick="submitAction('InquiryListAction')" /></td>
					</tr>
					<tr>
						<td>購入履歴</td>
						<td><input type="button" value="一覧"
							onclick="submitAction('UserBuyListAction')" /></td>
					</tr>
				</table>
			</s:form>
		</div>
		<div>
			<p>
				Homeへ戻る場合は <a href='<s:url action="GoHomeAction"/>'>こちら</a>
			</p>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>