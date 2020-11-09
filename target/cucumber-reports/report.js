$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/hsbc_01.feature");
formatter.feature({
  "line": 2,
  "name": "HSBC products and options",
  "description": "",
  "id": "hsbc-products-and-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Webpage"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "Common steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is located at the HSBC page",
  "keyword": "Given "
});
formatter.match({
  "location": "hsbcSD.the_user_is_located_at_the_HSBC_page()"
});
formatter.result({
  "duration": 8693774100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Cuentas y Tarjetas",
  "description": "",
  "id": "hsbc-products-and-options;cuentas-y-tarjetas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Nomina"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the user clicks on Cuentas y Tarjetas",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user selects Conoce Nomina HSBC",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user clicks on Solicita tu Nomina",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the user clicks on No eres cliente aun",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user clicks on He leido y acepto...",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user enters the following info",
  "rows": [
    {
      "cells": [
        "Nombre",
        "Apellidos",
        "CorreoE",
        "Mobile"
      ],
      "line": 15
    },
    {
      "cells": [
        "Alberto",
        "Estrada Mendoza",
        "sergioem@mail.com",
        "34499046"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user clicks on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "a message alert is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "hsbcSD.the_user_clicks_on_Cuentas_y_Tarjetas()"
});
formatter.result({
  "duration": 1185021400,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.the_user_selects_Conoce_N_mina_HSBC()"
});
formatter.result({
  "duration": 3863693600,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.the_user_clicks_on_Solicita_tu_N_mina()"
});
formatter.result({
  "duration": 1784246500,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.the_user_clicks_on_No_eres_cliente_a_n()"
});
formatter.result({
  "duration": 5918379200,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.the_user_clicks_on_He_le_do_y_acepto()"
});
formatter.result({
  "duration": 591468600,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.the_user_enters_the_following_info(DataTable)"
});
formatter.result({
  "duration": 5612661600,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.continue_button_is_displayed()"
});
formatter.result({
  "duration": 104895500,
  "status": "passed"
});
formatter.match({
  "location": "hsbcSD.a_message_alert_is_displayed()"
});
formatter.result({
  "duration": 846624900,
  "status": "passed"
});
});