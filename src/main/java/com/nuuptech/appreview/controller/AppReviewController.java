package com.nuuptech.appreview.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/review"})
public class AppReviewController {

    @Value( "${app.mensaje}" )
    private String mensaje;

    @RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    @ResponseBody
    public ResponseEntity<String> getMensaje() {
        return new ResponseEntity<>(mensaje, new HttpHeaders(), HttpStatus.OK);
    }

}
