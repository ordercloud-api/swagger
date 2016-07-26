package io.swagger.api.factories;

import io.swagger.api.FilesApiService;
import io.swagger.api.impl.FilesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class FilesApiServiceFactory {
    private final static FilesApiService service = new FilesApiServiceImpl();

    public static FilesApiService getFilesApi() {
        return service;
    }
}
