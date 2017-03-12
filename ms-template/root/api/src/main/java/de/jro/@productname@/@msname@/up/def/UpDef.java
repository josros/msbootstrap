package de.jro.@productname@.@msname@.up.def;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UpDef {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getUp();

}
