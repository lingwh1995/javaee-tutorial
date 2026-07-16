package org.bluebridge.service;
import org.bluebridge.domain.dto.UserLoginDTO;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * 用户服务接口
 *
 * @author lingwh
 * @date 2025/11/22 17:25
 */
public interface UserService {

    boolean login(UserLoginDTO userLoginDTO) throws NoSuchAlgorithmException, InvalidKeySpecException;
}
