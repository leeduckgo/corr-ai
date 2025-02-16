package corr.ai.module.system.api.mail;

import corr.ai.framework.common.pojo.CommonResult;

import corr.ai.module.system.enums.ApiConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(name = ApiConstants.NAME)
@Tag(name = "RPC 服务 - 邮箱验证码")
public interface EmailCodeApi {

    String PREFIX = ApiConstants.PREFIX + "/oauth2/email/code";

//    @PostMapping(PREFIX + "/send")
//    @Operation(summary = "创建邮箱验证码，并进行发送")
//    CommonResult<Boolean> sendSmsCode(@Valid @RequestBody SmsCodeSendReqDTO reqDTO);
//
//    @PutMapping(PREFIX + "/use")
//    @Operation(summary = "验证邮箱验证码，并进行使用")
//    CommonResult<Boolean> useSmsCode(@Valid @RequestBody SmsCodeUseReqDTO reqDTO);
//
//    @GetMapping(PREFIX + "/validate")
//    @Operation(summary = "检查验证码是否有效")
//    CommonResult<Boolean> validateSmsCode(@Valid @RequestBody SmsCodeValidateReqDTO reqDTO);

}
