<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html ng-app="scmApp" >
<head>
	<title>Calendario</title>
 <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.13/angular.js"></script>
    <script src="//angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.13.0.js"></script>
	<link rel="stylesheet" href="resources/bower_components/angular-ui-grid/ui-grid.css" />
  	
  	<script src="resources/bower_components/angular-ui-grid/ui-grid.js"></script>

<script src="resources/js/app.js"></script>
<script src="resources/js/controllers.js"></script>

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled and minified CSS -->

</head>
  <body >

<style>
  .full button span {
    background-color: limegreen;
    border-radius: 32px;
    color: black;
  }
  .partially button span {
    background-color: orange;
    border-radius: 32px;
    color: black;
  }
  .myGrid {
    width: 500px;
    height: 250px;
  }
  .parentContainer {
  	 overflow: hidden;
  }
  .childRight {
  	 float: right;
  	 width:70%
  }
  .childLeft {
  	 overflow: hidden;
  	 display:inline-block;
  	  min-height:290px;
  	  width:30%
  }
</style>
 <tabset>
    <tab heading="Calendario">

<div ng-controller="CalendarShower" class="parentContainer" >

    <h4>Calendario</h4>
<div><input   value="Agregar Cita" name="Agregar Cita" title="Agregar Cita" type="button" ng-click="showAddDateModal(dt)" >
</input >
</div>
    <div class="childLeft">
      <datepicker ng-model="dt" min-date="minDate" show-weeks="true" class="well well-sm" custom-class="getDayClass(date, mode)"></datepicker>
    </div>
    
<div class="childRight">
  <div ui-grid="{ data: myData }" class="myGrid"></div>
</div>
  

</div>
</tab>
    <tab heading="Pacientes">
    </tab>
  </body>
</html>
