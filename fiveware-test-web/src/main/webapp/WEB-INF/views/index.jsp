<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Fiveware Test</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="resources/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/jquery.min.js"></script>
</head>
<body>    
    <div class="container">
    	<h1>Cadastro de Segurado</h1>
    	<form id="formcadastro" action="person/save" method="post">
    	   <div class="form-group">
			    <label for="nome">Name:</label>
			    <input type="text" class="form-control" id="name" name="name" placeholder=" Name">
		   </div>
		   <div class="form-group">
			    <label for="lastName">Last Name:</label>
			    <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
		   </div>
		    <div class="form-group">
			    <label for="insurancesType">Selecione o Sexo</label>
			    <select class="form-control" id="genresType" name="genre">
			     <c:forEach items="${genres}" var="genre">
			     	<option value="${genre.initials}">${genre.type}</option>
			     </c:forEach>			      			      
			    </select>
		   </div>
		    <div class="form-group">
			    <label for="insurancesType">Selecione o Tipo Seguro</label>
			    <select class="form-control" id="insurancesType" name="insuranceType">
			     <c:forEach items="${allInsurances}" var="insuranceType">
			     	<option value="${insuranceType.initials}">${department.type}</option>
			     </c:forEach>			      			      
			    </select>
		   </div>
		   <div class="form-check">
			    <label class="form-check-label">
			      <input type="radio" name="ageGroup" class="form-check-input" value="21 a 30">
			        21 a 30 anos
			    </label>
  			</div>
  			<div class="form-check">
			    <label class="form-check-label">
			      <input type="radio" name="ageGroup" class="form-check-input" value="31 a 40">
			         31 a 40  anos
			    </label>
  			</div>
  			<div class="form-check">
			    <label class="form-check-label">
			      <input type="radio" name="ageGroup" class="form-check-input" value="41 a 50">
			         41 a 50  anos
			    </label>
  			</div>
  			<div class="form-check">
			    <label class="form-check-label">
			      <input type="radio" name="ageGroup" class="form-check-input" value="51 a 60">
			         51 a 60  anos
			    </label>
  			</div>
  			
  			<div class="form-check">
			    <label class="form-check-label">
			      <input type="checkbox" name="termOfAccept" class="form-check-input" value="accepted">
			        Declaro que aceito os termos do contrato!
			    </label>
  			</div>
  			<button type="button" id="btnCadastrar" class="btn btn-primary">Cadastrar</button>		   
    	</form>
    </div>

	<script type="text/javascript">
		$(document).ready(function(){
			$("#btnCadastrar").click(function(event) {
				event.preventDefault();
				var url = $("#formcadastro").attr('action');
				$("#btnCadastro").prop("disabled", true);

				$.post(url, {
					name : $('#name').val(),
					lastName : $('#lastName').val(),
					insuranceType : $('#insuranceType').val(),
					ageGroup : $('input[name="ageGroup"]:checked').val(),
					genre : $('input[name="genre"]:checked').val(),
					termOfAccept : $('input[name="termOfAccept"]:checked').map(function () {return this.value;}).get().join(",")
					
				}).complete(function() {
					$("#btnCadastrar").prop("disabled", false);
				});
			});
		});
	</script>
</body>
</html>