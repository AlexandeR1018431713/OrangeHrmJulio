#Proyecto de pruebas y cargado en Github
#27/01/2020
#Alexander Tuta
Feature: Yo como usuario quiero validar el login

    @HU001 @Regresion
    Scenario Outline: Login exitoso
	    Given open the browser
        When the user fill out user <userName> password <password>
        Then the user validate dashboard <user>

            Examples:
                | userName | password |
                | Admin    | admin123 |