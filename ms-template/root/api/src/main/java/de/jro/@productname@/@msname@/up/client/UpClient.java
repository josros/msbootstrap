package de.jro.@productname@.@msname@.up.client;

import de.jro.@productname@.@msname@.up.def.UpDef;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(path = "/api/public/up", name = "myservice")
public interface UpClient extends UpDef {
}
