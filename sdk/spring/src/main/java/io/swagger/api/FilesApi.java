package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

@Api(value = "files", description = "the files API")
public interface FilesApi {

    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "File", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/files/{fileID}",
        method = RequestMethod.GET)
    ResponseEntity<Object> get(@ApiParam(value = "ID of the file.",required=true ) @PathVariable("fileID") String fileID);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "File", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/files",
        method = RequestMethod.GET)
    ResponseEntity<Object> list(@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "File", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    @RequestMapping(value = "/files",
        method = RequestMethod.POST)
    ResponseEntity<Object> postFileData(@ApiParam(value = "Filename of the file.") @RequestParam(value = "filename", required = false) String filename);

}
