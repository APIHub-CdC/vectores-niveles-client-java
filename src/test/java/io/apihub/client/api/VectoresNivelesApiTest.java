package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.api.VectoresNivelesApi;
import io.apihub.client.model.Domicilio;
import io.apihub.client.model.Persona;
import io.apihub.client.model.Respuesta;
import io.apihub.client.model.Input;
import io.apihub.client.model.Input.TipoContratoEnum;
import io.apihub.client.model.Input.TipoNegocioEnum;
import io.apihub.client.model.Domicilio.EstadoEnum;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;


/**
 * API tests for VectoresNivelesApi
 */
public class VectoresNivelesApiTest {

    private final VectoresNivelesApi api = new VectoresNivelesApi();
    private ApiClient apiClient;
    
    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
        
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void VectoresNivelesTest() {
        String xApiKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        String username = "XXXXXXXXXX";
        String password = "XXXXXXXXXX";
        
        Input request = new Input();
        request.setTipoContrato(TipoContratoEnum.LC);
        request.setTipoNegocio(TipoNegocioEnum._45);

        Persona body = new Persona();
        body.setPrimerNombre("XXXXXXXXXX");
        body.segundoNombre(null);
        body.setApellidoPaterno("XXXXXXXXXX");
        body.setApellidoMaterno("XXXXXXXXXX");
        body.setFechaNacimiento("YYYY-MM-DD");
        body.setRfc("XXXXXXXXXX");
        body.setCurp("XXXXXXXXXXXXXXXXXXXX");

        Domicilio dom = new Domicilio();
        dom.setDireccion("XXXXXXXXXX XX");
        dom.setColonia("XXXXXXXXXX");
        dom.setCiudad(null);
        dom.codigoPostal("XXXXX");
        dom.setMunicipio("XX XXXXXXXXXX");
        dom.setEstado(EstadoEnum.JAL);
        body.setDomicilio(dom);

        request.setPersona(body);
        
        Respuesta response;
        try {
            response = api.getVectoresNiveles(xApiKey, username, password, request);
            System.out.println(response.toString());
        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
    
}
