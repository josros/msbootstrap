package de.jro.@productname@.@msname@.up.rest;

import de.jro.@productname@.@msname@.up.def.UpDef;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/public/up")
public class UpRC implements UpDef {

    @Override
    public ResponseEntity<String> getUp() {
        return ResponseEntity.ok("Server is up");
    }

}
