package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
public interface WebhookApi {

    @Operation(tags = {"internal"}, description = "Webhook endpoint")
    @ApiResponses(
            value = {
                    @ApiResponse(description = "success message",
                            responseCode = "200",
                            content = @Content(schema = @Schema(example = "running")))
            }

    )
    @PostMapping(path = "/webhook", produces = "text/plain")
    String webhook(Webhook object);

}
