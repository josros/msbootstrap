package @tld@.@subdomain@.@scope@.@productname@.@msname@.up.rest;

import @tld@.@subdomain@.@scope@.@productname@.@msname@.up.def.UpDef;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/@scope@/@productname@-api/v1/up")
public class UpRC implements UpDef {

    @Override
    public ResponseEntity<String> getUp() {
        return ResponseEntity.ok("Server is up");
    }

}
