package service;

import dto.ResponseDto;

public class SonarQubeImpl implements SonarQube{
    @Override
    public ResponseDto testByEnv(String env) {
        return new ResponseDto("VALID");
    }
}
