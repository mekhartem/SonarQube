package service;

import dto.ResponseDto;

public interface SonarQube {

    ResponseDto testByEnv(String env);

}
