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
<title>お問い合わせ送信完了</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">

</head>

<body>

	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>InquiryComplete</p>
		</div>
		<div>
			<h3>お問い合わせの送信が完了しました。</h3>
			<table>
				<s:form action="InquiryCompleteAction">
					<tr id="box">
						<td><label>名前:</label></td>
						<td><s:property value="name" escape="false" /></td>
					</tr>
					<tr id="box">
						<td><label>メールアドレス:</label></td>
						<td><s:property value="address" escape="false" /></td>
					</tr>
					<tr>
						<td><label>お問い合わせの種類:</label></td>
						<td><s:property value="qtype" escape="false" /></td>
					</tr>
					<tr>
						<td><label>お問い合わせ内容:</label></td>
						<td><s:property value="body" escape="false" /></td>
					</tr>
				</s:form>
			</table>
			<div>
				<p>
					ホームに戻る場合は <a href='<s:url action="GoHomeAction"/>'>こちら</a>
				</p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>
