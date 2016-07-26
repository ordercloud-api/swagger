package io.swagger.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

@Controller
public class FilesApiController implements FilesApi {

    public ResponseEntity<Object> get(@ApiParam(value = "ID of the file.",required=true ) @PathVariable("fileID") String fileID) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> list(@ApiParam(value = "Page of results to return. Default: 1") @RequestParam(value = "page", required = false) Integer page,
        @ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> postFileData(@ApiParam(value = "Filename of the file.") @RequestParam(value = "filename", required = false) String filename) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
