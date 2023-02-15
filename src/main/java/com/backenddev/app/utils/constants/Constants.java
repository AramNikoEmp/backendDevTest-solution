package com.backenddev.app.utils.constants;

public final class Constants {

	private Constants() {

	}

	/* CONTROLLER ENDPOINTS */
	public static final String SIMILARID_ENDPOINT = "/product/{id}/similarProd";

	/* ERROR */
	public static final String GETPRODUCT_ERROR = "There was a problem getting the product";

	/* RESTTEMPLATE */
	public static final String LOCALHOST_PROD_TEMPLATE = "http://localhost:3001/product";
	public static final String LOCALHOST_PROD_ID_TEMPLATE = LOCALHOST_PROD_TEMPLATE + "/{productId}";
	public static final String LOCALHOST_PROD_SIMILARID_TEMPLATE = LOCALHOST_PROD_TEMPLATE + "/{productId}/similarids";

}
