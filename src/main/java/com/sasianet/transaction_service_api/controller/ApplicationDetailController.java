package com.sasianet.transaction_service_api.controller;

import com.sasianet.transaction_service_api.service.ApplicationDetailService;
import com.sasianet.transaction_service_api.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("api/v2/payment")
public class ApplicationDetailController {

    @Autowired
    private ApplicationDetailService applicationDetailService;

    @GetMapping(path = "validateRefNo",params = "accountId")
    //@GetMapping(path = "validateRefNo/{accountId}")
    //public ResponseEntity<StandardResponse> checkFacilityAvailability(@PathVariable(value = "accountId") String financeNo){
    public ResponseEntity<StandardResponse> checkFacilityAvailability(@RequestParam (value = "accountId") String financeNo){

        String message="";
        message=applicationDetailService.checkAvailibility(financeNo);
        return new ResponseEntity<StandardResponse>(new StandardResponse(new Date(),0,"Valid reference found",message), HttpStatus.OK);
    }
}
