package @tld@.@subdomain@.@scope@.@productname@.@msname@.up.client;

import @tld@.@subdomain@.@scope@.@productname@.@msname@.up.def.UpDef;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(path = "/@scope@/@productname@-api/v1", name = "@msname@")
public interface UpClient extends UpDef {
}
