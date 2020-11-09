@Webpage
Feature: HSBC products and options

Background: Common steps
 Given the user is located at the HSBC page
 
@Nomina
Scenario: Cuentas y Tarjetas
 When the user clicks on Cuentas y Tarjetas
 And the user selects Conoce Nomina HSBC
 And the user clicks on Solicita tu Nomina
 And the user clicks on No eres cliente aun
 And the user clicks on He leido y acepto...
 And the user enters the following info
 		|Nombre		|Apellidos				|CorreoE						|Mobile 			|
 		|Alberto	|Estrada Mendoza	|sergioem@mail.com	|34499046			|
 And the user clicks on Continue button
 Then a message alert is displayed
 
 