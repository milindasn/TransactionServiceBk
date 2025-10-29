package com.sasianet.transaction_service_api.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandardResponse {
    private Date timeStamp;
    private int  responseStatus;
    private String responseStatusDesc;
    private  Object response;


}
