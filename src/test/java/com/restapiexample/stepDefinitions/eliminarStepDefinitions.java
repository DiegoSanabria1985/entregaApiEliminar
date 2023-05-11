package com.restapiexample.stepDefinitions;

import com.restapiexample.model.eliminar;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class eliminarStepDefinitions {

    @Cuando("^envia la siguiente informacion de usuario al servicio \"([^\"]*)\"$")
    public void enviaLaSiguienteInformacionDeUsuarioAlServicio(String url, List<eliminar> litaEliminar) {

        String cuerpo="{\n" +
                "    \"status\": \""+ litaEliminar.get(0).getStatus()+"\",\n" +
                "    \"message\": \""+ litaEliminar.get(0).getMessage()+"\"\n" +
                "}";
        SerenityRest.given().baseUri(url).header("Content-Encoding","application/json").body(cuerpo).post();
    }

    @Entonces("^el usuario valida el codigo de estatus sea (\\d+)$")
    public void elUsuarioValidaElCodigoDeEstatusSea(int status) {
        SerenityRest.lastResponse()
                .then().statusCode(status);

    }

}
