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
<title>商品検索画面</title>
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
			<p>itemSearch</p>
		</div>
		<div>
			<h3>商品名を入力してください。</h3>
			<s:form action="ItemSearchCompleteAction">
				<tr>
					<td><label>商品名:</label></td>
					<td><input type="text" name="search" value="" /></td>
				</tr>
				<s:submit value="検索" />
			</s:form>
			<p>
				商品一覧に戻る場合は<a href='<s:url action="ItemSelectAction" />'>こちら</a>
			</p>
			<p>
				Homeに戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
			</p>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>