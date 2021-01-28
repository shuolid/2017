package com.example.demo.apiModel;

import lombok.Data;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name="return")
public class Return {
    private String resultCode;
    private String resultMessage;
}
