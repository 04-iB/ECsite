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
<title>お問い合わせ一覧</title>
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
			<p>inquiryList</p>
		</div>

		<div>
			<s:if test="inquiryInfoDTOList == null">
				<h3>お問い合わせ情報はありません。</h3>
			</s:if>
			<s:elseif test="message == null">
				<h3>お問い合わせ情報は以下になります。</h3>
				<table border="1">
					<tr>
						<th>名前</th>
						<th>メールアドレス</th>
						<th>お問い合わせの種類</th>
						<th>内容</th>
						<th>登録日</th>
					</tr>
					<s:iterator value="inquiryInfoDTOList">
						<tr>
							<td><s:property value="name" /></td>
							<td><s:property value="address" /></td>
							<td><s:property value="qtype" /></td>
							<td><s:property value="body" /></td>
							<td><s:property value="insert_date" /></td>
						</tr>
					</s:iterator>
					<s:form action="InquiryListDeleteConfirmAction">
						<s:submit value="一括削除" />
					</s:form>
				</table>
			</s:elseif>
		</div>
		<div>
			<p>
				管理者画面へ戻る場合は <a href='<s:url action="AdminAction"/>'>こちら</a>
			</p>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>