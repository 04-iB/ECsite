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
<title>購入履歴一覧</title>
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
			<p>userBuyList</p>
		</div>
		<div>
			<s:if test="userBuyInfoDTOList == null">
				<h3>購入履歴存在しません。</h3>
			</s:if>
			<s:elseif test="message == null">
				<h3>購入履歴は以下になります。</h3>
				<table border="1">
					<tr>
						<th>商品ID</th>
						<th>合計金額</th>
						<th>合計個数</th>
						<th>名前</th>
						<th>支払い方法</th>
						<th>登録日</th>
						<th>削除日</th>
					</tr>
					<s:iterator value="userBuyInfoDTOList">
						<tr>
							<td><s:property value="id" /></td>
							<td><s:property value="totalPrice" /></td>
							<td><s:property value="totalCount" /></td>
							<td><s:property value="userName" /></td>
							<td><s:property value="pay" /></td>
							<td><s:property value="insert_date" /></td>
							<td><s:property value="delete_date" /></td>
						</tr>
					</s:iterator>
				</table>
				<s:form action="UserBuyListDeleteConfirmAction">
					<s:submit value="削除" />
				</s:form>
			</s:elseif>
			<div>
				<p>
					管理者ページに戻る場合は<a href='<s:url action="AdminAction" />'>こちら</a>
				</p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>