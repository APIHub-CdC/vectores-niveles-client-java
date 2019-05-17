package io.apihub.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.ApiResponse;
import io.apihub.client.Configuration;
import io.apihub.client.Pair;
import io.apihub.client.ProgressRequestBody;
import io.apihub.client.ProgressResponseBody;
import io.apihub.client.model.Input;
import io.apihub.client.model.Respuesta;

public class VectoresNivelesApi {
	private ApiClient apiClient;

	public VectoresNivelesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public VectoresNivelesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call vectoresNivelesCall(String xApiKey, String username, String password, Input request,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = request;

		String localVarPath = "/v1/vectores/niveles";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call vectoresNivelesValidateBeforeCall(String xApiKey, String username, String password,
			Input request) throws ApiException {

		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling vectoresNivelesCall(Async)");
		}

		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling vectoresNivelesCall(Async)");
		}

		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling vectoresNivelesCall(Async)");
		}

		if (request == null) {
			throw new ApiException("Missing the required parameter 'body' when calling vectoresNivelesCall(Async)");
		}

		okhttp3.Call call = vectoresNivelesCall(xApiKey, username, password, request, null, null);
		return call;

	}

	public Respuesta getVectoresNiveles(String xApiKey, String username, String password, Input request)
			throws ApiException {
		ApiResponse<Respuesta> resp = getVectoresNivelesWithHttpInfo(xApiKey, username, password, request);
		return resp.getData();
	}

	public ApiResponse<Respuesta> getVectoresNivelesWithHttpInfo(String xApiKey, String username, String password,
			Input request) throws ApiException {
		okhttp3.Call call = vectoresNivelesValidateBeforeCall(xApiKey, username, password, request);
		Type localVarReturnType = new TypeToken<Respuesta>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}
}
