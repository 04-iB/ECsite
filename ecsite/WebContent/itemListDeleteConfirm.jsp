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
<title>商品一覧削除確認</title>
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
			<p>itemListDeleteConfirm</p>
		</div>
		<div>
			<h3>全ての商品を削除します。よろしいですか？</h3>
			<s:form action="ItemListDeleteConfirmAction">
				<table>

					<tr>
						<td><input type="button" value="キャンセル"
							onclick="submitAction('ItemListAction')" /></td>
						<td><input type="button" value="ＯＫ"
							onclick="submitAction('ItemListDeleteCompleteAction')" /></td>
					</tr>
				</table>
			</s:form>


		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>