<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto Triangulo</title>
</head>
<body>

<h2>Programa para calcular Quadrados , descobrir se é triangulo e o tipo , e se é uma Reta</h2>
<h3>VALOR NULO É IGUAL A == 0 (CAMPOS OBRIGATÓRIOS)</h3>
<form method="post" action="GGOProjeto">
	<div class="mb-4 col-4">
	Primeiro Valor
	<input type="text" name="val1" class="form-control" required="required">
	
	</div>
	<div class="mb-4 col-4">
	Segundo Valor
	<input type="text" name="val2" id="valor1" class="form-control" required="required">
	</div>
	
	<div class="mb-4 col-4">
	Terceiro Valor
	<input type="text" name="val3" id="valor1" class="form-control"required="required" >
	</div>
	
	<button type="reset" class="btn btn-secondary">Limpar</button>
	<button type="submit" class="btn btn-secondary">Calculo</button>
	</form>
</div>	
</body>
</html>